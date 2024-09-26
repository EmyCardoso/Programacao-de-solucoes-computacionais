package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3j {

	public static void main(String[] args) {
       
		while (true) {
            String input = JOptionPane.showInputDialog("Digite um número");

              // Converte a entrada para um número
                int numero = Integer.parseInt(input); 

                // Verifica se o número é -999
                if (numero == -999) {
                   
                	// Sai do loop se o número for -999
                	break; 
                }

             
                System.out.println("Divisores de " + numero + ":");
                for (int i = 1; i <= Math.abs(numero); i++) {
                    if (numero % i == 0) {
                       
                    	System.out.println(i); 
                    }
                }

           
            }
        }
}
