package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3f {

	 public static void main(String[] args) {
	       
		        while (true) {
	            String input = JOptionPane.showInputDialog("Digite um número");

	                // Converte a entrada para um número

	                double numero = Double.parseDouble(input); 
	                // Verifica se o número é -999
	                if (numero == -999) {
	                    break; // Sai do loop se o número for -999
	                }

	                // Calcula e imprime a raiz quadrada e o inverso
	                if (numero >= 0) {
	                    double raizQuadrada = Math.sqrt(numero); // Calcula a raiz quadrada
	                    JOptionPane.showMessageDialog(null, "Número: " + numero +
	                            "\nRaiz quadrada: " + raizQuadrada +
	                            "\nInverso: " + (1 / numero)); // Calcula o inverso
	                } else {
	                    JOptionPane.showMessageDialog(null, "Número: " + numero +
	                            "\nRaiz quadrada: Não é possível calcular (número negativo)." +
	                            "\nInverso: " + (1 / numero)); // Calcula o inverso mesmo se negativo
	                }

	           
	        }
	    }
	}

