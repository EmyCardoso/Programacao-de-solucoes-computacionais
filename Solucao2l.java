package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2l {

	public static void main(String[] args) {
        
		// Leitura do número 
        String valor = JOptionPane.showInputDialog("Digite um número:");

        
            // Conversão da String para número inteiro
            int numero = Integer.parseInt(valor);

            // Verifica se o número é divisível por 10, 5 ou 2
            boolean divisivelPor10 = (numero % 10 == 0);
            boolean divisivelPor5 = (numero % 5 == 0);
            boolean divisivelPor2 = (numero % 2 == 0);

            // Exibe as mensagens apropriadas
            if (divisivelPor10) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 10.");
            } 
            if (divisivelPor5) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 5.");
            } 
            if (divisivelPor2) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 2.");
            } 
            if (!divisivelPor10 && !divisivelPor5 && !divisivelPor2) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " não é divisível por 10, 5 ou 2.");
            }

        
}
}
