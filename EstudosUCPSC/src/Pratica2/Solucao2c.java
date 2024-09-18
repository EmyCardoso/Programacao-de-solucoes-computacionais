package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2c {

	public static void main(String[] args) {
		
		// inserir um número inteiro
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");

        // Converte a entrada de String para inteiro
        int numero = Integer.parseInt(input);

        // Eleva o número ao quadrado usando Math.pow()
        double resultado = Math.pow(numero, 2);

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "O número " + numero + " ao quadrado é: " + resultado);
	
	
}
	}
	