package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3o {

	 public static void main(String[] args) {
	        int numero;
	        int maior = Integer.MIN_VALUE; // Inicializa o maior número com o menor valor possível

	        while (true) {
	            // Solicita ao usuário o número
	            String input = JOptionPane.showInputDialog("Digite um número ");
	            numero = Integer.parseInt(input);

	            // Verifica se o número é -9999 e interrompe o loop
	            if (numero == -9999) {
	                break;
	            }

	            // Verifica se o número atual é o maior
	            if (numero > maior) {
	                maior = numero;
	            }
	        }

	        // Verifica se algum número foi digitado e exibe o maior número
	        if (maior == Integer.MIN_VALUE) {
	            JOptionPane.showMessageDialog(null, "Nenhum número foi digitado.");
	        } else {
	            JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maior);
	        }
	    }
	
}
