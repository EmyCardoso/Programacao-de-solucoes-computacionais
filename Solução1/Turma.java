package projeto1;

public class Turma {

	//atributos
	private String nome;
	private String curso;
	private int quantidadeDeAlunos;
	private int serie;
	
	
	//metodo contrutor 
	public Turma(String n, String c, int quantidadeDeAlunos, int s) {
		nome = n;
		curso = c;
		quantidadeDeAlunos = quantidadeDeAlunos;
		serie = s;
	}
	
	//metodo de acesso
	public String getNome() {
		return nome;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public int getQuantidadeDeAlunos() {
		return quantidadeDeAlunos;
		
	}
	
	public int getSerie(){
		return serie;
	}
	//metodos modificadores
	public void setNome(String n) {
		nome = n;
	}
	
	public void setCurso(String c) {
		curso = c;
	}
	
	public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
	    quantidadeDeAlunos = quantidadeDeAlunos;
	}
	
	public void setSerie(int s) {
		serie = s;
		
	}
		
	}
		