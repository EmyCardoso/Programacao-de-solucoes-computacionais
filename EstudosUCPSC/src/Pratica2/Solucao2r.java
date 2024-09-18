package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2r {

	public static void main(String[] args) {
	   
		// Lê a primeira diagonal do losango como uma string
        String inputDiagonal1 = JOptionPane.showInputDialog("Digite o valor da primeira diagonal do losango:");

        // Lê a segunda diagonal do losango como uma string
        String inputDiagonal2 = JOptionPane.showInputDialog("Digite o valor da segunda diagonal do losango:");

        // Converte as strings para double
        double diagonal1 = Double.parseDouble(inputDiagonal1);
        double diagonal2 = Double.parseDouble(inputDiagonal2);

        // Calcula a área do losango
        double area = (diagonal1 * diagonal2) / 2;

        // Exibe a área do losango
        JOptionPane.showMessageDialog(null, "A área do losango é: " + area);
    }
		

	}


