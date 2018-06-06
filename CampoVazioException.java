import javax.swing.JOptionPane;
public class CampoVazioException extends RuntimeException{
	
	public CampoVazioException(String campo)
	{
		JOptionPane.showMessageDialog(null, "O seguinte campo não deve estar vazio!: "+campo,"Erro", JOptionPane.ERROR_MESSAGE);
	}
}
