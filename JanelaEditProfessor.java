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
		setLayout(new GridLayout(5,2));
	
		
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
			if(txtNome.getText().matches(""))
			{
				throw new CampoVazioException("Nome");
			}
			if(txtEspecialidade.getText().matches(""))
			{
				throw new CampoVazioException("Especialidade");
			}
			if(txtRG.getText().matches(""))
			{
				throw new CampoVazioException("RG");
			}
			if(txtCPF.getText().matches(""))
			{
				throw new CampoVazioException("CPF");
			}
			String n=txtNome.getText();
			if(n.contains("0")||n.contains("1")||n.contains("2")||n.contains("3")||
			n.contains("4")||n.contains("5")||n.contains("6")||n.contains("7")||
			n.contains("8")||n.contains("9")){
				
			throw new NomeInvalidoException("Nome nao pode conter numeros");
			}
			if(n.charAt(0)	<'A'|| n.charAt(0) >'Z')
			{
				throw new NomeInvalidoException("Nome deve comecar com letra Maiuscula");
			}
			if(!(txtCPF.getText().matches("[0-9]{11}")))
			{
				throw new DocumentoInvalidoException("CPF");
			}
			if(!(txtRG.getText().matches("[0-9]{9}")))
			{
				throw new DocumentoInvalidoException("RG");
			}
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
