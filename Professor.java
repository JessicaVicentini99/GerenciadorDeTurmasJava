public class Professor extends Pessoa{
	private String especialidade;
	
	public Professor(String nome,String cpf,String rg, String e){
		super(nome,cpf,rg);
		especialidade = e;
	}
	
	public void setEspecialidade(String n)
	{
		especialidade = n;
	}
	
	public String getEspecialidade()
	{
		return especialidade;
	}
	
	public void apresentarDados()
	{
		super.apresentarDados();
		System.out.printf(" Especialidade: %s\n", especialidade);
	}
	
	public String toString()
	{
		return super.toString()+"Especialização: "+especialidade+"\n";
	}
	
	
	public boolean equals(Object o)
	{
		if(o instanceof Professor){
			if(super.equals(o) && especialidade.equals(((Professor) o). getEspecialidade()))
				return true;
			}
		return false;	
	}
	public void executarTarefa()
	{
		System.out.printf("Professor esta Ensinando");
	}
	
}
