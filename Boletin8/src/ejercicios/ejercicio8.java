package ejercicios;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {

		int menu = 0, totalParticipantes = 0, numDorsal;

		float mejor2002, mejor2001, mejor2000;

		String nombre;

		int[] participantes;
		int[] dorsales;
		String[] nombres;

		Scanner sc = new Scanner(System.in);

		while (menu != 4) {

			System.out.println("1) Inscribir un participante.");
			System.out.println("2) Mostrar listado de datos.");
			System.out.println("3) Mostrar listado por marcas.");
			System.out.println("4) Finalizar el programa.");

			System.out.print("\nIntroduce una opción: ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:

				if (totalParticipantes == 10) {

					System.out.println("Lo sentimos, las plazas están llenas.\n");

				}

				else {

					System.out.println("== Ficha Participante " + (totalParticipantes + 1) + "º ==\n");
					System.out.print("Nombre: ");
					nombre = sc.next();
					sc.nextLine();
					System.out.println("Número dorsal: ");
					numDorsal = sc.nextInt();
					System.out.print("\nMejor marca 2002: ");
					mejor2002 = sc.nextFloat();
					System.out.print("\nMejor marca 2001: ");
					mejor2001 = sc.nextFloat();
					System.out.print("\nMejor marca 2000: ");
					mejor2000 = sc.nextFloat();
					System.out.println("\n");

					totalParticipantes++;

					participantes = new int[totalParticipantes];
					dorsales = new int[totalParticipantes];
					nombres = new String[totalParticipantes];
					
					for (int i = 0; i < participantes.length; i++) {
						participantes[i] = i;
						dorsales[i] = numDorsal;
						nombres[i] = nombre;

					}

				}

				break;

			case 2: // se debe mostrar un listado por número de dorsal

				if (totalParticipantes == 0) {

					System.out.println("No hay participantes.\n");

				}

				else {
					for (int i = 0; i < participantes.length; i++) {

						System.out
								.println("Participante; " + i + ", Dorsal: " + dorsales[i] + ", Nombre: " + nombres[i]);

					}

				}

			case 3:
			case 4:

			}

		}

		sc.close();

	}

}
