package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2l {

	public static void main(String[] args) {
		
		  // Lê a data no formato dd/mm/aa
        String data = JOptionPane.showInputDialog("Digite uma data no formato dd/mm/aa:");

        // Divide a data em partes (dia, mês e ano) utilizando split()
        String[] partes = data.split("/");

        // Obtém o dia, mês e ano separadamente
        String dia = partes[0];
        String mes = partes[1];
        String ano = partes[2];

        // Exibe o dia, mês e ano separadamente
        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }


}
