package Simulador;

public class Servico {

    private int tempoDeFila; //Tempo que o serviço espera na fila
    private int tempoDeAtendimento;
    private int ID; 
//    Construtor
    public Servico(int tempoDeFila,int tempoDeAtendimento, int ID) {
		super();
		this.tempoDeFila = tempoDeFila;
		this.tempoDeAtendimento = tempoDeAtendimento;
		this.ID = ID;
	}
//    gets e sets
    
	public int getTempoDeFila() {
		return tempoDeFila;
	}
	public void setTempoDeFila(int tempoDeFila) {
		this.tempoDeFila = tempoDeFila;
	}

	public int getTempoDeAtendimento() {
		return tempoDeAtendimento;
	}

	public void setTempoDeAtendimento(int tempoDeAtendimento) {
		this.tempoDeAtendimento = tempoDeAtendimento;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	
    
    
}
