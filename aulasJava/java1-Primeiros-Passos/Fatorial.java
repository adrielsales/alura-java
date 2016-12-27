//com números pequenos - int
// class Fatorial {
// 	public static void main(String[] args) {

// 		for (int numero = 0; numero <= 10 ; numero++) {
// 			if(numero == 0){
// 				System.out.println(numero + "! = 1");
// 			} else if (numero == 1){
// 				System.out.println(numero + "! = 1");
// 			} else {
// 				int numeroAtual = numero;

// 				for (int n = 1; n < numero; n++) {
// 					numeroAtual = numeroAtual * n;
// 				}
// 				System.out.println(numero + "! = " + numeroAtual);

// 				System.out.println("");
// 			}
// 		}

// 	}
// }

//com números longos - long
class Fatorial {
	public static void main(String[] args) {

		for (int numero = 0; numero <= 0 ; numero++) {
			if(numero == 0){
				System.out.println(numero + "! = 1");
			} else if (numero == 1){
				System.out.println(numero + "! = 1");
			} else {
				long numeroAtual = numero;

				for (int n = 1; n < numero; n++) {
					numeroAtual = numeroAtual * n;
				}
				System.out.println(numero + "! = " + numeroAtual);

				System.out.println("");
			}
		}

	}
}