import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import java.util.List;
import java.awt.GridLayout;
import javax.swing.JDialog;
import java.awt.BorderLayout;

public class JanelaListarTurmas extends JFrame{

	private JList<Turma> jlTurma;
	private DefaultListModel<Turma> lmTurma;
	private JPanel painel;
	private JButton btEditar, btNovo,btAlunos;
	
	public JanelaListarTurmas(){
		//super(frame, true);
		super("Cadastro Turma");
		
		lmTurma = new DefaultListModel<>();
		List<Turma> lst = Dados.getInstance().getListTurma();
		for(int i=0;i<lst.size();i++){
			lmTurma.add(i,lst.get(i));
		}
		
		jlTurma = new JList<>(lmTurma);
		add(jlTurma);
		
		painel = new JPanel();
		painel.setLayout(new GridLayout(1,3));
		
		btEditar = new JButton("Editar");
		btNovo = new JButton("Novo");
		btAlunos= new JButton("Alunos");
		painel.add(btEditar); painel.add(btNovo);painel.add(btAlunos);
		
		add(painel, BorderLayout.SOUTH);
		
		btNovo.addActionListener((e)->{
			DialogoTurma d = new DialogoTurma(this);
			Turma p = d.getTurma();
			lmTurma.add(lmTurma.getSize(),p);
			Dados.getInstance().getListTurma().add(p);
		});
		
		btEditar.addActionListener((e)->{
			//JanelaEditTurma ep = new JanelaEditTurma(this, jlTurma.getSelectedValue());
			System.out.printf("Turma selecionado: %s\n", jlTurma.getSelectedValue());
		});
		
		btAlunos.addActionListener((e)->{
			//JanelaEditTurma ep = new JanelaEditTurma(this, jlTurma.getSelectedValue());
			new JanelaListarAluno(this, jlTurma.getSelectedValue());
			System.out.printf("Turma selecionado: %s\n", jlTurma.getSelectedValue());
		});
		setSize(300,300);
		setVisible(true);
	}

}
