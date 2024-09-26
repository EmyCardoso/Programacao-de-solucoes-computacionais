package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2k {

	   public static void main(String[] args) {
	        
		   // Leitura do número através do JOptionPane
	        String valor = JOptionPane.showInputDialog("Digite um número:");

	        
	            // Conversão da String para número inteiro
	            int numero = Integer.parseInt(valor);

	            // Verifica se o número é divisível por 3 e por 7
	            boolean divisivelPor3 = (numero % 3 == 0);
	            boolean divisivelPor7 = (numero % 7 == 0);

	            // Exibe as mensagens apropriadas
	            if (divisivelPor3 && divisivelPor7) {
	                JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 3 e por 7.");
	            } else if (divisivelPor3) {
	                JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 3, mas não por 7.");
	            } else if (divisivelPor7) {
	                JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 7, mas não por 3.");
	            } else {
	                JOptionPane.showMessageDialog(null, "O número " + numero + " não é divisível por 3 nem por 7.");
	            }

	        
	
	        }
	    }
	
