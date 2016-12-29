class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private Data dataDeEntradaNoBanco = new Data();
	private String rg;

	private static int proximoIdentificador;
	private int identificador;

	public Funcionario(){}

	public Funcionario(String nome){
		this.nome = nome;
		this.identificador = ++Funcionario.proximoIdentificador;
	}

	public int getIdentificador(){
		return this.identificador;
	}

	/*um valor em %*/
	public void recebeAumento(double valorDoAumento){
		double aumento = this.salario * valorDoAumento;
		this.salario += aumento;
	}

	public double calculaGanhoAnual(){
		double ganhoAnual = this.salario * 12;
		System.out.println("Ganho Anual: R$ " + ganhoAnual);
		return ganhoAnual;
	}

	public void mostra(){
		System.out.println("Funcionario: " + this.nome);
		System.out.println("RG: " + this.rg);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("No Banco desde: " + this.dataDeEntradaNoBanco.getFormatada());
		//System.out.println("");
		System.out.println("Salario incial: " + this.salario);
		this.recebeAumento(0.5);
		System.out.println("Salario Apos aumento: " + this.salario);
		System.out.println("Identificador nº: " + getIdentificador());
		this.calculaGanhoAnual();
		System.out.println("");
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public void setDataDeEntradaNoBanco(int dia, int mes, int ano){
		this.dataDeEntradaNoBanco.criaData(dia, mes, ano);
	}

	public void setRg(String rg){
		this.rg = rg;
	}

	public String getNome(){
		return this.nome;
	}

	public String getDepartamento(){
		return this.departamento;
	}

	public double getSalario(){
		return this.salario;
	}

	public Data getDataDeEntradaNoBanco(){
		return this.dataDeEntradaNoBanco;
	}

	public String getRg(){
		return this.rg;
	}

}