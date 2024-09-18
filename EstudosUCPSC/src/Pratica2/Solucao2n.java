package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2n {

	public static void main(String[] args) {
		
		// Constante para o valor de PI
        final double PI = 3.14159;

        // Lê o valor do raio como string
        String inputRaio = JOptionPane.showInputDialog("Digite o valor do raio do círculo:");

        // Converte o valor do raio para double
        double raio = Double.parseDouble(inputRaio);

        // Calcula a área do círculo
        double area = PI * raio * raio;

        // Exibe o resultado da área
        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);

	}

}
