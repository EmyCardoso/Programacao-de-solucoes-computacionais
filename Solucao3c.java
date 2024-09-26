package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3c {

	public static void main(String[] args) {
        
		// Variável para armazenar a soma dos números
		double soma = 0;     
		// Contador para o número de entradas
		int contador = 0;     

        while (true) {
            String input = JOptionPane.showInputDialog("Digite um número positivo");

                double numero = Double.parseDouble(input);

               // Verifica se o número é negativo
                if (numero < 0) {
               
              // Sai do loop se o número for negativo    
                	break;
                   
                }

            
                soma += numero; 
            
                contador++;     

           
            }
        

        // Verifica se algum número positivo foi digitado
        if (contador > 0) {
            double media = soma / contador; // Calcula a média
            JOptionPane.showMessageDialog(null, "A média dos números digitados é: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número positivo foi digitado.");
        }
    }
}
