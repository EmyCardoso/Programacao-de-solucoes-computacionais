package Pratica3;

public class Solucao3q {

	public static void main(String[] args) {
  
		        // Cabeçalho da tabela
		        System.out.println("Tabela de Conversão de Polegadas para Centímetros");
		        System.out.println("------------------------------------------------");
		        System.out.printf("%-12s %s%n", "Polegadas", "Centímetros");
		        System.out.println("------------------------------------------------");

		        // Loop para converter de polegadas para centímetros
		        for (int polegadas = 1; polegadas <= 20; polegadas++) {
		            double centimetros = polegadas * 2.54; // Conversão
		            System.out.printf("%-12d %.2f%n", polegadas, centimetros); // Impressão formatada
		        }
		    }
		}
	