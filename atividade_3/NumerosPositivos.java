package atividade_3;

	import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float n, soma = 0, qtd = 0, media = 0;
		
		System.out.println("Digite um número: ");
		n = leia.nextFloat();
		
		while (n >= 0){
			soma = soma + n;
			qtd = qtd + 1;
			media = soma / qtd;
			
		System.out.println("Digite um número: ");
		n = leia.nextFloat();

	}
		System.out.println("O somatório total dos números positivos é: " + soma);
		System.out.println("A quantidade de números positivos contabilizados é: " + qtd);
		System.out.println("A média dos números positivos informados é: " + media);
	}
}
