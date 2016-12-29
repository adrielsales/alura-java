class MainFuncionario {
	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario("Adriel José");
		funcionario1.setDepartamento ("TI");
		funcionario1.setSalario(1000.0);
		funcionario1.setDataDeEntradaNoBanco(15,05,2005);
		funcionario1.setRg ("2225001");

		Funcionario f3 = new Funcionario();
		f3.setNome ("Antonio das Quantas");
		funcionario1.mostra();

		Funcionario funcionario2 = new Funcionario("Eli Sales");
		funcionario2.setDepartamento ("TI");
		funcionario2.setSalario(1000.0);
		funcionario2.setDataDeEntradaNoBanco(01,01,1999);
		funcionario2.setRg ("2225001");
		funcionario2.mostra();

		Funcionario f4 = new Funcionario("Linda Mells");
		f4.mostra();

		if(funcionario1 == f3){
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}

		Empresa empresa = new Empresa(5);
		empresa.nome = "Lojas Bahia";
		empresa.cnpj = "111.222.333/0001-00";

		empresa.adicionar(funcionario1);
		empresa.adicionar(funcionario2);
		empresa.adicionar(f3);
		empresa.adicionar(f4);

	}
}