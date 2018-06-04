qimport javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.List;

public class Dialogo extends JDialog{
	
	private JTextField txtNome, txtDataMatricula, txtCPF, txtRG, txtRA;
	private JLabel lblNome,lblCPF,lblRG,lblRA, lblDataMAtricula;
	private JButton btOK, btCancelar;
	private boolean ok;

	public Aluno getAluno(){
		if(ok){
			Aluno a = new Aluno(txtNome.getText(), txtCPF.getText(), txtRG.getText(), txtRA.getText(), txtDataMatricula.getText());
			return a;
		}
		else
			return null;
	}

	public Dialogo(Frame frame){
		super(frame,true);
		setLayout(new GridLayout(6,2));
	
		
		lblNome = new JLabel("Nome: ");
		txtNome = new JTextField();
		
		lblDataMAtricula = new JLabel("Data Matricula: ");
		txtDataMatricula = new JTextField();
		
		lblCPF = new JLabel("CPF: ");
		txtCPF = new JTextField();
		
		lblRG = new JLabel("RG: ");
		txtRG = new JTextField();
		
		lblRA = new JLabel("RA: ");
		txtRA = new JTextField();
		
		btOK = new JButton("OK");
		
		btCancelar = new JButton("Cancelar");
		btCancelar.addActionListener((e)->{
			dispose();
		});
		
		btOK.addActionListener((e)->{
			ok = true;
			dispose();
		});
		
		add(lblNome);
		add(txtNome);
		
		add(lblDataMAtricula);
		add(txtDataMatricula);
		
		add(lblCPF);
		add(txtCPF);
		
		add(lblRG);
		add(txtRG);
		
		add(lblRA);
		add(txtRA);
		
		add(btCancelar);
		add(btOK);
		
		setSize(300,300);
		setVisible(true);
	}

}
