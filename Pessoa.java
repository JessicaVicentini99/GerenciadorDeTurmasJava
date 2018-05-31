public class Pessoa{
	
	private String nome, cpf, rg;
	
	public Pessoa(String n,String c,String r){
		nome = n;
		cpf = c;
		rg = r;
	}
		public void setNome(String n)
	{
		nome = n;
	}
	public void setCpf(String n)
	{
		cpf = n;
	}
	public void setRg(String n)
	{
		rg = n;
	}
	
	
	public String getNome()
	{
		return nome;
	}
	public String getCpf()
	{
		return cpf;
	}
	public String getRg()
	{
		return rg;
	}
	
	
	
	public void apresentarDados() {
		System.out.printf("Nome %s\n",nome);
		System.out.printf("Cpf: %s\n", cpf);
		System.out.printf("Rg: %s\n", rg);
	}
	
	public String toString(){
		return "Nome: "+nome+"\n"+
				" Cpf: "+cpf+"\n"+
				" RG: "+rg+"\n";
		}
		
	public boolean equals(Object o)
	{
		
		if(o instanceof Pessoa)
		{
			Pessoa outra = (Pessoa)o;
			if((nome.equals(outra.getNome()))&&(cpf.equals(outra.getCpf()))&& 
			(rg.equals(outra.getRg())))
			return true;
		}
		return false;
	}	

}

