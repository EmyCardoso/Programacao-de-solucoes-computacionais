package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3d {

	 public static void main(String[] args) {
	        int contador = 0; 

	        while (true) {
	            String input = JOptionPane.showInputDialog("Digite um número (0 para sair):");

	                 // Converte a entrada para um número   
	                int numero = Integer.parseInt(input); 

	                // Verifica se o número é 0
	                if (numero == 0) {
	                    break; // Sai do loop se o número for 0
	                }

	                // Verifica se o número está entre 100 e 200
	                if (numero >= 100 && numero <= 200) {
	                    contador++; // Incrementa o contador
	                }

	           
	        

	        // Exibe o total de números entre 100 e 200
	        JOptionPane.showMessageDialog(null, "Total de números entre 100 e 200 digitados: " + contador);
	    }
	}
}
