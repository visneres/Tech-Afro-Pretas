package atividade_1;

	import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float n1, n2, n3, media;
		
		System.out.println("Informe a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("Informe a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2 + 3 + 5);
		
		System.out.println("Sua média final é: " + media + " !");
		
		leia.close();
		
	}

}
