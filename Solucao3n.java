package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3n {

	 public static void main(String[] args) {
	        int numero;
	        int contagemPrimos = 0;

	        while (true) {
	            // Solicita ao usuário o número
	            String input = JOptionPane.showInputDialog("Digite um número inteiro positivo");
	            numero = Integer.parseInt(input);

	            // Verifica se o número é não positivo e interrompe o loop
	            if (numero <= 0) {
	                break;
	            }

	            // Verifica se o número é primo
	            if (ehPrimo(numero)) {
	                contagemPrimos++;
	            }
	        }

	        // Exibe a quantidade de números primos digitados
	        JOptionPane.showMessageDialog(null, "Quantidade de números primos digitados: " + contagemPrimos);
	    }

	    // Método para verificar se um número é primo
	    public static boolean ehPrimo(int numero) {
	        if (numero <= 1) {
	            return false; // Números menores ou iguais a 1 não são primos
	        }
	        for (int i = 2; i <= numero / 2; i++) {
	            if (numero % i == 0) {
	                return false; // Se o número for divisível por qualquer outro número, não é primo
	            }
	        }
	        return true; // Se não houver divisores, é primo
	    }
	
}
