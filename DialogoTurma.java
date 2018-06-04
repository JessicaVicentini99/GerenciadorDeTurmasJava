import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JList;
import javax.swing.JPanel;

public class DialogoTurma extends JDialog{
	
	private JTextField txtDataInicio, txtDataTermino, txtProfessor, txtAlunosTurma, txtAlunos;
	private JLabel lblDataInicio,lblDataTermino,lblProfessor;
	private JButton btOK, btCancelar, btAddProfessor, btSelecionarAlunos;
	private Professor prof;
	private boolean ok;

	public Turma getTurma(){
		if(ok){
			System.out.printf("Nome professor: %s", prof.getNome());
			Turma t = new Turma(txtDataInicio.getText(), txtDataTermino.getText(), prof);
			return t;
		}
		else
			return null;
	}

	public DialogoTurma(Frame frame){
		super(frame,true);
		setLayout(new GridLayout(5,2));
	
		
		lblDataInicio = new JLabel("DataInicio: ");
		txtDataInicio = new JTextField();
		
		lblDataTermino = new JLabel("Data Termino: ");
		txtDataTermino = new JTextField();
		
		//lblProfessor = new JLabel("Professor: ");
		btAddProfessor = new JButton("Selecionar Professor:");
		txtProfessor = new JTextField();
		
		btOK = new JButton("OK");
		
		btCancelar = new JButton("Cancelar");
		
		bt 
		
		btAddProfessor.addActionListener((e)->{
			JanelaListarProfessor d = new JanelaListarProfessor(frame);
			prof = d.getProfessor();
			txtProfessor.setText(prof.getNome());
			
		});
		
		btCancelar.addActionListener((e)->{
			dispose();
		});
		
		btOK.addActionListener((e)->{
			ok = true;
			dispose();
		});
		
		add(lblDataInicio);
		add(txtDataInicio);
		
		add(lblDataTermino);
		add(txtDataTermino);
		
		//add(lblProfessor);
		add(btAddProfessor);
		add(txtProfessor);
		txtProfessor.setEditable(false);
		
		add(btCancelar);
		add(btOK);
		
		setSize(350,300);
		setVisible(true);
	}

}
