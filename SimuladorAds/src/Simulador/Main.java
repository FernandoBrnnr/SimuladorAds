package Simulador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
	
//  função que inicia a lista de desenvolvedores
  public static Queue<Desenvolvedor> iniciaListaDeDesenvolvedores(){
	  Queue<Desenvolvedor> desenvolvedores = new LinkedList<Desenvolvedor>();
	   
	    for(int i = 0; i <= 5; i++) {
	    	desenvolvedores.add(new Desenvolvedor(true, 0, i));
	    }
	   return desenvolvedores;
   }
//  Função que lê um arquivo csv e retorna um array com dos dados. 
  public static int[] geraDados(String path) {
	  int[] dados = null;
	  //Lê o arquivo
	  File arquivoCSV = new File(path);
	     
      try{
          
          //cria um scanner para ler o arquivo
          Scanner leitor = new Scanner(arquivoCSV);
          
          //variavel que armazenara as linhas do arquivo
          String linhasDoArquivo = new String();
          //leitor.nextLine();  //ignora a primeira linha
          
          //percorre todo o arquivo
          while(leitor.hasNext()){
              
              //recebe cada linha do arquivo
              linhasDoArquivo = leitor.nextLine();
              
              //separa os campos entre as virgulas de cada linha
              String[] valoresEntreVirgulas = linhasDoArquivo.split(";");
              
              //imprime a coluna que quiser
              System.out.println(valoresEntreVirgulas[0] + " - ");
              
            
              //imprime todo o arquivo
              //System.out.println(linhasDoArquivo);
              
          }
      
      }catch(FileNotFoundException e){
          
      }
	  return dados; 
  }
	
  
//  Função Main
  public static void main(String[] args) {
		//inicia lista de desenvolvedores
		Queue<Desenvolvedor> desenvolvedores = iniciaListaDeDesenvolvedores();
	    
		
		
       
	}

}
