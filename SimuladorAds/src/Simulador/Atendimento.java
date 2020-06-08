package Simulador;

public class Atendimento {
	private Servico servico;
	private Desenvolvedor desenvolvedor;
	private int tempoAtendimento;
	private int tempoTotal;
	private int horaInicio;
	private int horaTermino; 
	private int dia;
	public Atendimento(Servico servico, 
			           Desenvolvedor desenvolvedor, 
			           int tempoAtendimento,
			           int horaInicio,
			           int dia) {
		super();
		this.servico = servico;
		this.desenvolvedor = desenvolvedor;
		this.tempoAtendimento = tempoAtendimento;
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
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(int horaTermino) {
		this.horaTermino = horaTermino;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	} 
	
	
	

}
