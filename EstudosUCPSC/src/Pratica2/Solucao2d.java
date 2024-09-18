package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2d {

	public static void main(String[] args) {
		
		// inserir três Strings
        String str1 = JOptionPane.showInputDialog("Digite a primeira string:");
        String str2 = JOptionPane.showInputDialog("Digite a segunda string:");
        String str3 = JOptionPane.showInputDialog("Digite a terceira string:");

        // Calcula o comprimento de cada string
        int comprimento1 = str1.length();
        int comprimento2 = str2.length();
        int comprimento3 = str3.length();

        // Soma os comprimentos das três strings
        int somaComprimentos = comprimento1 + comprimento2 + comprimento3;

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "A soma dos comprimentos das strings é: " + somaComprimentos);

	}

}
