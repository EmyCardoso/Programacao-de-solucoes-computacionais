package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2b {

	public static void main(String[] args) {
		
		// Leitura dos valores
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");

    
            // Conversão das Strings para números
            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);

            // Soma dos dois números
            double soma = num1 + num2;

            // Verifica se a soma é menor ou igual a 20
            if (soma <= 20) {
                soma -= 5; // Subtrai 5 do valor somado
            }

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, "O resultado final é: " + soma);


        }
    }

	