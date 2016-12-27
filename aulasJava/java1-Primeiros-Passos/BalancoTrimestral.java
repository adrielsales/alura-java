class BalancoTrimestral {
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastosTrimestrais = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaTrimestral = gastosTrimestrais/3;

		System.out.println("O gasto trimestral: R$ " + gastosTrimestrais);
		System.out.println("Média dos gastos trimestrais: R$ " + mediaTrimestral);
	}
}