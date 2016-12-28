class Empresa {

	String nome;
	String cnpj;
	Funcionario[] funcionarios;

	void adicionar(Funcionario funcionario){
		for (int i = 0; i < 3; i++) {
			if(this.funcionarios[i] == null){
				this.funcionarios[i] = funcionario;
				System.out.println("Posição " + i + " - " + funcionario.getNome() + " adicionado!");
				break;
			}
		}
	}

	void mostrarEmpregados(){
		for (int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] != null){
				System.out.println("Funcionário na posição: " + i);
				System.out.println("R$" + this.funcionarios[i].getSalario());
			}
		}
	}	

	void mostraTodasAsInformacoes(){
		for (int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] != null){
				funcionarios[i].mostra();
			}
		}
	}

	boolean contem(Funcionario f){
		for (int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] == f){
				return true;
			}
		}
		return false;
	}

}