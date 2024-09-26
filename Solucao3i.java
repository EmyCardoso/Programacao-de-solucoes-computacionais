package Pratica3;

public class Solucao3i {

	 public static void main(String[] args) {
	        
		// Inicializa a soma como 0
		 int soma = 0; 

	   // Loop para imprimir os números de 1 a 100
	      for (int i = 1; i <= 100; i++) {
	            
	   // Imprime o número 	  
	      System.out.println(i); 
	   
	   // Adiciona o número à soma   
	      soma += i; 
	        }

	        // Imprime a soma total
	        System.out.println("A soma de todos os números de 1 a 100 é: " + soma);
	    }
	}
