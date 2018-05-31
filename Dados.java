import java.util.List;
import java.util.LinkedList;


public class Dados{

	private static Dados instance;

	public static Dados getInstance(){
		if(instance==null){
			instance = new Dados();
		}
		return instance;
	}

	private List<Aluno> lstAlunos;
	private List<Professor> lstProfessor;
	private List<Turma> lstTurma;
	
	private Dados(){
		lstAlunos = new LinkedList<>();
		lstProfessor = new LinkedList<>();
		lstTurma = new LinkedList<>();
	}
	
	public List<Aluno> getListAlunos(){
		return lstAlunos;
	}
	public List<Professor> getListProfessor(){
		return lstProfessor;
	}
	public List<Turma> getListTurma(){
		return lstTurma;
	}

}
