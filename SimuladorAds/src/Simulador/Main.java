package Simulador;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    
	
//  função que inicia a lista de desenvolvedores
  public static ArrayList<Desenvolvedor> iniciaListaDeDesenvolvedores(){
	  ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
	  
	    for(int i = 0; i < 5; i++) {
	    	System.out.println("teste");
	    	desenvolvedores.add(new Desenvolvedor(true, 0));
	    }
	   return desenvolvedores;
   }
	
	public static void main(String[] args) {
		//inicia lista de desenvolvedores
		ArrayList<Desenvolvedor> desenvolvedores = iniciaListaDeDesenvolvedores();
		
       
		
		 
       
	}

}
