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
