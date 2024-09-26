package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3l {

	public static void main(String[] args) {
        
		int idade;
        int menosDe21 = 0;
        int maisDe50 = 0;

        while (true) {
            // Solicita a idade ao usuário
            String input = JOptionPane.showInputDialog("Digite a idade ");
            idade = Integer.parseInt(input);

            // Verifica se a idade está fora da faixa de 0 a 120 anos
            if (idade < 0 || idade > 120) {
                break; 
            }

            // Conta pessoas com menos de 21 anos
            if (idade < 21) {
                menosDe21++;
            }

            // Conta pessoas com mais de 50 anos
            if (idade > 50) {
                maisDe50++;
            }
        }

        // Exibe o resultado final
        String resultado = String.format(
            "Total de pessoas com menos de 21 anos: %d\n" +
            "Total de pessoas com mais de 50 anos: %d",
            menosDe21, maisDe50
        );
        JOptionPane.showMessageDialog(null, resultado);
    }

}
