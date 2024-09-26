package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3m {

	 public static void main(String[] args) {
	       
		 // Entrada de dados: solicita ao usuário o número
	        String input = JOptionPane.showInputDialog("Digite um número para verificar se é primo:");
	        int numero = Integer.parseInt(input);

	        // Verifica se o número é primo
	        if (ehPrimo(numero)) {
	            JOptionPane.showMessageDialog(null, numero + " é um número primo.");
	        } else {
	            JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
	        }
	    }



// Método para verificar se um número é primo
public static boolean ehPrimo(int numero) {
    if (numero <= 1) {
        return false; // Números menores ou iguais a 1 não são primos
    }
    for (int i = 2; i <= numero / 2; i++) {
        if (numero % i == 0) {
            return false; // Se o número for divisível por qualquer número, não é primo
        }
    }
    return true; // Se não houver divisores, é primo
}
}
