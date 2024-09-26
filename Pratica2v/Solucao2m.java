package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2m {

	public static void main(String[] args) {
        
		// Leitura do número 
        String valor = JOptionPane.showInputDialog("Digite um número inteiro de 3 casas decimais:");

       
            // Conversão da String para número inteiro
            int numero = Integer.parseInt(valor);

            // Verifica se o número tem 3 dígitos
            if (numero < 100 || numero > 999) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número com 3 dígitos.");
            } else {
                // Extrai o algarismo da casa das dezenas
                int dezenas = (numero / 10) % 10;

                // Verifica se o algarismo das dezenas é par ou ímpar
                if (dezenas % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas (" + dezenas + ") é par.");
                } else {
                    JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas (" + dezenas + ") é ímpar.");
                }
            }

       
    }
}

