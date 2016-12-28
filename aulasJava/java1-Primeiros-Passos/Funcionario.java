class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataDeEntradaNoBanco;
	String rg;

	/*um valor em %*/
	void recebeAumento(double valorDoAumento){
		double aumento = this.salario * valorDoAumento;
		this.salario += aumento;
	}

	double calculaGanhoAnual(){
		double ganhoAnual = this.salario * 12;
		System.out.println("Ganho Anual: R$ " + ganhoAnual);
		return ganhoAnual;
	}

	void mostra(){
		System.out.println("Funcionario: " + this.nome);
		System.out.println("RG: " + this.rg);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("No Banco desde: " + this.dataDeEntradaNoBanco);
		System.out.println("");

		System.out.println("Salario incial: " + this.salario);
		this.recebeAumento(0.5);
		System.out.println("Salario Apos aumento: " + this.salario);
		this.calculaGanhoAnual();
	}
}