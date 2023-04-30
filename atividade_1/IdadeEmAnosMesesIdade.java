package atividade_1;

	import java.util.Scanner;

public class IdadeEmAnosMesesIdade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
				
		int idade;
		int anos;
		int meses;
		int dias;
		
		//Entrada de dados
		System.out.println("Escreva sua idade em dias: ");
		idade = leia.nextInt();
		
		anos = idade / 365;
		meses = (idade % 365) / 30;
		dias = (idade % 365) % 30;
				
		//Saída de dados
		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias de vida!");
		
	}

}
