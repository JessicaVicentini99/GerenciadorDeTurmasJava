import javax.swing.JOptionPane;
public class NomeInvalidoException extends RuntimeException{
	
	public NomeInvalidoException(String msg){
		super("Nome Invalido!");
		JOptionPane.showMessageDialog(null, "Nome Invalido: "+msg,"Erro", JOptionPane.ERROR_MESSAGE);
	}
}
