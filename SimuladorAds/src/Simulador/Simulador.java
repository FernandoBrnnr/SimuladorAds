package Simulador;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Simulador {
  
	 private int tempo; //controlador de tempo
	 private int[] demandas; //array que recebe o tempo das demandas
     private int[] duracaoDeAtendimentos; //array que recebe o tempo de duração dos chamados
     private Queue<Servico> filaDeAtendimento = new LinkedList<Servico>(); //Arraylist pra fila de chamados em espera
     private ArrayList<Servico> listaDeDesenvolvimento = new ArrayList<Servico>(); //ArrayList pra lista de chamados em desenvolvimento
	 private ArrayList<Desenvolvedor> ListaDesenvolverdores; //Arraylist para desenvolvedores
	 
	 //Construtor do simulador
	 public Simulador(int tempo, int[] demandas, 
			          int[] duracaoDeAtendimentos,
			          ArrayList<Desenvolvedor> listaDesenvolverdores) {
		super();
		this.tempo = tempo;
		this.demandas = demandas;
		this.duracaoDeAtendimentos = duracaoDeAtendimentos;
		ListaDesenvolverdores = listaDesenvolverdores;
	} 

	 void iniciaSimulador() {
		//código
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

	public ArrayList<Servico> getListaDeDesenvolvimento() {
		return listaDeDesenvolvimento;
	}

	public void setListaDeDesenvolvimento(ArrayList<Servico> listaDeDesenvolvimento) {
		this.listaDeDesenvolvimento = listaDeDesenvolvimento;
	}

	public ArrayList<Desenvolvedor> getListaDesenvolverdores() {
		return ListaDesenvolverdores;
	}

	public void setListaDesenvolverdores(ArrayList<Desenvolvedor> listaDesenvolverdores) {
		ListaDesenvolverdores = listaDesenvolverdores;
	}
	 
	 

	 
	 
}
