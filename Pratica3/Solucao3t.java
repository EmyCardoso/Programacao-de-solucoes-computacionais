package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3t {

	 public static void main(String[] args) {
	        
		 // Leitura do limite superior 
	        String limiteStr = JOptionPane.showInputDialog("Digite o limite superior:");
	        int limite = Integer.parseInt(limiteStr);  // Converte o valor de String para inteiro

	        // Leitura do valor de incremento 
	        String incrementoStr = JOptionPane.showInputDialog("Digite o incremento:");
	        int incremento = Integer.parseInt(incrementoStr);  // Converte o valor de String para inteiro

	        // Inicializando a string que vai acumular os resultados
	        StringBuilder resultado = new StringBuilder("Números do intervalo:\n");

	        // Loop para formar a string com os números do intervalo
	        for (int i = 0; i <= limite; i += incremento) {
	            resultado.append(i).append("\n");
	        }

	        // Exibi o resultado
	        JOptionPane.showMessageDialog(null, resultado.toString());
	    }
}
