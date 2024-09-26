package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2t {

	 public static void main(String[] args) {
	        
		        // Leitura dos dois números 
	            String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
	            String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");

	       
	            // Conversão das Strings para números inteiros
	            double numero1 = Double.parseDouble(valor1);
	            double numero2 = Double.parseDouble(valor2);

	            // Verifica qual é o menor e qual é o maior número
	            double menor = Math.min(numero1, numero2);
	            double maior = Math.max(numero1, numero2);

	            // Calcula o quadrado do menor número e a raiz quadrada do maior número
	            double quadradoMenor = menor * menor;
	            double raizQuadradaMaior = Math.sqrt(maior);

	            // Exibe os resultados
	            JOptionPane.showMessageDialog(null, "O quadrado do menor número (" + menor + ") é: " + quadradoMenor);
	            if (maior >= 0) {
	                JOptionPane.showMessageDialog(null, "A raiz quadrada do maior número (" + maior + ") é: " + raizQuadradaMaior);
	            } else {
	                JOptionPane.showMessageDialog(null, "O maior número (" + maior + ") é negativo, portanto não tem raiz quadrada real.");
	            }
}
}