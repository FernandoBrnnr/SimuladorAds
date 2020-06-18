package Simulador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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
  public static int[] geraDados(String path) {
	  int[] dados = new int[139]; 
	  //Lê o arquivo
	  File arquivoCSV = new File(path);
	  
      try{
          
          //cria um scanner para ler o arquivo
          Scanner leitor = new Scanner(arquivoCSV);
          //variavel que armazenara as linhas do arquivo
          String linhasDoArquivo = new String();
          
          //percorre todo o arquivo
          int j = 0;
          while(leitor.hasNext()){
        	  
              //recebe cada linha do arquivo
              linhasDoArquivo = leitor.nextLine();
              
              
              dados[j] = Integer.parseInt(linhasDoArquivo);
             
              j++;
          }

      
      }catch(FileNotFoundException e){
          
      }
	  return dados; 
  }
	
  public static void printID(Desenvolvedor dev) {
	  System.out.println(dev.getId());
  }
//  Função Main
  public static void main(String[] args) {
		//inicia lista de desenvolvedores
	    ArrayList<Desenvolvedor> desenvolvedores = iniciaListaDeDesenvolvedores();
	    
		int [] horaChamados = geraDados("C:\\Users\\Fernando\\Desktop\\arquivos\\tempos_abertura_segundos.csv");
		int [] duracaoAtendimento = geraDados("C:\\Users\\Fernando\\Desktop\\arquivos\\duracaoAtendimento.csv");
		
		
    	Simulador simulacao = new Simulador(horaChamados, duracaoAtendimento, desenvolvedores );

		simulacao.iniciaSimulador();
       
	}

}
