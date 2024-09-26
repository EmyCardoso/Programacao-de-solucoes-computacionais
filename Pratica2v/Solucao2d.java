package Pratica2v;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Solucao2d {

	 public static void main(String[] args) {
	        
		 // Leitura dos três números através do JOptionPane
	        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
	        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
	        String valor3 = JOptionPane.showInputDialog("Digite o terceiro número:");

	   
	            // Conversão das Strings para números
	            double num1 = Double.parseDouble(valor1);
	            double num2 = Double.parseDouble(valor2);
	            double num3 = Double.parseDouble(valor3);

	            // Coloca os números em um array
	            double[] numeros = {num1, num2, num3};

	            // Ordena o array em ordem crescente
	            Arrays.sort(numeros);

	            // Exibe os números ordenados
	            JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: " + 
	                                           numeros[0] + ", " + numeros[1] + ", " + numeros[2]);

	       
	    }

}
