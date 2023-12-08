package ejercicios;

public class ejercicio1 {

	public static void main(String[] args) {
		int[][] num = new int[5][5];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				num[i][j] = i + j;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println();
			for (int j = 0; j < num.length; j++) {
				System.out.print(num[i][j] + " ");
			}
		}
	}

}
