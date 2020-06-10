package Simulador;

public class Atendimento {
	private Servico servico;
	private Desenvolvedor desenvolvedor;
	private float horaInicio;
	private int dia;
	private int tempoFinalDeAtendimento;
	private int tempoDeAndamentoDoDesenvolvimento;
	
	
	public Atendimento(Servico servico, 
			           Desenvolvedor desenvolvedor,
			           float horaInicio,
			           int dia,
			           int tempoFinalDeAtendimento) {
		super();
		this.servico = servico;
		this.desenvolvedor = desenvolvedor;
		this.horaInicio = horaInicio;
		this.dia = dia;
		this.tempoFinalDeAtendimento = tempoFinalDeAtendimento;
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
	public int getTempoFinalDeAtendimento() {
		return tempoFinalDeAtendimento;
	}
	public void setTempoFinalDeAtendimento(int tempoFinalDeAtendimento) {
		this.tempoFinalDeAtendimento = tempoFinalDeAtendimento;
	}
	public void setHoraInicio(float horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getTempoDeAndamentoDoDesenvolvimento() {
		return tempoDeAndamentoDoDesenvolvimento;
	}
	public void setTempoDeAndamentoDoDesenvolvimento(int tempoDeAndamentoDoDesenvolvimento) {
		this.tempoDeAndamentoDoDesenvolvimento = tempoDeAndamentoDoDesenvolvimento;
	} 
	
	
	
	

}
