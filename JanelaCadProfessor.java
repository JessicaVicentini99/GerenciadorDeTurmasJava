import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import java.util.List;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class JanelaCadProfessor extends JFrame{

	private JList<Professor> jlProfessor;
	private DefaultListModel<Professor> lmProfessor;
	private JPanel painel;
	private JButton btEditar, btNovo;
	
	public JanelaCadProfessor(){
		super("Cadastro Professor");
		
		lmProfessor = new DefaultListModel<>();
		List<Professor> lst = Dados.getInstance().getListProfessor();
		for(int i=0;i<lst.size();i++){
			lmProfessor.add(i,lst.get(i));
		}
		
		jlProfessor = new JList<>(lmProfessor);
		add(jlProfessor);
		
		painel = new JPanel();
		painel.setLayout(new GridLayout(1,2));
		
		btEditar = new JButton("Editar");
		btNovo = new JButton("Novo");
		painel.add(btEditar); painel.add(btNovo);
		
		add(painel, BorderLayout.SOUTH);
		
		btNovo.addActionListener((e)->{
			DialogoProfessor d = new DialogoProfessor(this);
			Professor p = d.getProfessor();
			lmProfessor.add(lmProfessor.getSize(),p);
			Dados.getInstance().getListProfessor().add(p);
		});
		
		btEditar.addActionListener((e)->{
			JanelaEditProfessor ep = new JanelaEditProfessor(this, jlProfessor.getSelectedValue());
			System.out.printf("Professor selecionado: %s\n", jlProfessor.getSelectedValue());
		});
		
		setSize(300,300);
		setVisible(true);
	}

}
