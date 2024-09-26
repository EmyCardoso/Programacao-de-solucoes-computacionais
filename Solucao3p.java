package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3p {

	 public static void main(String[] args) {
	        
		 // Solicita ao usuário que insira um número
	        String input = JOptionPane.showInputDialog("Digite um número para mostrar a sequência de Fibonacci até ele:");
	        int numero = Integer.parseInt(input);

	        // Verifica se o número é válido
	        if (numero <= 0) {
	            JOptionPane.showMessageDialog(null, "Por favor, digite um número positivo.");
	        } else {
	            // Gera e exibe a sequência de Fibonacci
	            String sequenciaFibonacci = gerarSequenciaFibonacci(numero);
	            JOptionPane.showMessageDialog(null, "Sequência de Fibonacci até " + numero + ":\n" + sequenciaFibonacci);
	        }
	    }

	    // Método para gerar a sequência de Fibonacci até o número limite
	    public static String gerarSequenciaFibonacci(int limite) {
	        int anterior = 0, proximo = 1;
	        StringBuilder sequencia = new StringBuilder();

	        while (proximo <= limite) {
	            sequencia.append(proximo).append(" "); // Adiciona o número atual na sequência
	            int temp = proximo;
	            proximo = anterior + proximo; // Próximo número da sequência
	            anterior = temp; // Atualiza o anterior
	        }

	        return sequencia.toString();
	    }
	
}
