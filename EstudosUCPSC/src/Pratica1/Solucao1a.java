package Pratica1;

import javax.swing.JOptionPane;

public class Solucao1a {

	public static void main(String[] args) {
		        
   //Ler as três palavras 
		String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra:");
	    String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra:");
		String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra:");

  // Criar a string com as palavras na ordem inversa
		String resultado = palavra3 + " " + palavra2 + " " + palavra1;

 // Exibir o resultado
		JOptionPane.showMessageDialog(null, "As palavras na ordem inversa são:\n" + resultado);
			

	}

}
