package ejercicios;

import java.util.Scanner;

public class ejercicio3 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void imprimeMatriz(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}

	}
	
	public static int[][] rellenaMatriz(int matriz[][]) {
		
		int numero;
		
		System.out.println("Introduce los números: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("[" + i + "]" + "[" + j + "] = ");
				numero = sc.nextInt();
				
				matriz[i][j] = numero;
			}
			
		}
		
		return matriz;
		
	}

	public static void main(String[] args) {
		
		int[][] tabla1 = new int[3][3];
		int[][] tabla2 = new int[3][3];
		int[][] tablaSuma = new int[3][3];
		
		tabla1 = rellenaMatriz(tabla1);
		System.out.println("\nTabla1");
		imprimeMatriz(tabla1);
		
		System.out.println("\n");
		
		tabla2 = rellenaMatriz(tabla2);
		System.out.println("\nTabla2");
		imprimeMatriz(tabla2);
		
		System.out.println("\n");
		
		System.out.println("\nTablaSuma");
		
		for (int i = 0; i < tablaSuma.length; i++) {
			for (int j = 0; j < tablaSuma.length; j++) {
				tablaSuma[i][j] = tabla1[i][j] + tabla2[i][j];
			}
		}
		
		imprimeMatriz(tablaSuma);
		
	}

}
