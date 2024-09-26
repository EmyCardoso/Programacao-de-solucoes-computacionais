package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3s {

	 public static void main(String[] args) {
	        // Solicita ao usuário um número inteiro não negativo
	        String input = JOptionPane.showInputDialog("Digite um número inteiro não negativo para calcular o fatorial:");
	        int numero = Integer.parseInt(input);

	        // Valida se o número é não negativo
	        if (numero < 0) {
	            JOptionPane.showMessageDialog(null, "Por favor, digite um número inteiro não negativo.");
	        } else {
	            // Calcula o fatorial
	            long fatorial = calcularFatorial(numero);
	            // Exibe o resultado
	            JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
	        }
	    }
}
