package atividade_2;
//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto


	import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <=14) {
		System.out.print("Você se encontra na categoria infantil (entre 10 e 14 anos)!");
		} else if (idade >= 15 && idade <= 17) {
			System.out.print("Você se encontra na categoria juvenil (entre 15 e 17 anos)!");
		} else if (idade >= 18 && idade <= 25) {
			System.out.print("Você se encontra na categoria adulto (entre 18 e 25 anos)!");
		}
		leia.close();
	}

}
