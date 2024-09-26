package Pratica3;

public class Solucao3h {

	 public static void main(String[] args) {
	        
		// Inicializa o produto como 1
		 long produto = 1; 

	    // Loop para multiplicar os números de 120 a 300
	     for (int i = 120; i <= 300; i++) {
	         
	    // Multiplica o número atual ao produto	 
	    	 produto *= i; 
	        }

	    // Imprime o resultado final
	      System.out.println("O produto de todos os números de 120 a 300 é: " + produto);
	    }
	}

