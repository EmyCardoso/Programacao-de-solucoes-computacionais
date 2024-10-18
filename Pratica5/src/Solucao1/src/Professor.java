
public class Professor {

	//atributos
		private String nome;
		private int idade;
		
		//construtor
		public Professor(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}
		
		//metodo de acesso
		public String getNome() {
			return nome;
		}
		
		public int getIdade() {
			return idade;
		}
		
		//metodos modificadores
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void setIdade(int idade) {
			this.idade = idade;
	}
		
		//metodo getDados
		public String getDados() {
			return "Professor[nome=" + nome +" , idade=" + idade + "]";
			
			
			
		}
	
}
