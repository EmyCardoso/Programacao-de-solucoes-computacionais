package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2w {

	public static void main(String[] args) {
      
		    // Leitura dos três números 
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String valor3 = JOptionPane.showInputDialog("Digite o terceiro número:");

     
            // Conversão das Strings para números inteiros
            int numero1 = Integer.parseInt(valor1);
            int numero2 = Integer.parseInt(valor2);
            int numero3 = Integer.parseInt(valor3);

            // Inicializa as variáveis para armazenar os números
            int maior, intermediario, menor;

            // Determina qual número é maior, intermediário e menor
            if (numero1 > numero2 && numero1 > numero3) {
                maior = numero1;
                if (numero2 > numero3) {
                    intermediario = numero2;
                    menor = numero3;
                } else {
                    intermediario = numero3;
                    menor = numero2;
                }
            } else if (numero2 > numero1 && numero2 > numero3) {
                maior = numero2;
                if (numero1 > numero3) {
                    intermediario = numero1;
                    menor = numero3;
                } else {
                    intermediario = numero3;
                    menor = numero1;
                }
            } else {
                maior = numero3;
                if (numero1 > numero2) {
                    intermediario = numero1;
                    menor = numero2;
                } else {
                    intermediario = numero2;
                    menor = numero1;
                }
            }

            // Exibe os números em ordem
            JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nIntermediário: " + intermediario + "\nMenor: " + menor);
}
}
