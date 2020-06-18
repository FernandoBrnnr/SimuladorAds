package Simulador;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Simulador {
     
	//controlador de tempo
	 private int tempo = 0; 
	//array que recebe o tempo das demandas
	 private int[] demandas; 
	//array que recebe o tempo de duração dos chamados
     private int[] duracaoDeAtendimentos; 
   //fila de chamados em espera
     private Queue<Servico> filaDeAtendimento = new LinkedList<Servico>(); 
   //ArrayList pra lista de chamados em desenvolvimento
     private ArrayList<Atendimento> listaDeDesenvolvimento = new ArrayList<Atendimento>();
     private ArrayList<Atendimento> retirarAtendiento = new ArrayList<Atendimento>();
   //Arraylist para desenvolvedores
	 private ArrayList<Desenvolvedor> ListaDesenvolvedores = new ArrayList<Desenvolvedor>();; 
   //Lista de desenvolvedores ocupados
	 private ArrayList<Desenvolvedor> desenvolvedoresOcupados = new ArrayList<Desenvolvedor>(); 
	 //Lista com os atendimento encerrados
	 private ArrayList<AtendimentoFinalizado> atendimentosEncerrados = new ArrayList<AtendimentoFinalizado>(); 
	 //Controla a hora
	 private float horaDoDia = 0;
	 //Controla o dia
	 private int dia = 1;
	
	 
	 
	 //Construtor do simulador
	 public Simulador(int[] demandas, 
			          int[] duracaoDeAtendimentos,
			          ArrayList<Desenvolvedor> listaDesenvolverdores) {
		super();
		this.demandas = demandas;
		this.duracaoDeAtendimentos = duracaoDeAtendimentos;
		ListaDesenvolvedores = listaDesenvolverdores;
	} 
	 
	 
    public void processaAtendimento(Atendimento atendimento) {
    	//Testa se o tempo de atendimento acabou
		if(atendimento.getTempoDecorrido() >= atendimento.getTempoDeAtendimento()) {
			
			
			//Calcula o tempo total do atendimento. Tempo de desenvolvimento + tempo de fila 
			int tempoTotalDoAtendimento = atendimento.getTempoDeAtendimento() + atendimento.getServico().getTempoDeFila();
			
			
			//Cria uma instancia do servico finalizado
	 		int servicoID = atendimento.getServico().getID();
	 		int desenvolvedorID = atendimento.getDesenvolvedor().getId();
 	 		int tempoFila = atendimento.getServico().getTempoDeFila();
	 		AtendimentoFinalizado atendimentoFinalizado = new AtendimentoFinalizado(servicoID,
	 				                                                                desenvolvedorID, 
	 				                                                                tempoTotalDoAtendimento,
	 				                                                                tempoFila,
	 				                                                                horaDoDia);
			this.atendimentosEncerrados.add(atendimentoFinalizado);
//			this.listaDeDesenvolvimento.remove(atendimento); 
			this.retirarAtendiento.add(atendimento);
			//Tira o desenvolvedor da lista de ocupados e coloca na lista de livres
			this.desenvolvedoresOcupados.remove(atendimento.getDesenvolvedor());
			this.ListaDesenvolvedores.add(atendimento.getDesenvolvedor()); 
			
		//se o atendimento não acabou
		}else {
			
			//Aumenta o tempo de atendimento
			int TempoAtendimento = atendimento.getTempoDecorrido() + 1;
			atendimento.setTempoDecorrido(TempoAtendimento);
		}
	};
	
	public void addTempoDeFila(Servico servico){
	     
		int tempoDeFila = servico.getTempoDeFila() + 1;
		servico.setTempoDeFila(tempoDeFila);
	}
	
	
	public void geraAtendimento(Desenvolvedor dev){
		  //Testa se ainda tem servicos na lista 
		  if(this.filaDeAtendimento.size() > 0) {
			 //Gera um atendimento e coloca na lista de desenvolvimento
			 Servico servico = this.filaDeAtendimento.remove();
			 int tempoDeAtendimento = servico.getTempoDeAtendimento();
			 
			 this.listaDeDesenvolvimento.add(new Atendimento(servico, 
					                                         dev,
					                                         this.horaDoDia,
					                                         this.dia,
					                                         tempoDeAtendimento));
			 
			 //Remove o desenvolvedor da lista de livres e coloca na lista de ocupados
			 this.desenvolvedoresOcupados.add(dev);
			  
		  }
	  }
    

	public void iniciaSimulador() {
		//Seta o tempo de execucao do simulador em segundos. Valor de uma semana.
		int tempoDeExecucao = 2592000;
		
		
		//Controlador do array com as demandas; 
		int idxDemandaAtual = 0;
		int demandaAtual = this.demandas[idxDemandaAtual];
		int tempoDeAtendimento = this.duracaoDeAtendimentos[idxDemandaAtual];
		//Looping principal do simulador
		while(this.tempo < tempoDeExecucao) {
			//Teste se esta na hora de entrar a demanda
			if(this.tempo >= demandaAtual) {
				
				//Gera uma demanda de servico
				this.filaDeAtendimento.add(new Servico(0, tempoDeAtendimento, idxDemandaAtual));
//			    System.out.println(this.tempo);
				idxDemandaAtual += 1;
				demandaAtual = this.demandas[idxDemandaAtual];
				tempoDeAtendimento = this.duracaoDeAtendimentos[idxDemandaAtual];
				
				
			}
			//Teste se há demanda na fila e se está em horoário comercial
			if(this.filaDeAtendimento.size() > 0 && 8 <= this.horaDoDia && 18 > this.horaDoDia && this.dia < 6 ) {
				
				//Testa se há desenvolvedores livres
				if(this.ListaDesenvolvedores.size() > 0) {
					
				  //Executa para cada desenvolvedor livre
				  this.ListaDesenvolvedores.forEach( (dev) -> geraAtendimento(dev));
				  
				  this.ListaDesenvolvedores.removeAll(this.desenvolvedoresOcupados);
				}
				

				//Testa se tem servicos em desenvolvimento
				if(this.listaDeDesenvolvimento.size() > 0) {
					
					//Executa para cada atendimento sendo desenvolvido
					this.listaDeDesenvolvimento.forEach((atendimento) -> processaAtendimento(atendimento));
					
					this.listaDeDesenvolvimento.removeAll(this.retirarAtendiento);
					this.retirarAtendiento.removeAll(this.retirarAtendiento);
				}
					
			}
			//Testa se sobrou servicos na fila de atendimento
			if(this.filaDeAtendimento.size() > 0) {
			     
				//Add tempo de fila para cada servico que continua na fila
				this.filaDeAtendimento.forEach(servico -> addTempoDeFila(servico));
				
			}
            //Atualiza contador de tempo
			this.tempo++;
	
			//Atualiza a hora a cada 30 minutos e o dia.
			if(this.tempo > 0 && this.tempo % 1800 == 0)  {
				this.horaDoDia += 0.5; 
			}
			if(this.tempo > 0 && this.tempo % 86400 == 0) {
				if(this.dia == 7) {
					this.dia = 1;
				}else {
					this.dia++;
				}
				this.horaDoDia = 0; 
			}
		}
		
		geraCSV(this.atendimentosEncerrados);
		System.out.println("Fim!");
			
	}
    
//	 gets e sets
	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public int[] getDemandas() {
		return demandas;
	}

	public void setDemandas(int[] demandas) {
		this.demandas = demandas;
	}

	public int[] getDuracaoDeAtendimentos() {
		return duracaoDeAtendimentos;
	}

	public void setDuracaoDeAtendimentos(int[] duracaoDeAtendimentos) {
		this.duracaoDeAtendimentos = duracaoDeAtendimentos;
	}

	public Queue<Servico> getFilaDeAtendimento() {
		return filaDeAtendimento;
	}

	public void setFilaDeAtendimento(Queue<Servico> filaDeAtendimento) {
		this.filaDeAtendimento = filaDeAtendimento;
	}

	public void  geraCSV(ArrayList<AtendimentoFinalizado> atendimentosFinalizados) {
		
		FileWriter csvFile = null;
		
		try {
			csvFile = new FileWriter("C:\\Users\\Fernando\\Desktop\\arquivos\\Resultados\\6_dev_mudanças_3.csv");
			
			csvFile.append("Servico_id, Desenvolvedor_id, Tempo_Total, Tempo_de_fila");
			csvFile.append("\n");
			
			for(AtendimentoFinalizado atendimento : atendimentosFinalizados) {
				csvFile.append(String.valueOf(atendimento.getServicoID()));
				csvFile.append(","); 
				csvFile.append(String.valueOf(atendimento.getDesenvolvedorID()));
				csvFile.append(","); 
				csvFile.append(String.valueOf(atendimento.getTempoTotal()));
				csvFile.append(","); 
				csvFile.append(String.valueOf(atendimento.getTempoDeFila()));
//				csvFile.append(","); 
				csvFile.append("\n"); 
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				csvFile.flush();
				csvFile.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	 
	 

	 
	 
}
