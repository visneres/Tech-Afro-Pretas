package atividade_3;
//A prefeitura de uma cidade fez uma pesquisa entre 3 de seus habitantes, coletando dados sobre o salário e número de filhos.
//A prefeitura deseja saber:  
//a) média do salário da população; 
//b) média do número de filhos; 
//c) maior salário; 
//d) percentual de pessoas com salário até R$100,00.  



	import java.util.Scanner;

public class PesquisaHabitantes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int qtdFilho, c, filhos = 0, salarioMenor = 0;
		//a variável filhos será o acumulador
		float salario, mediaS, mediaF, percentual, maiorS = 0, s = 0;
		// s será o acumulador do salário
		
		for (c = 1; c <= 3; c++) {
			System.out.print("Digite o seu salário em R$: ");
			salario = leia.nextFloat();
			System.out.print("Digite quantos filhos você tem: ");
			qtdFilho = leia.nextInt();
			
			filhos = filhos + qtdFilho;
			s = s + salario;
			
			if (salario > maiorS) {
				maiorS = salario;
			}
			if (salario <= 100) {
				salarioMenor = salarioMenor + 1;
			}
		}
		
		mediaF = filhos / 3;
		mediaS = s / 3;
		percentual = (salarioMenor * 100) / 3;
		
		System.out.println("\nA média de filhos da população é de: " + mediaF);
		System.out.println("A média de salário da população é de: R$ " + mediaS);
		System.out.println("O maior salário informado é: R$ " + maiorS);
		System.out.print("O percentual de pessoas com salário de até R$ 100 é de: " + percentual + "%");
	}
}
