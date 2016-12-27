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
}