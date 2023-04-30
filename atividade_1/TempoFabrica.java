package atividade_1;

	import java.util.Scanner;
	
public class TempoFabrica {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero, horas, minutos, segundos;
		
		//Entrada de dados
		System.out.println("Escreva o tempo de duração do evento da fábrica em segundos: ");
		numero = leia.nextInt();
		
		horas = numero / 3600;
		minutos = (numero % 3600)/ 60;
		segundos = (numero % 3600) % 60;
		
		//Saída de dados
		System.out.println("\nA duração do evento foi de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos!");
		
		
	}

}
