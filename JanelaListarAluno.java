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
	private DefaultListModel<Aluno> lmAluno;
	private JButton btSelecionar, btCancelar;
	private JPanel painel;
	private boolean selecionar;
	
	public Aluno getAluno(){
		if(selecionar){
			return jlAluno.getSelectedValue();
		}
		else
			return null;
	}

	
	public JanelaListarAluno(Frame frame){
		super(frame,true);
		
		//setLayout(new GridLayout(5,2));
		//super("teste");
		
		//super("Selecionar Aluno");
		
		lmAluno = new DefaultListModel<>();
		List<Aluno> lst = Dados.getInstance().getListAluno();
		for(int i=0;i<lst.size();i++){
			lmAluno.add(i,lst.get(i));
		}
		
		jlAluno = new JList<>(lmAluno);
		add(jlAluno);
		
		painel = new JPanel();
		painel.setLayout(new GridLayout(1,2));
		
		//btSelecionar = new JButton("Selcionar");
		//btCancelar = new JButton("Cancelar");
		painel.add(btSelecionar); painel.add(btCancelar);
		
		add(painel, BorderLayout.SOUTH);
		

		btSelecionar.addActionListener((e)->{
			selecionar = true;
			System.out.printf("Aluno selecionado: %s\n", jlAluno.getSelectedValue());
			
			dispose();
		});
		
		setSize(300,300);
		setVisible(true);
	}

}
