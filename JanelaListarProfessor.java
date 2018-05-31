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

public class JanelaListarProfessor extends JFrame{

	private JList<Professor> jlProfessor;
	private DefaultListModel<Professor> lmProfessor;

	
	public JanelaListarProfessor(){
		super("teste");
		setLayout(new GridLayout(5,2));
		//super("Selecionar Professor");
		
		lmProfessor = new DefaultListModel<>();
		List<Professor> lst = Dados.getInstance().getListProfessor();
		for(int i=0;i<lst.size();i++){
			lmProfessor.add(i,lst.get(i));
		}
		
		jlProfessor = new JList<>(lmProfessor);
		add(jlProfessor);
		
		
		setSize(300,300);
		setVisible(true);
	}

}
