import javax.swing.JOptionPane;
public class DocumentoInvalidoException extends RuntimeException{
	
	public DocumentoInvalidoException(String doc)
	{
		JOptionPane.showMessageDialog(null, "Documento Invalido: "+doc,"Erro", JOptionPane.ERROR_MESSAGE);
	}
		

}
