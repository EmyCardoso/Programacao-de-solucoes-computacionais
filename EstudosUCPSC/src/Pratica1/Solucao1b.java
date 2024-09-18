package Pratica1;

import javax.swing.JOptionPane;

public class Solucao1b {

	public static void main(String[] args) {
	
	      // Ler o número inteiro 
	   	  String numeroStr = JOptionPane.showInputDialog(null, "Digite um número inteiro:");

		 // Converter a string para um número inteiro
		  int numero = Integer.parseInt(numeroStr);

		// Exibir o valor do número digitado
		  JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + numero);
			
	}

}
 