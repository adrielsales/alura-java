class Fatorial {
	public static void main(String[] args) {
		
		for (int numero = 0; numero <= 10 ; numero++) {
			System.out.println("No for " + numero);
			if(numero == 0){
				System.out.println(numero + "! = 1");
			} else if (numero == 1){
				System.out.println(numero + "! = 1");
			} else {
				int numeroAtual = numero;
				int calculo = 0;
				int resultadoTotal = 0;
				System.out.println("NUmero antes " + numeroAtual);
				// while(numeroAtual > 1){
				// 	calculo = numeroAtual * (numeroAtual - 1);
				// 	resultadoTotal = resultadoTotal + calculo;
				// 	numeroAtual--;
				// 	System.out.println(resultadoTotal);
				// 	System.out.println("NUmero depois " + numeroAtual);
				// 				try{
				// 				Thread.sleep(1000);
				// 				} catch (InterruptedException ex) {
				// 					System.out.println(ex);
				// 				}
				// }

				for (int n = 1; n < numeroAtual; n++) {
					resultadoTotal += n * numeroAtual;
					numeroAtual--;
						System.out.println("NUmero depois " + numeroAtual);
								try{
								Thread.sleep(1000);
								} catch (InterruptedException ex) {
									System.out.println(ex);
								}					
				}
				System.out.println("fatorial de " + numeroAtual + " = " + resultadoTotal);

				System.out.println("");
			}
		}

	}
}