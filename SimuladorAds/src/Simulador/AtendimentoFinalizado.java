package Simulador;

public class AtendimentoFinalizado {
      private int servicoID;
      private int desenvolvedorID; 
      private int tempoTotal;
      private int tempoDeFila;
      private float horaTermino;
	public AtendimentoFinalizado(int servicoID, int desenvolvedorID, int tempoTotal, int tempoDeFila,
			                     float horaTermino) {
		
		super();
		this.servicoID = servicoID;
		this.desenvolvedorID = desenvolvedorID;
		this.tempoTotal = tempoTotal;
		this.tempoDeFila = tempoDeFila;
		this.horaTermino = horaTermino;
	}
	public int getServicoID() {
		return servicoID;
	}
	public void setServicoID(int servicoID) {
		this.servicoID = servicoID;
	}
	public int getDesenvolvedorID() {
		return desenvolvedorID;
	}
	public void setDesenvolvedorID(int desenvolvedorID) {
		this.desenvolvedorID = desenvolvedorID;
	}
	public int getTempoTotal() {
		return tempoTotal;
	}
	public void setTempoTotal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	public int getTempoDeFila() {
		return tempoDeFila;
	}
	public void setTempoDeFila(int tempoDeFila) {
		this.tempoDeFila = tempoDeFila;
	}
	public float getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(float horaTermino) {
		this.horaTermino = horaTermino;
	} 
      
	
      
} 
