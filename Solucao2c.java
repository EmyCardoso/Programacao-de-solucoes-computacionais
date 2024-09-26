package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2c {

	public static void main(String[] args) {
	        
		// Leitura do número 
	        String valor = JOptionPane.showInputDialog("Digite um número:");

	    
	            // Conversão da String para número
	            double numero = Double.parseDouble(valor);

	            // Verifica se o número é positivo ou negativo
	            if (numero >= 0) {
	                // Calcula e exibe a raiz quadrada do número
	                double raizQuadrada = Math.sqrt(numero);
	                JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numero + " é: " + raizQuadrada);
	            } else {
	                // Calcula e exibe o quadrado do número
	                double quadrado = Math.pow(numero, 2);
	                JOptionPane.showMessageDialog(null, "O quadrado de " + numero + " é: " + quadrado);
	            }

	      
	        }
	    }
	

