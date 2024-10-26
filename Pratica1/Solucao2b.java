package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2b {

	public static void main(String[] args) {
		 
		// Solicita a base do retângulo 
        String baseStr = JOptionPane.showInputDialog("Digite o valor da base do retângulo:");
        double base = Double.parseDouble(baseStr);

        // Solicita a altura do retângulo 
        String alturaStr = JOptionPane.showInputDialog("Digite o valor da altura do retângulo:");
        double altura = Double.parseDouble(alturaStr);

        // Calcula a área do retângulo
        double area = base * altura;

        // Exibe o resultado 
        JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area);
    }

	}


