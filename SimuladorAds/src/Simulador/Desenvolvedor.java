package Simulador;

public class Desenvolvedor {
    
	//Atributo para testar disponibilidade do servidor
	private boolean disponivel; 
	//Atributo pra controlar tempo de desenvolvimento
	private int tempoDesenvolvimento; 
    //ID do desenvolvedor 
	private int id; 
	
//	Construtor do servidor
	public Desenvolvedor(boolean disponivel, int tempoDesenvolvimento, int id) {
		super();
		this.disponivel = disponivel;
		this.tempoDesenvolvimento = tempoDesenvolvimento;
		this.id = id;
	}
    
	//Sets e gets
	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public int getTempoDesenvolvimento() {
		return tempoDesenvolvimento;
	}

	public void setTempoDesenvolvimento(int tempoDesenvolvimento) {
		this.tempoDesenvolvimento = tempoDesenvolvimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
