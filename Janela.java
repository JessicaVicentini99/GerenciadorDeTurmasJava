import javax.swing.JFrame;
import javax.swing.JButton;
import java.util.List;
import java.awt.GridLayout;

public class Janela extends JFrame{

	private JButton btCadAluno, btCadProfessor, btCadTurma;

	public Janela(){
		super("Principal");
		
		setLayout(new GridLayout(3,1));

		btCadAluno = new JButton("Cadastro de Alunos");
		btCadProfessor = new JButton("Cadastro de Professores");
		btCadTurma = new JButton("Cadastro de Turmas");
		add(btCadAluno);
		add(btCadProfessor);
		add(btCadTurma);
		
		btCadAluno.addActionListener((e)->{
			new JanelaCadAlunos();
		});
		btCadProfessor.addActionListener((e)->{
			new JanelaCadProfessor();
		});
		
		btCadTurma.addActionListener((e)->{
			new JanelaListarTurmas();
		});
		
		setSize(200,200);
		setVisible(true);
	}
	
	public static void main(String args[]){
		
		new Janela();
	}

}
