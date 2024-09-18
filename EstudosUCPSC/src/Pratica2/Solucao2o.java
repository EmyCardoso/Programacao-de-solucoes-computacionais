package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2o {

	public static void main(String[] args) {
		 
		// Leitura dos números inteiros
        String inputDividendo = JOptionPane.showInputDialog("Digite o valor do dividendo:");
        String inputDivisor = JOptionPane.showInputDialog("Digite o valor do divisor:");

        // Conversão das strings para inteiros
        int dividendo = Integer.parseInt(inputDividendo);
        int divisor = Integer.parseInt(inputDivisor);

        // Calcula o quociente e o resto
        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;

        // Exibe os resultados
        JOptionPane.showMessageDialog(null, "Dividendo: " + dividendo +
                                            "\nDivisor: " + divisor +
                                            "\nQuociente: " + quociente +
                                            "\nResto: " + resto);

	}

}
