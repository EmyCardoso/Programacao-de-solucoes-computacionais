package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2g {

	public static void main(String[] args) {

		 // inserir um ângulo em graus
        String anguloStr = JOptionPane.showInputDialog("Digite um ângulo em graus:");
        double anguloGraus = Double.parseDouble(anguloStr);
        
        // Converte o ângulo de graus para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);
        
        // Calcula seno, cosseno e tangente
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        
        // Calcula secante, cossecante e cotangente
        double secante = 1 / cosseno;
        double cossecante = 1 / seno;
        double cotangente = 1 / tangente;
        
        // Exibe os resultados 
        String mensagem = String.format(
            "Ângulo: %.2f°\n" +
            "Seno: %.4f\n" +
            "Cosseno: %.4f\n" +
            "Tangente: %.4f\n" +
            "Secante: %.4f\n" +
            "Cossecante: %.4f\n" +
            "Cotangente: %.4f",
            anguloGraus, seno, cosseno, tangente, secante, cossecante, cotangente
        );
        
        JOptionPane.showMessageDialog(null, mensagem);


	}

}
