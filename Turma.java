import java.util.List;
import java.util.LinkedList;

public class Turma{
	
		private List<Aluno> lstAluno;
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
		
		
		public void addAluno(Aluno a)
		{
				lstAluno.add(a);
		}
		
		public void rmvAluno(Aluno a)
		{
			lstAluno.remove(a);
		}
		
		
		
	
		public Turma(String di, String dt, Professor pr)
		{
			lstAluno = new LinkedList<>();
			dataInicio = di;
			dataTermino = dt;
			prof = pr;
		}
		
		public String toString()
		{
			return " Data Inicio: "+dataInicio+"\n"+" Data Fim: "+dataTermino+"\n"+" Professor: "+prof+"\n";
		}
		
		
		public List<Aluno> getAlunos(){
			return lstAluno;
		}

		
		
		
	
}
