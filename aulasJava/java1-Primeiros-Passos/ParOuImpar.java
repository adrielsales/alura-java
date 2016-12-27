class ParOuImpar {

	public static void main(String[] args) {

		long x = 128300;
		System.out.print(x + " > ");

		while(x != 1) {
			if(x % 2 == 0){
				x = x / 2;
			} else {
				x = (3 * x) + 1;
			}

			System.out.print(x + " > ");
		}
		System.out.println("");
	}
}