package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2i {

	public static void main(String[] args) {
		  
		// Solicita a entrada de um número
        String inputNumero = JOptionPane.showInputDialog("Digite um número:");

        // Solicita a entrada da base
        String inputBase = JOptionPane.showInputDialog("Digite a base do logaritmo:");

        // Converte as entradas de string para double
        double numero = Double.parseDouble(inputNumero);
        double base = Double.parseDouble(inputBase);

        // Calcula o logaritmo do número na base fornecida
        double logaritmo = Math.log(numero) / Math.log(base);

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "O logaritmo de " + numero + " na base " + base + " é: " + logaritmo);

	}

}
