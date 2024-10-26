
public class Atribuicao {

	//atributos
		private Professor professor;
		private Disciplina disciplina;
		
		//contrutor 
		Atribuicao(Professor professor, Disciplina disciplina){
			this.professor = professor;
			this.disciplina = disciplina;
		}
		
		//metodos de acesso
		public Professor getProfessor() {
			return professor;
		}

		public Disciplina getDisciplina() {
			return disciplina;
		}

		//metodos modificadores 
		public void setProfessor( Professor professor ) {
			this.professor = professor;
		}
		
		public void setDisciplina(Disciplina disciplina) {
			this.disciplina = disciplina;
		}

		//metodo getDados
		public String getDados() {
			return "Atribuicao:" + professor.getDados() + disciplina.getDados();
		}




	
}
