class Media {
	public static void main(String[]args) {
		double a, b, c, x;
		System.out.println(" Lendo o valor a ");
		a= Double.parseDouble(args[0]);
		
		System.out.println(" Lendo o valor b ");
		b= Double.parseDouble(args[1]);
		
		System.out.println(" Lendo o valor c ");
		c= Double.parseDouble(args[2]);
		x= (a + b + c) /3;
		
		System.out.println("RESULTADO: " + x);
	}
}	
	