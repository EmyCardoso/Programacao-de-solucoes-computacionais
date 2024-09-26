package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3y {

	 public static void main(String[] args) {
	       
		 int votosCandidato1 = 0;
	        int votosCandidato2 = 0;
	        int votosCandidato3 = 0;
	        int votosCandidato4 = 0;
	        int totalEleitores = 0;

	        while (true) {
	            // Solicita o número do candidato
	            String votoStr = JOptionPane.showInputDialog("Digite o número do candidato (1, 2, 3, 4):");
	            int voto = Integer.parseInt(votoStr);

	            // Verifica se o usuário deseja encerrar a votação
	            if (voto == -1) {
	                break;
	            }

	            // Contabiliza o voto para o candidato correspondente
	            switch (voto) {
	                case 1:
	                    votosCandidato1++;
	                    totalEleitores++;
	                    break;
	                case 2:
	                    votosCandidato2++;
	                    totalEleitores++;
	                    break;
	                case 3:
	                    votosCandidato3++;
	                    totalEleitores++;
	                    break;
	                case 4:
	                    votosCandidato4++;
	                    totalEleitores++;
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Voto inválido! Digite um número de candidato válido (1 a 4).");
	            }
	        }

	        // Se nenhum voto foi registrado, evita divisão por zero
	        if (totalEleitores == 0) {
	            JOptionPane.showMessageDialog(null, "Nenhum eleitor votou.");
	        } else {
	            // Cálculo dos percentuais de votos
	            double percentualCandidato1 = (votosCandidato1 * 100.0) / totalEleitores;
	            double percentualCandidato2 = (votosCandidato2 * 100.0) / totalEleitores;
	            double percentualCandidato3 = (votosCandidato3 * 100.0) / totalEleitores;
	            double percentualCandidato4 = (votosCandidato4 * 100.0) / totalEleitores;

	            // Exibe os resultados da eleição
	            String resultado = String.format(
	                    "Total de eleitores: %d\n\n" +
	                    "Candidato 1: %.2f%% dos votos\n" +
	                    "Candidato 2: %.2f%% dos votos\n" +
	                    "Candidato 3: %.2f%% dos votos\n" +
	                    "Candidato 4: %.2f%% dos votos",
	                    totalEleitores, percentualCandidato1, percentualCandidato2, percentualCandidato3, percentualCandidato4
	            );

	            JOptionPane.showMessageDialog(null, resultado);
	        }
	    }

}
