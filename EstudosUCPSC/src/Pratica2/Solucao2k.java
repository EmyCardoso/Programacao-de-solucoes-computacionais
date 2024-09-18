package Pratica2;

import javax.swing.JOptionPane;

public class Solucao2k {

	public static void main(String[] args) {
		
		// Lê a data como String no formato ddmmaa
        String dataString = JOptionPane.showInputDialog("Digite uma data no formato ddmmaa:");

        // Converte a string para um número inteiro
        int data = Integer.parseInt(dataString);

        // Extrai o dia (os dois primeiros dígitos)
        int dia = data / 10000;

        // Extrai o mês (os dois dígitos do meio)
        int mes = (data / 100) % 100;

        // Extrai o ano (os dois últimos dígitos)
        int ano = data % 100;

        // Exibe o dia, mês e ano separadamente
        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }

	}

