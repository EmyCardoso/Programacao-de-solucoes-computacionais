package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2a {

	public static void main(String[] args) {
		
		// Solicita a idade do usuário
        String idadeString = JOptionPane.showInputDialog(null, "Digite sua idade:");
        
        // Converte a idade de String para int
        int idade = Integer.parseInt(idadeString);
        
        // Calcula o número aproximado de dias vividos
        int diasVividos = idade * 365;
        
        // Exibe o número de dias vividos
        JOptionPane.showMessageDialog(null, "Você viveu aproximadamente " + diasVividos + " dias.");

	}

}
