package projeto1;

import javax.swing.JOptionPane;

public class TesteTurma {

	public static void main(String[]args) {
		String nome = JOptionPane.showInputDialog("nome");
		String curso = JOptionPane.showInputDialog("curso");
		int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("quantidade De Alunos"));
	    int serie = Integer.parseInt(JOptionPane.showInputDialog("serie"));
	    
	    //crie um objeto turma 
	    Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);
	
	    //monte a string de saida chamando os metodos de acesso do aluno
	    String msg = "Nome: " + turma.getNome() + "\ncurso: " + turma.getCurso() + "\nquantidade De Alunos" + turma.getQuantidadeDeAlunos() + "\nserie" + turma.getSerie();
	
	    
	    //inserie uma nova quantidade de alunos
	    
	    JOptionPane.showMessageDialog(null, msg);
	    quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("quantidade De Alunos"));
	    
	    	
}
}