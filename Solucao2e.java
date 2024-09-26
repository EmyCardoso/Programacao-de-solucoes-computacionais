package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2e {

	public static void main(String[] args) {
		 
		// Leitura do número 
        String valor = JOptionPane.showInputDialog("Digite um número:");

      
            // Conversão da String para número
            int numero = Integer.parseInt(valor);

            // Verifica se o número está entre 20 e 90
            if (numero >= 20 && numero <= 90) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " está entre 20 e 90.");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + numero + " não está entre 20 e 90.");
            }

        }
    }


