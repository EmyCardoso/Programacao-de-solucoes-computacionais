package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3w {

	public static void main(String[] args) {
       
		// Leitura da quantidade de números pares via JOptionPane
        String quantidadeStr = JOptionPane.showInputDialog("Digite quantos números pares deseja imprimir:");
        int quantidade = Integer.parseInt(quantidadeStr); // Converte a string para inteiro

        // Inicializando uma string para acumular os números pares
        StringBuilder resultado = new StringBuilder("Os primeiros " + quantidade + " números pares são:\n");

        // Loop para encontrar e acumular os números pares
        int numeroPar = 2; // Primeiro número par
        for (int i = 1; i <= quantidade; i++) {
            resultado.append(numeroPar).append("\n");
            numeroPar += 2; // Incrementa para o próximo número par
        }

        // Exibir o resultado via JOptionPane
        JOptionPane.showMessageDialog(null, resultado.toString());
    }

}
