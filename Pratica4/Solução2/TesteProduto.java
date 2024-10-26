
import javax.swing.JOptionPane;

public class TesteProduto {

	public class TesteProduto {

		public static void main(String[] args) {
			String nome = JOptionPane.showInputDialog("nome");
			double preço = Double.parseDouble(JOptionPane.showInputDialog("preço"));
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("quantidade"));
			
			//criar um objeto 
			Produto produto = new Produto(nome, preço, quantidade);
					

			//monte a String de saida chamando os metodos de acesso 
			String msg = "NOME: " + produto.getNome() + "\npreço: " + produto.getPreço() + "\nquantidade: " +  produto.getQuantidade();
			
			JOptionPane.showMessageDialog(null,  msg);
		}


	
}
