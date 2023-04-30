package atividade_3;
//Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
//Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.

	import java.util.Scanner;

public class UmSomaUm {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero, soma = 0, n = 0;
		
		System.out.print("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		do {
			if (numero >= n) {
				n = n + 1;
				soma = soma + n;
				
			}	
		}
		while (n < numero);
		System.out.println("A soma de todos os números de 1 até o número informado é: " + soma);
	}
}
