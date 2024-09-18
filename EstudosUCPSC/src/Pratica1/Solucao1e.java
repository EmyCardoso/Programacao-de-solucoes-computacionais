package Pratica1;

import javax.swing.JOptionPane;

public class Solucao1e {

	 public static void main(String[] args) {
	        
		 // Variável para armazenar os caracteres digitados
	        StringBuilder palavra = new StringBuilder();

	    // Loop para solicitar 10 caracteres
	        for (int i = 1; i <= 10; i++) {
	            String caracter = JOptionPane.showInputDialog(null, "Digite o caractere " + i + ":");
	            
	   // Adiciona o primeiro caractere digitado à variável palavra
	        palavra.append(caracter.charAt(0));
	        
	        }

	  // Exibe a palavra formada pelos caracteres
	        JOptionPane.showMessageDialog(null, "A palavra formada é: " + palavra.toString());

}
    }