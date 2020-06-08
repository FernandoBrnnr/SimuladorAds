package Simulador;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    
	
//  função que inicia a lista de desenvolvedores
  public static ArrayList<Desenvolvedor> iniciaListaDeDesenvolvedores(){
	  ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
	  
	    for(int i = 0; i <= 5; i++) {
	    	desenvolvedores.add(new Desenvolvedor(true, 0, i));
	    }
	   return desenvolvedores;
   }
//  Função que lê um arquivo csv e retorna um array com dos dados. 
  public static int[] geraDados(String path,  int col) {
	  int[] dados = null;
	  return dados; 
  }
	
  
//  Função Main
  public static void main(String[] args) {
		//inicia lista de desenvolvedores
		ArrayList<Desenvolvedor> desenvolvedores = iniciaListaDeDesenvolvedores();
	   
//	   Listagem de is dos desenvolvedores.Só teste.
       for(Desenvolvedor dev : desenvolvedores) {
    	   System.out.println(dev.getId());
       }
		
		 
       
	}

}
