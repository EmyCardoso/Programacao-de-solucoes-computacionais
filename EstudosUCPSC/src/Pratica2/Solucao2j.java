package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2j {

	public static void main(String[] args) {
		 
		// Leitura das três frases
        String frase1 = JOptionPane.showInputDialog("Digite a primeira frase:");
        String frase2 = JOptionPane.showInputDialog("Digite a segunda frase:");
        String frase3 = JOptionPane.showInputDialog("Digite a terceira frase:");

        // Dividindo as frases ao meio
        String primeiraMetade1 = frase1.substring(0, frase1.length() / 2);
        String segundaMetade1 = frase1.substring(frase1.length() / 2);

        String primeiraMetade2 = frase2.substring(0, frase2.length() / 2);
        String segundaMetade2 = frase2.substring(frase2.length() / 2);

        String primeiraMetade3 = frase3.substring(0, frase3.length() / 2);
        String segundaMetade3 = frase3.substring(frase3.length() / 2);

        // Embaralhando conforme a regra dada
        String fraseEmbaralhada = primeiraMetade2 + 
                                  segundaMetade3 + 
                                  segundaMetade2 + 
                                  primeiraMetade1 + 
                                  primeiraMetade3 + 
                                  segundaMetade1;

        // Concatenando as três frases originais
        String frasesOriginais = frase1 + " " + frase2 + " " + frase3;

        // Exibindo o resultado
        JOptionPane.showMessageDialog(null, "Frases originais concatenadas: " + frasesOriginais +
                                      "\nFrase embaralhada: " + fraseEmbaralhada);

        // Comparando se as frases são iguais
        if (frasesOriginais.equals(fraseEmbaralhada)) {
            JOptionPane.showMessageDialog(null, "As frases são iguais.");
        } else {
            JOptionPane.showMessageDialog(null, "As frases são diferentes.");
        }

	}

}
