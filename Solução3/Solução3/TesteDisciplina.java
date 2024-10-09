
import javax.swing.JOptionPane;



public class TesteDisciplina {

	public static void main(String[] args) {
		  // Leitura dos dados da disciplina
        String nome = JOptionPane.showInputDialog("Digite o nome da disciplina:");
        String professor = JOptionPane.showInputDialog("Digite o nome do professor:");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre:"));
       
        // Criação da disciplina e exibição dos dados
        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);
        String msg = "Nome: " + disciplina.getNome() + "\professor: "
        		+ disciplina.getProfessor() + " semestre" + disciplina.getSemestre()
        		
        		if (disciplina.getOfertando()) {
        		msg += "\nOfertando: sim";
        		} else {
        		msg += "\nOfertando: nao";
        		}
     
        JOptionPane.showMessageDialog(null, msg);
        // tem que digitar true ou false
        boolean formando = Boolean.parseBoolean(JOptionPane
        .showInputDialog("E' formando?true/false"));
	
	
	
	}

}
