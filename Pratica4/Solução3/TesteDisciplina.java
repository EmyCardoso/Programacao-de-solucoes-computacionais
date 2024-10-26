import javax.swing.JOptionPane;
public class TesteDisciplina {
	
}
	public static void main(String[] args) {
	
	// coletando os dados do aluno a ser cadastrado
	String nome = JOptionPane.showInputDialog("Nome");
	String professor = JOptionPane.showInputDialog("professor");
	int semestre = Integer.parseInt(JOptionPane.showInputDialog("semestre");
	boolean ofertada = JOptionPane.showConfirmDialog(null, "A disciplina está sendo ofertada?", "Ofertada");

    // Criação da disciplina e exibição dos dados
    Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);
    JOptionPane.showMessageDialog(null, disciplina.toString(), "Disciplina Cria");
}


	
	
	
	
	
	
	
	
	
	
	