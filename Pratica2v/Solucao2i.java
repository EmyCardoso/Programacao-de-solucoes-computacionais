package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2i {

	 public static void main(String[] args) {
	       
		 // Leitura do número 
	        String valor = JOptionPane.showInputDialog("Digite um número:");

	    
	            // Conversão da String para número inteiro
	            int numero = Integer.parseInt(valor);

	            // Verifica se o número é múltiplo de 3
	            if (numero % 3 == 0) {
	                JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de 3.");
	            } else {
	                JOptionPane.showMessageDialog(null, "O número " + numero + " não é múltiplo de 3.");
	            
	        }
	    }
}
