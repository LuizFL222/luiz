class Soma {
	public static void main(String[]args){
		int a, b, x;
		System.out.println("Lendo o valor a");
		a= Integer.parseInt(args[0]);
		
		System.out.println("lendo o valor b");
		b= Integer.parseInt(args[1]);
		x= a + b;
		
		System.out.println("RESULTADO: " + x);
	}
}	