package arrays;

	import java.util.Scanner;

public class AtividadeUm {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int [] x = new int [5];
		int maiorPontuação = 0;

		for (int i = 0; i < x.length; ++i) {
			System.out.println("Digite o " + (i +1) +"ª de pontuação da da atividade: ");
			x[i] = input.nextInt();
		} for (int i = 0; i < x.length; i++) {
			System.out.println("O valor informado para a " + (i +1) + "ª pontuação é de: " + x[i]);
				if (x[i] > maiorPontuação) {
				maiorPontuação = x[i];
				} 
		}	
		System.out.println("A maior pontuação é: " + maiorPontuação);
		}
	}

