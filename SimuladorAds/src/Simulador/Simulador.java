package Simulador;


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
   //Arraylist para desenvolvedores
	 private ArrayList<Desenvolvedor> ListaDesenvolvedores; 
   //Lista de desenvolvedores ocupados
	 private ArrayList<Desenvolvedor> desenvolvedoresOcupados; 
	 
	 //Construtor do simulador
	 public Simulador(int[] demandas, 
			          int[] duracaoDeAtendimentos,
			          ArrayList<Desenvolvedor> listaDesenvolverdores) {
		super();
		this.demandas = demandas;
		this.duracaoDeAtendimentos = duracaoDeAtendimentos;
		ListaDesenvolvedores = listaDesenvolverdores;
	} 

	public void iniciaSimulador() {
		//código
		//Seta o tempo de execucao do simulador em segundos. Valor de uma semana.
		int tempoDeExecucao = 604800;
		//Dias da semana. 1-7
		int dia = 1;
		//Hora do dia
		int horaDoDia = 0;
		//Controlador do array com as demandas; 
		int idxDemandaAtual = 0;
		int demandaAtual = this.demandas[idxDemandaAtual];
		int tempoAtendimento = this.duracaoDeAtendimentos[idxDemandaAtual];
		
		//Looping principal do simulador
		while(this.tempo < tempoDeExecucao) {
			
			//Teste se esta na hora de entrar a demanda
			if(!(this.tempo < demandaAtual)) {
              
				//Gera uma demanda de servico
				this.filaDeAtendimento.add(new Servico(0));
				idxDemandaAtual += 1;
				demandaAtual = this.demandas[idxDemandaAtual];
				 
			}
			//Teste se há demanda na fila e se está em horoário comercial
			if(this.filaDeAtendimento.size() > 0 && 8 < horaDoDia && horaDoDia > 18 ) {
				
				//Testa se há desenvolvedores livres
				if(this.ListaDesenvolvedores.size() > 0) {
					
				  //Executa para cada desenvolvedor livre
				  this.ListaDesenvolvedores.forEach((dev) -> {
					  //Testa se ainda tem servicos na lista 
					  if(this.filaDeAtendimento.size() > 0) {
						 //Gera um atendimento e coloca na lista de desenvolvimento
						 this.listaDeDesenvolvimento.add(new Atendimento(this.filaDeAtendimento.remove(), 
								                                         dev, 
								                                         tempoAtendimento,
								                                         horaDoDia,
								                                         dia ));
						 
						 //Remove o desenvolvedor da lista de livres e coloca na lista de ocupados
						 this.desenvolvedoresOcupados.add(dev);
						 this.ListaDesenvolvedores.remove(dev); 
					  }
				  });
				}
			}
			
		}
			
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

	
	 
	 

	 
	 
}
