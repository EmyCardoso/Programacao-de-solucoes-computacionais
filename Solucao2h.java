package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2h {

	public static void main(String[] args) {
        
		// Leitura dos dois números 
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");

            // Conversão das Strings para números
            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);

            // Verifica qual número é maior e imprime
            if (num1 > num2) {
                JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
            } else {
                JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
            }

       
           
        }
    }

