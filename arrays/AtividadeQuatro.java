package arrays;

	import java.util.Scanner;

public class AtividadeQuatro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int [][] m1 = new int [3][3];
		int soma = 0, somaDiagonal = 0;
		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite o valor da posição linha [" + linha + "] coluna [" + coluna + "]: ");
				m1 [linha][coluna] = leia.nextInt();
				soma = soma + m1 [linha][coluna];
			}
		}
		System.out.println("A soma dos valores da matriz é: " + soma);

		somaDiagonal = m1 [0][0] + m1 [1][1] + m1 [2][2];
		System.out.println("A soma dos valores da diagonal principal é: " + somaDiagonal);
	}
}
