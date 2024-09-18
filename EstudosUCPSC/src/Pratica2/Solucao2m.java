package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2m {

	public static void main(String[] args) {
		
		// Leitura dos três números reais (a, b, c)
        String inputA = JOptionPane.showInputDialog("Digite o valor de a:");
        String inputB = JOptionPane.showInputDialog("Digite o valor de b:");
        String inputC = JOptionPane.showInputDialog("Digite o valor de c:");

        // Conversão das strings para números reais (double)
        double a = Double.parseDouble(inputA);
        double b = Double.parseDouble(inputB);
        double c = Double.parseDouble(inputC);

        // Cálculo da expressão: x = 2 * ( ( a – c ) / 8 ) – b * 5
        double x = 2 * ((a - c) / 8) - b * 5;

        // Exibe o resultado da expressão
        JOptionPane.showMessageDialog(null, "O resultado da expressão é: " + x);

	}

	}

