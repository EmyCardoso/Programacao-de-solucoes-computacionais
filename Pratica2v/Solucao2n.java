package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2n {

	  public static void main(String[] args) {
	       
		  // Leitura do número 
	        String valor = JOptionPane.showInputDialog("Digite um número inteiro de 4 casas:");

	        
	            // Conversão da String para número inteiro
	            int numero = Integer.parseInt(valor);

	            // Verifica se o número tem 4 dígitos
	            if (numero < 1000 || numero > 9999) {
	                JOptionPane.showMessageDialog(null, "Por favor, insira um número com 4 dígitos.");
	            } else {
	                // Extrai os algarismos das casas das unidades de milhar e das centenas
	                int unidadesDeMilhar = numero / 1000; // Primeiro dígito
	                int centenas = (numero / 100) % 10; // Terceiro dígito

	                // Forma o novo número com os algarismos extraídos
	                int novoNumero = (unidadesDeMilhar * 10) + centenas;

	                // Verifica se o novo número é múltiplo de 4
	                if (novoNumero % 4 == 0) {
	                    JOptionPane.showMessageDialog(null, "O número " + novoNumero + " é múltiplo de 4.");
	                } else {
	                    JOptionPane.showMessageDialog(null, "O número " + novoNumero + " não é múltiplo de 4.");
	                }
	            }

	     
	    }
}
