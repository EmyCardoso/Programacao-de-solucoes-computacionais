
import javax.swing.JOptionPane;

public class TesteAtribuicao {

	public static void main(String[] args) {
		String nomeProfessor;
		int idadeProfessor;
		String nomeDisciplina;
		boolean praticaDisciplina;
		
		nomeProfessor = JOptionPane.showInputDialog("digite o nome do professor");
	    int idade = Integer.parseInt(JOptionPane.showInputDialog("digite a Idade do professor"));
		
		nomeDisciplina = JOptionPane.showInputDialog("digite o nome da disciplina");
        praticaDisciplina = Boolean.parseBoolean(JOptionPane.showInputDialog("digite true ou false para pratica")); 
		
        Professor professor = new Professor(nomeProfessor, idade);
        
        Disciplina disciplina = new Disciplina(nomeDisciplina, praticaDisciplina);
        
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);
        
        JOptionPane.showMessageDialog(null, atribuicao.getDados());
	}


}
