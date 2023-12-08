package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void imprimeMatriz(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}

	}

	public static void main(String[] args) {
		int[][] tabla = new int[4][4];
		boolean simetrico;
		Scanner numero = new Scanner(System.in);
		System.out.println("Introduce los números: ");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				System.out.print("[" + i + "]" + "[" + j + "]" + "=");
				tabla[i][j] = numero.nextInt();
			}
		}
		
		imprimeMatriz(tabla);
		
		simetrico = true;
		int control = tabla.length - 1;
		int i = 0;
		while (i < control && simetrico == true) {
			int j = 0;
			while (j < control && simetrico == true) {
				if (tabla[i][j] != tabla[j][i]) {
					simetrico = false;
				}
				j++;
			}
			i++;
		}
		if (simetrico) {
			System.out.println("\nLa tabla resulta Simétrica.");
		} else {
			System.out.println("\nLa tabla no es Simétrica.");
		}
	}

}
