import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.List;

public class JanelaEditProfessor extends JDialog{
	
	private JTextField txtNome, txtEspecialidade, txtCPF, txtRG;
	private JLabel lblNome,lblCPF,lblRG,lblEspecialidade;
	private JButton btOK, btCancelar;
	private boolean ok;

	public void setAluno(String nome, String cpf, String rg, String especialidade){
			Professor p = new Professor(nome, cpf, rg, especialidade);
	}

	public JanelaEditProfessor(Frame frame, Professor p){
		super(frame,true);
		setLayout(new GridLayout(6,2));
	
		
		lblNome = new JLabel("Nome: ");
		txtNome = new JTextField();
		txtNome.setText(p.getNome());
		
		lblEspecialidade = new JLabel("Especialidade: ");
		txtEspecialidade = new JTextField();
		txtEspecialidade.setText(p.getEspecialidade());
		
		lblCPF = new JLabel("CPF: ");
		txtCPF = new JTextField();
		txtCPF.setText(p.getCpf());
		
		lblRG = new JLabel("RG: ");
		txtRG = new JTextField();
		txtRG.setText(p.getRg());
		
		
		btOK = new JButton("OK");
		
		btCancelar = new JButton("Cancelar");
		btCancelar.addActionListener((e)->{
			dispose();
		});
		
		btOK.addActionListener((e)->{

			p.setNome(txtNome.getText());
			p.setEspecialidade(txtEspecialidade.getText());
			p.setRg(txtRG.getText());
			p.setCpf(txtCPF.getText());
			dispose();
		});
		
		add(lblNome);
		add(txtNome);
		
		add(lblEspecialidade);
		add(txtEspecialidade);
		
		add(lblCPF);
		add(txtCPF);
		
		add(lblRG);
		add(txtRG);
		
		add(btCancelar);
		add(btOK);
		
		setSize(300,300);
		setVisible(true);
	}

}
