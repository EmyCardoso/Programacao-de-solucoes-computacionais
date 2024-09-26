package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3z {

	public static void main(String[] args) {
       
		while (true) {
            // Leitura dos dois números reais
            String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
            double num1 = Double.parseDouble(num1Str);

            String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");
            double num2 = Double.parseDouble(num2Str);

            // Exibe o menu de opções
            String menu = "Operações Disponíveis:\n" +
                          "1. Adição\n" +
                          "2. Subtração\n" +
                          "3. Multiplicação\n" +
                          "4. Divisão\n" +
                          "9. Sair do Programa\n" +
                          "Digite o número de ordem da opção desejada:";
            String opcaoStr = JOptionPane.showInputDialog(menu);
            int opcao = Integer.parseInt(opcaoStr);

            // Verifica qual operação foi escolhida
            switch (opcao) {
                case 1:  // Adição
                    double soma = num1 + num2;
                    JOptionPane.showMessageDialog(null, "Resultado da Adição: " + soma);
                    break;

                case 2:  // Subtração
                    double subtracao = num1 - num2;
                    JOptionPane.showMessageDialog(null, "Resultado da Subtração: " + subtracao);
                    break;

                case 3:  // Multiplicação
                    double multiplicacao = num1 * num2;
                    JOptionPane.showMessageDialog(null, "Resultado da Multiplicação: " + multiplicacao);
                    break;

                case 4:  // Divisão
                    if (num2 != 0) {
                        double divisao = num1 / num2;
                        JOptionPane.showMessageDialog(null, "Resultado da Divisão: " + divisao);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
                    }
                    break;

                case 9:  // Sair do programa
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    return;  // Encerra o programa

                default:  // Opção inválida
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        }
    }

	
}
