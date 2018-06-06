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
		txtDataMatricula.setText(a.getDataMatricula());
		
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
			
			if(txtNome.getText().matches(""))
			{
				throw new CampoVazioException("Nome");
			}
			if(txtDataMatricula.getText().matches(""))
			{
				throw new CampoVazioException("Data de Matricula");
			}
			if(txtRA.getText().matches(""))
			{
				throw new CampoVazioException("RA");
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
