import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import java.awt.BorderLayout;
import java.util.List;

public class JanelaLista extends JFrame{

	private JTextField txtNome;
	private JList jlNomes;
	private JButton btOK;

	public JanelaLista(){
		super("Cadastro");
		
		txtNome = new JTextField();
		jlNomes = new JList();
		btOK = new JButton("OK");
		DefaultListModel<Aluno> lm = new DefaultListModel<>();
		jlNomes.setModel(lm);
		
		btOK.addActionListener((e)->{
			Aluno a = new Aluno();
			a.setNome(txtNome.getText());
			lm.add(0,a);
			//System.out.printf("%s\n", jlNomes.getModel().getClass());
		});
		
		add(txtNome, BorderLayout.NORTH);
		add(jlNomes);
		add(btOK, BorderLayout.SOUTH);
		
		setSize(300,500);
		setVisible(true);
	}
	
	public static void main(String args[]){
		
		new JanelaLista();
	}

}
