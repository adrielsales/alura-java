class Lacos {
	public static void main(String[] args) {
		int contador = 1;
		int soma = 0;
		while(contador <= 1000){
			soma += contador;
			System.out.println("Contador = " + contador + " - Soma = " + soma);
			contador++;
		}
	}
}