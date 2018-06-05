import java.util.List;
import java.util.LinkedList;

public class Turma{
	
		private List<Turma> lstTurma;
		private Professor prof; 
		private String dataInicio, dataTermino;
		
		public void setDataInicio(String d)
		{
			dataInicio = d;
		}
		public void setDataTermino(String dt)
		{
			dataTermino = dt;
		}
		
		public void setProfessor(Professor p)
		{
			prof = p;
		}
		
		public String getDataInicio()
		{
			return dataInicio;
		}
		
		public String getDataTermino()
		{
			return dataTermino;
		}
		public Professor getProfessor()
		{
			return prof;
		}
		
		
		
		
		
		
		
		
	
		public Turma(String di, String dt, Professor pr)
		{
			lstTurma = new LinkedList<>();
			dataInicio = di;
			dataTermino = dt;
			prof = pr;
		}
		
		public String toString()
		{
			return " Data Inicio: "+dataInicio+"\n"+" Data Fim: "+dataTermino+"\n"+" Professor: "+prof+"\n";
		}
		

		
		
		
	
}
