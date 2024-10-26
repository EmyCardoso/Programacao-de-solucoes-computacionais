package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2f {

	public static void main(String[] args) {
		
		// inserir um número inteiro de três dígitos
        String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro de 3 dígitos:");
        
        // Converte a string em um número inteiro
        int numero = Integer.parseInt(numeroStr);
        
        // Calcula o algarismo da casa das dezenas
        int dezenas = (numero / 10) % 10;
        
        // Exibe o algarismo da casa das dezenas
        JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é: " + dezenas);

	}

}
