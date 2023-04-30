package atividade_1;

	import java.util.Scanner;
	
public class DistanciaEntrePontos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float x1, y1, x2, y2, distancia;
		
		System.out.print("Digite o primeiro ponto, x1: ");
		x1 = leia.nextFloat();
		
		System.out.print("Digite o segundo ponto, y1: ");
		y1 = leia.nextFloat();
		
		System.out.print("Digite o terceiro ponto, x2: ");
		x2 = leia.nextFloat();
		
		System.out.print("Digite o quarto ponto, y2: ");
		y2 = leia.nextFloat();
		
		distancia = (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.print("A distância entre os pontos é: " + distancia);
		
		leia.close();
				
	}

}
