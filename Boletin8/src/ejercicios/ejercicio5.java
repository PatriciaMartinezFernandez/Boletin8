package ejercicios;

public class ejercicio5 {
	public static void main(String[] args) {
		int[][] tabla = new int[7][7];

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				if (i == j) {
					tabla[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				if (tabla[i][j] == 1) {
					System.out.print("\u001B[1;31m1 ");
				} else
					System.out.print("\u001B[0m" +  tabla[i][j] + " ");
			}
			System.out.println();
		}
	}
}
