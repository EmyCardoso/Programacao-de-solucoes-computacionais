package Pratica1;

import javax.swing.JOptionPane;

public class Solucao1c {

	public static void main(String[] args) {
		
		// Ler o dia
        String diaString = JOptionPane.showInputDialog("Digite o dia:");
        int dia = Integer.parseInt(diaString);
        
        // Ler o mês
        String mesString = JOptionPane.showInputDialog("Digite o mês:");
        int mes = Integer.parseInt(mesString);
        
        // Ler o ano
        String anoString = JOptionPane.showInputDialog("Digite o ano:");
        int ano = Integer.parseInt(anoString);
        
        // Imprimir a data no formato dia/mês/ano
        String dataFormatada = String.format("%02d/%02d/%04d", dia, mes, ano);
        JOptionPane.showMessageDialog(null, "Data: " + dataFormatada);

	}

}
