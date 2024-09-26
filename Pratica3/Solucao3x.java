package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3x {

	 public static void main(String[] args) {
	        
		 double total = 0.0;  // Variável para armazenar o total a ser pago
	        
	        while (true) {
	            // Leitura do preço da mercadoria
	            double preco;
	            do {
	                String precoStr = JOptionPane.showInputDialog("Digite o preço da mercadoria ");
	                preco = Double.parseDouble(precoStr);
	                
	                if (preco < 0) {
	                    JOptionPane.showMessageDialog(null, "Preço inválido! Digite novamente.");
	                }
	            } while (preco < 0);  // Continua pedindo o preço se for negativo

	            // Leitura da quantidade de itens comprados
	            int quantidade;
	            do {
	                String quantidadeStr = JOptionPane.showInputDialog("Digite a quantidade de itens ");
	                quantidade = Integer.parseInt(quantidadeStr);
	                
	                if (quantidade < 0) {
	                    JOptionPane.showMessageDialog(null, "Quantidade inválida! Digite novamente.");
	                }
	            } while (quantidade < 0);  // Continua pedindo a quantidade se for negativa

	            // Verifica se a quantidade é zero para encerrar o loop
	            if (quantidade == 0) {
	                break;
	            }

	            // Calcula o subtotal da compra e adiciona ao total
	            total += preco * quantidade;
	        }

	        // Exibe o total a ser pago
	        JOptionPane.showMessageDialog(null, "Total a ser pago: R$ " + String.format("%.2f", total));
	    }
}
