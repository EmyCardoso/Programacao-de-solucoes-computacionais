package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2a {

	public static void main(String[] args) {
		
		 // Leitura dos valores
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");

      
            // Conversão das Strings para inteiros
            int num1 = Integer.parseInt(valor1);
            int num2 = Integer.parseInt(valor2);

            // Soma dos dois números
            int soma = num1 + num2;

            // Verifica se a soma é maior que 10
            if (soma > 10) {
                JOptionPane.showMessageDialog(null, "A soma é: " + soma);
            } else {
                JOptionPane.showMessageDialog(null, "A soma não é maior que 10.");
            }

  
        }
    


	}


