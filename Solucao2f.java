package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2f {

	 public static void main(String[] args) {
	        
		 // Leitura do número
	        String valor = JOptionPane.showInputDialog("Digite um número:");

	        
	            // Conversão da String para número
	            double numero = Double.parseDouble(valor);

	            // Verifica se o número é maior, igual ou menor que 20
	            if (numero > 20) {
	                JOptionPane.showMessageDialog(null, "O número " + numero + " é maior do que 20.");
	            } else if (numero == 20) {
	                JOptionPane.showMessageDialog(null, "O número é igual a 20.");
	            } else {
	                JOptionPane.showMessageDialog(null, "O número " + numero + " é menor do que 20.");
	            }

	      
	        }
	    
}
