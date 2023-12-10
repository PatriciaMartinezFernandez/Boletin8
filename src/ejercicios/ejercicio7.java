package ejercicios;

import java.util.Scanner;

/*
 * Preguntar cuantos grupos son?? => for 0 => nGrupos
 * 
 * En el for: 
 * 	int[] mediaAlumnos = new int[5];
 * 	for => Para cada alumno, 3 notas
 * 		int[alumno][trimestre] Grupo = new int[5][3];
 * 		mediaAlumnos[] += media del alumno en cada iteracion del for
 * 	
 */

public class ejercicio7 {

	public static void imprimeNotas(int matriz[][], int index) {
		float media = 0;
		System.out.print("Notas del alumno " + (index) + ": ");
		for (int trimestre = 0; trimestre < matriz[0].length; trimestre++) {
			System.out.print(matriz[index - 1][trimestre] + " ");
			media += matriz[index - 1][trimestre] / 3.f;
		}
		System.out.println("\nNota media: " + media);
	}

	public static float mediaArr(int arr[]) {
		float suma = 0;

		for (int i = 0; i < arr.length; i++) {
			suma += arr[i];
		}

		return (suma / arr.length);
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
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos grupos son?");
		int nGrupos = sc.nextInt();

		int[][] grupo;
		float[] medias;
		int input;

		for (int i = 0; i < nGrupos; i++) {
			System.out.println("Grupo " + (i + 1) + "º");
			grupo = new int[5][3]; // alumnos & trimestres
			medias = new float[3];
			input = 0;

			// Para cada grupo
			for (int j = 0; j < grupo.length; j++) {
				// Para cada alumno
				System.out.println("Notas alumno " + (j + 1));
				// Pedir notas de cada trimestre
				for (int k = 0; k < grupo[0].length; k++) {
					System.out.print("\tNota " + (k + 1) + "º trimestre: ");
					grupo[j][k] = sc.nextInt();
				}
				System.out.println();
			}

			System.out.println("\nMedia de los trimestres");
			// calcular medias
			// Para cada trimestre
			for (int trimestre = 0; trimestre < 3; trimestre++) {
				// De cada alumno
				for (int alumno = 0; alumno < grupo.length; alumno++) {
					// Añadir la parte correspondiente de la media de cada nota (1/5)
					medias[trimestre] += grupo[alumno][trimestre] / 5.f;
				}
			}

			// Imprimir medias de los trimestres
			for (int j = 0; j < medias.length; j++) {
				System.out.println("Media trimestre " + (j + 1) + "º : " + medias[j]);
			}

			System.out.println("\nDe qué alumno quieres saber la media?");
			input = sc.nextInt();

			imprimeNotas(grupo, input);
			System.out.println();
		}
		
		sc.close();
	}

}
