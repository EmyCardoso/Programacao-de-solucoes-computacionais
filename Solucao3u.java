package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3u {

	 public static void main(String[] args) {
	       
		 // Loop para entrar com os dados de 20 pessoas
	        StringBuilder resultado = new StringBuilder("Pessoas do sexo masculino com mais de 21 anos:\n");

	        for (int i = 1; i <= 20; i++) {
	            // Entrada do nome
	            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + i + ":");

	            // Entrada da idade e conversão para inteiro
	            String idadeStr = JOptionPane.showInputDialog("Digite a idade da pessoa " + i + ":");
	            int idade = Integer.parseInt(idadeStr);

	            // Entrada do sexo
	            String sexo = JOptionPane.showInputDialog("Digite o sexo da pessoa " + i + " (M/F):");

	            // Verifica se é masculino e maior de 21 anos
	            if (sexo.equalsIgnoreCase("M") && idade > 21) {
	                resultado.append(nome).append("\n");
	            }
	        }

	        // Exibir o resultado com os nomes filtrados
	        JOptionPane.showMessageDialog(null, resultado.toString());
	    }
	
}
