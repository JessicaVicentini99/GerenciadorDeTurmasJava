import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import java.util.List;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Frame;

public class JanelaListarAluno extends JDialog{

	private JList<Aluno> jlAluno;
	private JList<Aluno> jlAlunoTurma;
	private DefaultListModel<Aluno> lmAluno;
	private DefaultListModel<Aluno> lmAlunoTurma;
	private JButton btAdicionar, btRemover;
	private JPanel painel;
	private boolean selecionar;
	
	public Aluno getAluno(){
		if(selecionar){
			return jlAluno.getSelectedValue();
		}
		else
			return null;
	}

	
	public JanelaListarAluno(Frame frame, Turma t){
		super(frame,true);
		
	    setLayout(new GridLayout(1,3));
		//super("teste");
		
		//super("Selecionar Aluno");
		
		
	   /*+----------------------------------------------------------+
	     |    Lista de todos os alunos cadastrados no sistema       |
	     +----------------------------------------------------------+*/
		lmAluno = new DefaultListModel<>();
		List<Aluno> lst = Dados.getInstance().getListAlunos();
		for(int i=0;i<lst.size();i++){
			lmAluno.add(i,lst.get(i));
		}
		
		jlAluno = new JList<>(lmAluno);
		add(jlAluno);
	 /*+-------------------------------------------------------------+
	   |    Painel                                                   |
	   +-------------------------------------------------------------+*/
		painel = new JPanel();
		painel.setLayout(new GridLayout(2,1));
		
		btAdicionar = new JButton(">>");
		btRemover = new JButton("<<");
		painel.add(btAdicionar); painel.add(btRemover);
		
		add(painel);
	   /*+----------------------------------------------------------+
	     |    Lista dos alunos cadastrados na sala                  |
	     +----------------------------------------------------------+*/
		lmAlunoTurma = new DefaultListModel<>();
		for(int j=0; j<(t.getAlunos()).size(); j++){
			lmAlunoTurma.add(j, (t.getAlunos()).get(j));
		}
		jlAlunoTurma = new JList<>(lmAlunoTurma);
		add(jlAlunoTurma);
	      
		

		btAdicionar.addActionListener((e)->{
			//selecionar = true;
			System.out.printf("Aluno selecionado: %s\n", jlAluno.getSelectedValue());
			Aluno a = jlAluno.getSelectedValue();
			t.addAluno(a);
			
			lmAlunoTurma.addElement(a);
			lmAluno.removeElement(a);
			
			
			

			
			System.out.printf("Aluno Adicionado: %s\n", jlAluno.getSelectedValue());
			//dispose();
		});
		
		setSize(300,300);
		setVisible(true);
	}

}
