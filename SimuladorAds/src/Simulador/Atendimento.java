package Simulador;

public class Atendimento {
	private Servico servico;
	private Desenvolvedor desenvolvedor;
	private float horaInicio;
	private int dia;
	private int tempoDeAtendimento;
	private int tempoDecorrido = 0;
	
	
	public Atendimento(Servico servico, 
			           Desenvolvedor desenvolvedor,
			           float horaInicio,
			           int dia,
			           int tempoDeAtendimento) {
		super();
		this.servico = servico;
		this.desenvolvedor = desenvolvedor;
		this.horaInicio = horaInicio;
		this.dia = dia;
		this.tempoDeAtendimento = tempoDeAtendimento;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Desenvolvedor getDesenvolvedor() {
		return desenvolvedor;
	}
	public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}
	
	public float getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public void setHoraInicio(float horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public int getTempoDecorrido() {
		return tempoDecorrido;
	}
	public void setTempoDecorrido(int tempoDecorrido) {
		this.tempoDecorrido = tempoDecorrido;
	}
	public int getTempoDeAtendimento() {
		return tempoDeAtendimento;
	}
	public void setTempoDeAtendimento(int tempoDeAtendimento) {
		this.tempoDeAtendimento = tempoDeAtendimento;
	} 
	
	
	
	
	
	
	
	

}
