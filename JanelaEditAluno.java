import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.List;

public class JanelaEditAluno extends JDialog{
	
	private JTextField txtNome, txtDataMatricula, txtCPF, txtRG, txtRA;
	private JLabel lblNome,lblCPF,lblRG,lblRA, lblDataMAtricula;
	private JButton btOK, btCancelar;
	private boolean ok;

	public void setAluno(String nome, String cpf, String rg, String ra, String dataMatricula){
			Aluno a = new Aluno(nome, cpf, rg, ra, dataMatricula);
	}

	public JanelaEditAluno(Frame frame, Aluno a){
		super(frame,true);
		setLayout(new GridLayout(6,2));
	
		
		lblNome = new JLabel("Nome: ");
		txtNome = new JTextField();
		txtNome.setText(a.getNome());
		
		lblDataMAtricula = new JLabel("Data Matricula: ");
		txtDataMatricula = new JTextField();
		txtDataMatricula.setText(a.getNome());
		
		lblCPF = new JLabel("CPF: ");
		txtCPF = new JTextField();
		txtCPF.setText(a.getCpf());
		
		lblRG = new JLabel("RG: ");
		txtRG = new JTextField();
		txtRG.setText(a.getRg());
		
		lblRA = new JLabel("RA: ");
		txtRA = new JTextField();
		txtRA.setText(a.getRa());
		
		btOK = new JButton("OK");
		
		btCancelar = new JButton("Cancelar");
		btCancelar.addActionListener((e)->{
			dispose();
		});
		
		btOK.addActionListener((e)->{

			a.setNome(txtNome.getText());
			a.setDataMatricula(txtDataMatricula.getText());
			a.setRa(txtRA.getText());
			a.setRg(txtRG.getText());
			a.setCpf(txtCPF.getText());
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
