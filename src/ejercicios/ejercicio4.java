package ejercicios;

public class ejercicio4 {

	public static void main(String[] args) {

		int[][] tabla = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] tablaT = new int[tabla.length][tabla.length];

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tablaT[i][j] = tabla[j][i];
			}
			
		}
		
		System.out.println("Tabla 1:");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				System.out.print(tabla[i][j] + " "); 
			}
			System.out.println();
		}
		
		System.out.println("\nTabla 1 transpuesta: ");
		for (int i = 0; i < tablaT.length; i++) {
			for (int j = 0; j < tablaT.length; j++) {
				System.out.print(tablaT[i][j] + " "); 
			}
			System.out.println();
		}

	}

}
