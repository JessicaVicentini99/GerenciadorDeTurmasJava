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

public class JanelaListarProfessor extends JDialog{

	private JList<Professor> jlProfessor;
	private DefaultListModel<Professor> lmProfessor;
	private JButton btSelecionar, btCancelar;
	private JPanel painel;
	private boolean selecionar;
	
	public Professor getProfessor(){
		if(selecionar){
			return jlProfessor.getSelectedValue();
		}
		else
			return null;
	}

	
	public JanelaListarProfessor(Frame frame){
		super(frame,true);
		
		//setLayout(new GridLayout(5,2));
		//super("teste");
		
		//super("Selecionar Professor");
		
		lmProfessor = new DefaultListModel<>();
		List<Professor> lst = Dados.getInstance().getListProfessor();
		for(int i=0;i<lst.size();i++){
			lmProfessor.add(i,lst.get(i));
		}
		
		jlProfessor = new JList<>(lmProfessor);
		add(jlProfessor);
		
		painel = new JPanel();
		painel.setLayout(new GridLayout(1,2));
		
		btSelecionar = new JButton("Selcionar");
		btCancelar = new JButton("Cancelar");
		painel.add(btSelecionar); painel.add(btCancelar);
		
		add(painel, BorderLayout.SOUTH);
		

		btSelecionar.addActionListener((e)->{
			selecionar = true;
			System.out.printf("Professor selecionado: %s\n", jlProfessor.getSelectedValue());
			
			dispose();
		});
		
		setSize(300,300);
		setVisible(true);
	}

}
