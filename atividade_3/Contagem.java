package atividade_3;
//Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 quando estiver entre 300 e 400 
//e de 5 em 5 quando não estiver.


public class Contagem {

	public static void main(String[] args) {
		
		int numero = 233;
	
				do {
					if (numero >= 300 && numero <= 400) {
						numero = numero + 3;
						System.out.println("Somando número de 3 em 3: " + numero);
					} else {
						numero = numero + 5;
						System.out.println("Somando número de 5 em 5: " + numero);
					}
				}
				while (numero <= 456);
					
	}
	
}
