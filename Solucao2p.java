package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2p {

	  public static void main(String[] args) {
	        
		  // Leitura dos dois números
	        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
	        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");

	      
	            // Conversão das Strings para números inteiros
	            int numero1 = Integer.parseInt(valor1);
	            int numero2 = Integer.parseInt(valor2);

	            // Verifica se os números são iguais ou diferentes
	            if (numero1 == numero2) {
	                JOptionPane.showMessageDialog(null, "Os números são iguais.");
	            } else {
	                JOptionPane.showMessageDialog(null, "Os números são diferentes.");
	            }

	  }
}
