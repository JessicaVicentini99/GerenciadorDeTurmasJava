import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Frame;
import java.util.List;
import javax.swing.JLabel;

public class DialogoProfessor extends JDialog{
	
	private JTextField txtNome,txtCPF,txtRG,txtEspecialidade;
	private JLabel lblNome,lblCPF,lblRG,lblEspecialidade;
	private JButton btOK,btCancelar;
	private boolean ok;

	public Professor getProfessor(){
		if(ok){
			Professor p = new Professor(txtNome.getText(),txtCPF.getText(),txtRG.getText(),txtEspecialidade.getText());
			
			return p;
		}
		else
			return null;
	}

	public DialogoProfessor(Frame frame){
		super(frame,true);
		setLayout(new GridLayout (5,2));
		txtNome = new JTextField();
		txtCPF= new JTextField();
		txtRG= new JTextField();
		txtEspecialidade= new JTextField();
		btOK = new JButton("OK");
		
		btOK.addActionListener((e)->{
			ok = true;
			dispose();
		});
		
		btCancelar = new JButton("Cancelar");
		btCancelar.addActionListener((e)->{
			dispose();
		});
		
		lblNome = new JLabel("Nome: ");
		lblCPF = new JLabel("CPF: ");
		lblRG = new JLabel("RG: ");
		lblEspecialidade = new JLabel("Especialidade: ");
		
		add(lblNome);
		add(txtNome);
		add(lblCPF);
		add(txtCPF);
		add(lblRG);
		add(txtRG);
		add(lblEspecialidade);
		add(txtEspecialidade);

		add(btCancelar);
		add(btOK);
		
		setSize(300,300);
		setVisible(true);
	}

}
