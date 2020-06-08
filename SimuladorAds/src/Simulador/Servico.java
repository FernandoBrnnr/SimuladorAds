package Simulador;

public class Servico {

    private int tempoDeFila; //Tempo que o serviço espera na fila
    
//    Construtor
    public Servico(int tempoDeFila) {
		super();
		this.tempoDeFila = tempoDeFila;
	}
//    gets e sets
    
	public int getTempoDeFila() {
		return tempoDeFila;
	}
	public void setTempoDeFila(int tempoDeFila) {
		this.tempoDeFila = tempoDeFila;
	}

    
    
}
