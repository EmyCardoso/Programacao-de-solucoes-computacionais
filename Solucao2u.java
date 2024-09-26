package Pratica2v;

import javax.swing.JOptionPane;


public class Solucao2u {

	public static void main(String[] args) {
       
		// Leitura dos três números 
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String valor3 = JOptionPane.showInputDialog("Digite o terceiro número:");

            // Conversão das Strings para números inteiros
            int numero1 = Integer.parseInt(valor1);
            int numero2 = Integer.parseInt(valor2);
            int numero3 = Integer.parseInt(valor3);

            // Inicializa uma variável para armazenar o maior número
            int maior = numero1; // Suponha que o primeiro número é o maior inicialmente

            // Verifica se o segundo número é maior que o atual maior
            if (numero2 > maior) {
                maior = numero2;
            }

            // Verifica se o terceiro número é maior que o atual maior
            if (numero3 > maior) {
                maior = numero3;
            }

            // Exibe o maior número
            JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
        }
	}

