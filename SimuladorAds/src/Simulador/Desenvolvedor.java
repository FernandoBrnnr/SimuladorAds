package Simulador;

public class Desenvolvedor {
  
	private boolean disponivel; //Atributo para testar disponibilidade do servidor
	private int tempoDesenvolvimento; //Atributo pra controlar tempo de desenvolvimento
	
	
//	Construtor do servidor
	public Desenvolvedor(boolean disponivel, int tempoDesenvolvimento) {
		super();
		this.disponivel = disponivel;
		this.tempoDesenvolvimento = tempoDesenvolvimento;
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
	
	
	
	
}
