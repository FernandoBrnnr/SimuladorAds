package Simulador;

public class Atendimento {
	private Servico servico;
	private Desenvolvedor desenvolvedor;
	private int tempoFinalAtendimento;
	private int tempoTotal;
	private float horaInicio;
	private float horaTermino; 
	private int dia;
	private int tempoAtendimento;
	public int getTempoFinalAtendimento() {
		return tempoFinalAtendimento;
	}
	public void setTempoFinalAtendimento(int tempoFinalAtendimento) {
		this.tempoFinalAtendimento = tempoFinalAtendimento;
	}
	public Atendimento(Servico servico, 
			           Desenvolvedor desenvolvedor, 
			           int tempoFinalAtendimento,
			           float horaInicio,
			           int dia) {
		super();
		this.servico = servico;
		this.desenvolvedor = desenvolvedor;
		this.tempoFinalAtendimento = tempoFinalAtendimento;
		this.horaInicio = horaInicio;
		this.dia = dia;
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
	public int getTempoAtendimento() {
		return tempoAtendimento;
	}
	public void setTempoAtendimento(int tempoAtendimento) {
		this.tempoAtendimento = tempoAtendimento;
	}
	public int getTempoTotal() {
		return tempoTotal;
	}
	public void setTempoTotal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	public float getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public float getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(float horaTermino) {
		this.horaTermino = horaTermino;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	} 
	
	
	

}
