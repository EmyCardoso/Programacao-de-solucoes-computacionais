package Pratica2v;

import javax.swing.JOptionPane;

public class Solucao2g {

	public static void main(String[] args) {
       
		// Leitura dos dados
        String nome = JOptionPane.showInputDialog("Digite o nome:");
        String sexo = JOptionPane.showInputDialog("Digite o sexo (f/F para feminino):");
        String idadeStr = JOptionPane.showInputDialog("Digite a idade:");

      
            // Conversão da idade de String para inteiro
            int idade = Integer.parseInt(idadeStr);

            // Verifica se o sexo é feminino (f ou F) e se a idade é menor que 25
            if ((sexo.equalsIgnoreCase("f")) && idade < 25) {
                JOptionPane.showMessageDialog(null, nome + ": ACEITA");
            } else {
                JOptionPane.showMessageDialog(null, nome + ": NÃO ACEITA");
            }

      
            
        }
    
}

