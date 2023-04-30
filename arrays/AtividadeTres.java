package arrays;

public class AtividadeTres {

	public static void main(String[] args) {
		
		int [][] n1 = {{4, 6}};
		int [][] n2 = {{4, 6}};
		int [][] m1 = new int [1][2];
		int [][] m2 = new int [1][2];
		
		
		System.out.println("Verifique a matriz de notas N1: [" + n1[0][0] + "][" + n1[0][1] + "]");
	
		System.out.println("Verifique a matriz de notas N2: [" + n2[0][0] + "][" + n2[0][1] + "]");
		
		for (int linha = 0; linha < 1 ; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				m1 [linha][coluna] = n1 [linha][coluna] + n2 [linha][coluna];				
	}
			
		}
		System.out.println("\nVerifique a matriz M1, que é a soma dos elementos de mesma posição das matrizes N1 e N2: [" + m1 [0][0] + "][" + m1[0][1] + "]");
		System.out.println("\nVerifique a matriz M2, que é a subtração dos elementos de mesma posição das matrizes N1 e N2: [" + m2 [0][0] + "][" + m2[0][1] + "]");
	}
}

