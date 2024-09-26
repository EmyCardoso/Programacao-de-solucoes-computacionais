package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2o {

	public static void main(String[] args) {
       
		// Leitura do ano de nascimento e do ano atual através do JOptionPane
        String anoNascimentoStr = JOptionPane.showInputDialog("Digite o ano de nascimento:");
        String anoAtualStr = JOptionPane.showInputDialog("Digite o ano atual:");

       
            // Conversão das Strings para inteiros
            int anoNascimento = Integer.parseInt(anoNascimentoStr);
            int anoAtual = Integer.parseInt(anoAtualStr);

            // Verifica se o ano de nascimento é válido
            if (anoNascimento < 0 || anoNascimento > anoAtual) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um ano de nascimento válido.");
            } else {
                // Calcula a idade
                int idade = anoAtual - anoNascimento;

                // Exibe a idade da pessoa
                JOptionPane.showMessageDialog(null, "A idade da pessoa é: " + idade + " anos.");
            }

      
     
}
}
