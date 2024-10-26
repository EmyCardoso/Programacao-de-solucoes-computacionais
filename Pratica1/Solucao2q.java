package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2q {

	public static void main(String[] args) {
		
		// Lê a base do triângulo como uma string
        String inputBase = JOptionPane.showInputDialog("Digite a base do triângulo:");

        // Lê a altura do triângulo como uma string
        String inputAltura = JOptionPane.showInputDialog("Digite a altura do triângulo:");

        // Converte as strings para double
        double base = Double.parseDouble(inputBase);
        double altura = Double.parseDouble(inputAltura);

        // Calcula a área do triângulo
        double area = (base * altura) / 2;

        // Exibe a área do triângulo
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);

	}

}
