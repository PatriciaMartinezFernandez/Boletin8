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

	public static void imprimeNotas(int matriz[][]) {
		for (int alumno = 0; alumno < matriz.length; alumno++) {
			System.out.print("Notas alumno " + (alumno+1) + ": ");
			for (int trimestre = 0; trimestre < matriz[0].length; trimestre++) {
				System.out.print(matriz[alumno][trimestre] + " ");
			}
			System.out.println();
		}
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

		for (int i = 0; i < nGrupos; i++) {
			System.out.println("Grupo " + (i + 1) + "º");
			grupo = new int[5][3]; // alumnos & trimestres
			medias = new float[3];

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
			
			System.out.println("Notas del grupo");
			imprimeNotas(grupo);
			
			System.out.println("Media de los trimestres");
			// calcular medias
			for (int k = 0; k < medias.length; k++ ) {
				medias[i] = mediaArr(transpose(grupo)[i]);
				System.out.println(medias[i]);
			}
			
		}
	}

}
