package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3e {

	public static void main(String[] args) {
        
		while (true) {
            
			// Digite um nome
            String nome = JOptionPane.showInputDialog("Digite um nome");

            // Verifica se o nome digitado é "FIM"
            if (nome.equalsIgnoreCase("FIM")) {
                break; // Sai do loop se o nome for "FIM"
            }

            // Imprime o nome digitado
            JOptionPane.showMessageDialog(null, "Nome digitado: " + nome);
        }
    }

}
