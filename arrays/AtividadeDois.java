package arrays;

	import java.util.Scanner;

public class AtividadeDois {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		float [] valor = new float [10];
		float maiorPontuacao = 0, qtdMaiorP = 0, soma = 0, mediaA = 0;
		
		for (float i = 0; i < valor.length; i++) {
			System.out.println("Digite o valor do " + (i + 1) + "º lançamento: ");
			valor[(int)i] = input.nextFloat();
			soma = soma + valor[(int)i];
		} for (float i = 0; i < valor.length; i++) {
			System.out.println("O " + (i + 1) + "º valor lançado foi: " + valor[(int)i]);
			if (valor[(int)i] > maiorPontuacao) {
				qtdMaiorP = qtdMaiorP + 1;
				maiorPontuacao = valor[(int)i];
			}
		}
		mediaA = soma / 10;
		System.out.println("A média aritmética é: " + mediaA);
		System.out.println("A maior pontuação apresentada foi: " + maiorPontuacao);
		System.out.println("A maior pontuação foi apresentada " + qtdMaiorP + " vezes!");
	}
}
