
public class Turma{
	
		private Aluno[] alunos;
		private Professor prof; 
		private String dataInicio, dataTermino;
		private	int a;
		
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
		
		public boolean addAluno(Aluno al)
		{
			if(a<alunos.length){
				alunos [a++] = al;
				return true;
			}
			return false;
		}
		
		public boolean removeAluno(int idx)
		{
			if(idx<a){
				alunos[idx] = alunos [--a];
				return true;
			}
			return false;
		}
		
		public Aluno getAluno(int idx)
		{
			if(idx<a){
				return alunos[idx];
			}
			return null;
		}
		
		public void listarAlunos(){
			for(int i=0;i<a;i++){
				System.out.printf("Aluno: %d\n", i);
				System.out.printf("Nome: %s\n", alunos[i].getNome());
				System.out.printf("Ra: %s\n", alunos[i].getRa());
				System.out.printf("Cpf: %s\n", alunos[i].getCpf());
				System.out.printf("Rg: %s\n", alunos[i].getRg());
			}
		}
	
		public Turma(String di, String dt)
		{
			alunos = new Aluno[100];
			a=0;
			dataInicio = di;
			dataTermino = dt;
		//	prof = pr;
		}
		
		public String toString()
		{
			return " Data Inicio: "+dataInicio+"\n"+" Data Fim: "+dataTermino+"\n";
		}
		

		
		
		
	
}
