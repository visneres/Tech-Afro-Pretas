package atividade_2;
// Faça um programa que receba três inteiros e diga qual deles é o maior.

	import java.util.Scanner;
	
public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		int n1, n2, n3;
		
		System.out.print("Digite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			System.out.print("O maior número é: " + n1);
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.print("O maior número é: " + n2);
		} else if (n3 >= n1 && n3 >= n2) {
			System.out.print("O maior número é: " + n3);
		}
		
		leia.close();
				
	}
}

