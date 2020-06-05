package Simulador;

public class Servico {
    private int duracaoAtendimento;  //Duração do serviço gerado
    private int tempoDeFila; //Tempo que o serviço espera na fila
    private int tempoTotalAtendimento; // Tempo total de espera na fila + tempo de desenvolvimento
	
    
//    Construtor
    public Servico(int duracaoAtendimento, int tempoDeFila, int tempoTotalAtendimento) {
		super();
		this.duracaoAtendimento = duracaoAtendimento;
		this.tempoDeFila = tempoDeFila;
		this.tempoTotalAtendimento = tempoTotalAtendimento;
	}
//    gets e sets
    public int getDuracaoAtendimento() {
		return duracaoAtendimento;
	}
	public void setDuracaoAtendimento(int duracaoAtendimento) {
		this.duracaoAtendimento = duracaoAtendimento;
	}
	public int getTempoDeFila() {
		return tempoDeFila;
	}
	public void setTempoDeFila(int tempoDeFila) {
		this.tempoDeFila = tempoDeFila;
	}
	public int getTempoTotalAtendimento() {
		return tempoTotalAtendimento;
	}
	public void setTempoTotalAtendimento(int tempoTotalAtendimento) {
		this.tempoTotalAtendimento = tempoTotalAtendimento;
	}
    
    
    
}
