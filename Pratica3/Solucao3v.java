package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3v {

	public static void main(String[] args) {
        // Leitura do limite superior via JOptionPane
        String limiteStr = JOptionPane.showInputDialog("Digite o limite superior:");
        int limite = Integer.parseInt(limiteStr); // Converte a string para inteiro

        // Inicializando uma string para acumular os números ímpares
        StringBuilder resultado = new StringBuilder("Números ímpares menores que " + limite + ":\n");

        // Loop para encontrar e acumular os números ímpares
        for (int i = 1; i < limite; i += 2) {
            resultado.append(i).append("\n");
        }

        // Exibir o resultado via JOptionPane
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
	

