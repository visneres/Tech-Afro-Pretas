package atividade_2;
//Faça um programa que entre com três números e coloque em ordem crescente.

	import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float n1, n2, n3;
		
		System.out.print("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.print("Digite o terceiro número: ");
		n3 = leia.nextFloat();
		
		if (n1 <= n2 && n1 <= n3 && n2 <= n3) {
			System.out.print("Verifique os valores informados em ordem crescente: " + n1 + ", " + n2 + " e " + n3);
		} else if (n1 <= n2 && n1 <= n3 && n3 <= n2) {
			System.out.print("Verifique os valores informados em ordem crescente: " + n1 + ", " + n3 + " e " + n2);
		} else if (n2 <= n1 && n2 <= n3 && n1 <= n3) {
			System.out.print("Verifique os valores informados em ordem crescente: " + n2 + ", " + n1 + " e " + n3);
		} else if (n2 <= n1 && n2 <= n3 && n3 <= n1) {
			System.out.print("Verifique os valores informados em ordem crescente: " + n2 + ", " + n3 + " e " + n1);
		} else if (n3 <= n1 && n3 <= n2 && n1 <= n2) {
			System.out.print("Verifique os valores informados em ordem crescente: " + n3 + ", " + n1 + " e " + n2);
		} else if (n3 <= n1 && n3 <= n2 && n2 <= n1) {
			System.out.print("Verifique os valores informados em ordem crescente: " + n3 + ", " + n2 + " e " + n1);
		}
	}
}
