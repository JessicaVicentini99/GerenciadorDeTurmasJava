public class Aluno extends Pessoa{
	
	private  String ra, dataMatricula;
	
	
	public Aluno(String nome,String cpf,String rg, String r, String d){
		super(nome,cpf,rg);
		ra = r;
		dataMatricula=d;
	}
	
	public String getNome(){
		return super.getNome();
	}
	
	public void setRa(String n)
	{
		ra = n;
	}
	
	public String getRa()
	{
		return ra;
	}
	
	public void setDataMatricula(String d)
	{
		dataMatricula=d;
	}
	
	public String getDataMatricula()
	{
		return dataMatricula;
	}
	
	public void apresentarDados()
	{
		super.apresentarDados();
		System.out.printf("Ra: %s\n", ra);
	}
	public String toString()
	{
		return super.toString()+" Ra: "+ra+"\n"+" Data Matricula: "+dataMatricula+"\n";
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Aluno){
			Aluno outro = (Aluno)o;
			if(ra.equals(outro.getRa())){
				return super.equals(outro);
			}
			return false;
		}
		return false;
	}
	
}
