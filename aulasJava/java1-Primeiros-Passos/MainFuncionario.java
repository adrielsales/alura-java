class MainFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();

		funcionario1.nome = "Adriel Sales";
		funcionario1.departamento = "TI";
		funcionario1.salario = 1000.0;
		funcionario1.dataDeEntradaNoBanco = "01/01/1999";
		funcionario1.rg = "2225001";

		funcionario1.mostra();

	}
}