package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	static Scanner sc = new Scanner(System.in);

	public static void imprimeMatriz(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}

	}

	public static int[][] rellenaMatrizAleatorio(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				matriz[i][j] = (int) (Math.random() * 9) + 1;
			}

		}

		return matriz;

	}

	public static int sumaFila(int arr[]) {

		int sumaFila = 0;

		for (int i = 0; i < arr.length; i++) {
			sumaFila += arr[i];
		}

		return sumaFila;

	}

	public static int[][] transpose(int matriz[][]) {

		int[][] matrizT = new int[matriz.length][matriz.length];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matrizT[i][j] = matriz[j][i];
			}
		}

		return matrizT;
	}

	public static void main(String[] args) {

		int[][] tabla = new int[10][10];

		tabla = rellenaMatrizAleatorio(tabla);
		imprimeMatriz(tabla);

		System.out.println("\n");

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Suma de la fila " + (i + 1) + "º: " + sumaFila(tabla[i]));
		}

		System.out.println();

		tabla = transpose(tabla);

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Suma de la columna " + (i + 1) + "º: " + sumaFila(tabla[i]));
		}

	}

}
