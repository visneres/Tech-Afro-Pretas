package atividade_3;
//Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram 
//no conjunto dos números de 1 até 500.

public class SomaImparesMultiplosTres {

	public static void main(String[] args) {
		
		int n, soma = 0;
				
		for (n = 1; n <= 500; n++){
				if (n % 2 != 0 && n % 3 == 0) {
					soma = soma + n;
				}
}
		System.out.println("A soma dos números ímpares que são múltiplos de 3, entre 1 e 500, é: " + soma);
		
	}
}

