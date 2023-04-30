package atividade_3;

	import java.util.Scanner;

public class MultiplicacaoPorTres {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float numero;
		
		System.out.print("Digite um número: ");
		numero = leia.nextFloat();
		System.out.println("O número digitado foi: " + numero);
		
		while (numero <= 100) {
			
			numero = numero * 3;
			System.out.println(numero);
		}

	}

}
