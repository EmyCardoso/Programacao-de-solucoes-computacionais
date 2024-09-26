package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3r {

	public static void main(String[] args) {
        
		// Solicita ao usuário os limites e o incremento
        String inputLimiteInferior = JOptionPane.showInputDialog("Digite o limite inferior em graus Celsius:");
        String inputLimiteSuperior = JOptionPane.showInputDialog("Digite o limite superior em graus Celsius:");
        String inputIncremento = JOptionPane.showInputDialog("Digite o incremento:");

        // Converte as entradas para inteiros
        int limiteInferior = Integer.parseInt(inputLimiteInferior);
        int limiteSuperior = Integer.parseInt(inputLimiteSuperior);
        int incremento = Integer.parseInt(inputIncremento);

        // Cabeçalho da tabela
        StringBuilder tabela = new StringBuilder();
        tabela.append("Tabela de Conversão de Celsius para Fahrenheit\n");
        tabela.append("----------------------------------------------------\n");
        tabela.append("Celsius\t\tFahrenheit\n");
        tabela.append("----------------------------------------------------\n");

        // Loop para converter Celsius para Fahrenheit
        for (int celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = (9.0 / 5.0) * celsius + 32; // Conversão
            tabela.append(String.format("%-12d %.2f%n", celsius, fahrenheit)); // Impressão formatada
        }

        // Exibe a tabela de conversão
        JOptionPane.showMessageDialog(null, tabela.toString());
    }

}
