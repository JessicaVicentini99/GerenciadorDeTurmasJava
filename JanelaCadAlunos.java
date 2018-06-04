import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import java.util.List;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class JanelaCadAlunos extends JFrame{

	private JList<Aluno> jlAluno;
	private DefaultListModel<Aluno> lmAluno;
	private JPanel painel;
	private JButton btEditar, btNovo, btExcluir;
	
	public JanelaCadAlunos(){
		super("Cadastro Alunos");
		
		lmAluno = new DefaultListModel<>();
		List<Aluno> lst = Dados.getInstance().getListAlunos();
		
		for(int i=0;i<lst.size();i++){
			lmAluno.add(i,lst.get(i));
		}
		jlAluno = new JList<>(lmAluno);
		add(jlAluno);
		
		painel = new JPanel();
		painel.setLayout(new GridLayout(1,2));
		
		btExcluir = new JButton("Excluir");
		btEditar = new JButton("Editar");
		btNovo = new JButton("Novo");
		painel.add(btExcluir);painel.add(btEditar); painel.add(btNovo);
		
		add(painel, BorderLayout.SOUTH);
		
		btNovo.addActionListener((e)->{
			Dialogo d = new Dialogo(this);
			Aluno a = d.getAluno();
			lmAluno.add(lmAluno.getSize(),a);
			Dados.getInstance().getListAlunos().add(a);
		});
		
		btEditar.addActionListener((e)->{
			JanelaEditAluno ea = new JanelaEditAluno(this, jlAluno.getSelectedValue());
			System.out.printf("Aluno selecionado: %s\n", jlAluno.getSelectedValue());
		});
		
		btExcluir.addActionListener((e)->{
			lmAluno.removeElement(jlAluno.getSelectedValue());
		});
		
		setSize(400,400);
		setVisible(true);
	}

}
