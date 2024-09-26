package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2x {

	   public static void main(String[] args) {
	       
		  // Inicializa as variáveis para o maior e menor
	        double maior = Double.NEGATIVE_INFINITY;
	        double menor = Double.POSITIVE_INFINITY;

	      // Leitura dos cinco números
	        for (int i = 1; i <= 5; i++) {
	        String valor = JOptionPane.showInputDialog("Digite o número " + i + ":");
	           
	     // Conversão da String para número
	        double numero = Double.parseDouble(valor);

        // Verifica se o número é maior que o atual maior
	        if (numero > maior) {
	                maior = numero;
	                }

	   // Verifica se o número é menor que o atual menor
	        if (numero < menor) {
	             menor = numero;
	                }
	                
	   // Exibe o maior e o menor número
	                JOptionPane.showMessageDialog(null, "O maior número é: " + maior + "\nO menor número é: " + menor);
	            }
	   }
}
