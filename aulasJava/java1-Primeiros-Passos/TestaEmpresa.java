class TestaEmpresa {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome ("Adriel José");
		f1.setDepartamento ("TI");

		Funcionario f3 = new Funcionario();
		f3.setNome ("Antonio das Quantas");
		f3.setDepartamento ("Secretaria");

		Funcionario f2 = new Funcionario();
		f2.setNome ("Adriel Sales");
		f2.setDepartamento ("TI");

		Funcionario f4 = new Funcionario();
		f4.setNome ("Linda Mells");
		f3.setDepartamento ("Atendimento");

		Empresa empresa = new Empresa();
		empresa.nome = "Lojas Bahia";
		empresa.cnpj = "111.222.333/0001-00";
		empresa.funcionarios = new Funcionario[10];

		int i = 1;
		while(i < 5){
			Funcionario f = new Funcionario();
			f.setNome("Funcionaro nº " + i);
			f.setSalario(i * 2300);
			empresa.adicionar(f);
			i++;
		}

		//empresa.mostrarEmpregados();
		if(empresa.contem(f1)){
			System.out.println(f1.getNome() + " eh funcionario.");
		}


	}

}