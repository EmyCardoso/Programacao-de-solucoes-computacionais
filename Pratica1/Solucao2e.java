package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2e {

	public static void main(String[] args) {
		
		 // Inserir o valor inicial da dívida (100)
        String valorInicialStr = JOptionPane.showInputDialog("Digite o valor inicial da dívida (R$):");
        double valorInicial = Double.parseDouble(valorInicialStr);
        
        // Inserir a taxa de juros (100%)
        String jurosStr = JOptionPane.showInputDialog("Digite a taxa de juros (%):");
        double juros = Double.parseDouble(jurosStr);
        
        //Inserir o mês (8)
        String mesesStr = JOptionPane.showInputDialog("Digite o número de meses:");
        int meses = Integer.parseInt(mesesStr);
        
        // Calcula o valor final utilizando a fórmula de juros compostos
        double valorFinal = valorInicial * Math.pow((1 + juros / 100), meses);
        
        // Exibe o valor final da dívida
        JOptionPane.showMessageDialog(null, "O valor final da dívida após " + meses + " meses é: R$ " + String.format("%.2f", valorFinal));

	}

}
