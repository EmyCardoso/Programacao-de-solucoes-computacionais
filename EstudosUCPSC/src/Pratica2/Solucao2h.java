package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2h {

	public static void main(String[] args) {
		
		// digita um número
        String input = JOptionPane.showInputDialog("Digite um número:");

        // Converte a string de entrada para double
        double numero = Double.parseDouble(input);

        // Calcula o logaritmo na base 10
        double logaritmo = Math.log10(numero);

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "O logaritmo de " + numero + " na base 10 é: " + logaritmo);

	}

}
