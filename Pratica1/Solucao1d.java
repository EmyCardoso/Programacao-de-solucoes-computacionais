package Pratica1;

import javax.swing.JOptionPane;

public class Solucao1d {

	public static void main(String[] args) {
		
		// Solicita o peso do usuário no formato real
		    String pesoString = JOptionPane.showInputDialog(null, "Digite o seu peso ");
		        
		 // Converte a string para um número real 
		    double peso = Double.parseDouble(pesoString);
		        
		 // Exibe a mensagem com o peso informado
		    JOptionPane.showMessageDialog(null, "O peso informado foi " + peso + " kg.");
		    }
		}

	
