class Exemplo1 {
	public static void main(String[]args) {
		/*
		Comentáriode múltiplas linhas
		declaração de uma variável do tipo inteiro
		*/
			int anoNascimento;
		//atribuição do valor à variável
		/*
		métodos de conversão String para número
		String para int:
			Integer.parseInt( variavel a ser convertida );
			
		String para double;
			Double.parseDouble( variável a ser  convertida );
		*/
				anoNascimento = Integer.parseInt( args[1]);
				
			int idade = 2019 - anoNascimento;
			
			//declaração e atribuição de uma varável de texto
			String nomePessoal = args[0];
		/*
		o caractere '+' usado entre textos e variáveis exerce o papel de concatenação (junção)
		*/
		System.out.println(nomePessoal + " Sua idade e = " + idade);
	}
}	