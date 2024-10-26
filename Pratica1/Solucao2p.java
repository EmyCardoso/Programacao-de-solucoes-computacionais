package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2p {

	public static void main(String[] args) {
		   
		// Lê o número como uma string
        String inputNumero = JOptionPane.showInputDialog("Digite um número:");

        // Converte a string para double
        double numero = Double.parseDouble(inputNumero);

        // Calcula o quadrado e a raiz quadrada do número
        double quadrado = numero * numero;
        double raizQuadrada = Math.sqrt(numero);

        // Exibe o número, seu quadrado e sua raiz quadrada
        JOptionPane.showMessageDialog(null, "Número: " + numero +
                                            "\nQuadrado: " + quadrado +
                                            "\nRaiz Quadrada: " + raizQuadrada);

	}

}
