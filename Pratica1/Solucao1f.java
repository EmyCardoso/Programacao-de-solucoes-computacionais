package Pratica1;

import javax.swing.JOptionPane;

public class Solucao1f {

	public static void main(String[] args) {
		 
		// Lê os quatro números como caracteres
        char milhar = JOptionPane.showInputDialog(null, "Digite o milhar:").charAt(0);
        char centena = JOptionPane.showInputDialog(null, "Digite a centena:").charAt(0);
        char dezena = JOptionPane.showInputDialog(null, "Digite a dezena:").charAt(0);
        char unidade = JOptionPane.showInputDialog(null, "Digite a unidade:").charAt(0);

        // Concatena os caracteres em uma string
        String numeroCompleto = "" + milhar + centena + dezena + unidade;

        // Exibe o número completo
        JOptionPane.showMessageDialog(null, "O número formado é: " + numeroCompleto);
	}

}
