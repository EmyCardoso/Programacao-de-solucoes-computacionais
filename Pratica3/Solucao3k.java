package Pratica3;

import javax.swing.JOptionPane;

public class Solucao3k {

	public static void main(String[] args) {
       
		int codigoConsumidor;
        double kWhConsumido;
        int tipoConsumidor;
        double custo;
        
        double totalConsumoResidencial = 0;
        double totalConsumoComercial = 0;
        double totalConsumoIndustrial = 0;
        int countResidencial = 0;
        int countComercial = 0;

        // Pega o código inicial do consumidor
        String input = JOptionPane.showInputDialog("Digite o código do consumidor");
        codigoConsumidor = Integer.parseInt(input);

        while (codigoConsumidor != 0) {
            // Captura a quantidade de kWh consumidos
            input = JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos no mês: ");
            kWhConsumido = Double.parseDouble(input);

            // Captura o tipo de consumidor
            input = JOptionPane.showInputDialog("Digite o tipo de consumidor (1 - residencial, 2 - comercial, 3 - industrial): ");
            tipoConsumidor = Integer.parseInt(input);

            // Calcula o custo com base no tipo de consumidor
            switch (tipoConsumidor) {
                case 1:
                    custo = kWhConsumido * 0.3;
                    totalConsumoResidencial += kWhConsumido;
                    countResidencial++;
                    break;
                case 2:
                    custo = kWhConsumido * 0.5;
                    totalConsumoComercial += kWhConsumido;
                    countComercial++;
                    break;
                case 3:
                    custo = kWhConsumido * 0.7;
                    totalConsumoIndustrial += kWhConsumido;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de consumidor inválido.");
                    custo = 0;
                    break;
            }

            if (custo > 0) {
                JOptionPane.showMessageDialog(null, "O custo total para o consumidor de código " + codigoConsumidor + " é: R$ " + custo);
            }

            // Solicita o próximo consumidor
            input = JOptionPane.showInputDialog("Digite o código do próximo consumidor (0 para sair): ");
            codigoConsumidor = Integer.parseInt(input);
        }

        // Calcula a média de consumo para consumidores residenciais e comerciais
        double mediaConsumoResidencial = (countResidencial > 0) ? totalConsumoResidencial / countResidencial : 0;
        double mediaConsumoComercial = (countComercial > 0) ? totalConsumoComercial / countComercial : 0;

        // Exibe os resultados finais
        String resultado = String.format(
                "Resumo:\n" +
                "Total de consumo residencial: %.2f kWh\n" +
                "Total de consumo comercial: %.2f kWh\n" +
                "Total de consumo industrial: %.2f kWh\n" +
                "Média de consumo residencial: %.2f kWh\n" +
                "Média de consumo comercial: %.2f kWh",
                totalConsumoResidencial, totalConsumoComercial, totalConsumoIndustrial, 
                mediaConsumoResidencial, mediaConsumoComercial);

        JOptionPane.showMessageDialog(null, resultado);
    }
}
