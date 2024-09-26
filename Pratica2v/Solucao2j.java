package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2j {

	   public static void main(String[] args) {
	        
		   // Leitura do número 
	        String valor = JOptionPane.showInputDialog("Digite um número:");

	        
	            // Conversão da String para número inteiro
	            int numero = Integer.parseInt(valor);

	            // Verifica se o número é divisível por 5
	            if (numero % 5 == 0) {
	                JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 5.");
	            } else {
	                JOptionPane.showMessageDialog(null, "O número " + numero + " não é divisível por 5.");
	            }

	        
	         
	        }
	    }
	
