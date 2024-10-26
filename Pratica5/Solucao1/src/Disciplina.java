
public class Disciplina {

	//atributos
		private String  nome;
		private boolean pratica;
		
		//metodo contrutor 
		public Disciplina(String nome ) {
			this.nome = nome;
			this.pratica = false;
		}

		//metodos de acesso 
		public String getnome() {
			return nome;
		}

		public boolean getPratica() {
			return pratica;
		}

	    //metodos modificadores
		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setPratica(boolean pratica) {
			this.pratica = pratica;
		}

		//metodos getDados
		public String getDados() {
			return "Disciplina[nome=" + nome +" , pratica=" + pratica + "]";
			
		}

	
}
