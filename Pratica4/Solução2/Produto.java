
public class Produto {

	//atributos
		private String nome;
		private double preço;
		private int quantidade;
		
		//método contrutor 
		public Produto(String n, double p, int q) {
			nome = n;
			preço = p;
			quantidade = q;
		}
		
		//método de acesso 
		public String getNome() {
			return nome;
		}
		
		public double getPreço() {
			return preço;
		}
		
		public int getQuantidade() {
			return quantidade;
		}
		
		//métodos modificadores
		public void setNome(String n) {
			nome = n;
		}
		
		public void setPreço(double p) {
			preço = p;
		}
		
		public void setQuantidade(int q) {
			quantidade = q;
		}
		
		
		
		}  
}
