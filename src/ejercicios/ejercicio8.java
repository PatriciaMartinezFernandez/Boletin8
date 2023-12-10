package ejercicios;

import java.util.Scanner;

public class ejercicio8 {
	public static int[][] addParticipante(int[][] participantes, int dorsal, int marca2002, int marca2001,
			int marca2000) {

		// Si tenemos participantes guardados
		if (participantes.length > 0) {
			// guardar esos participantes
			int[][] tmp = participantes;
			// re-crear el array con una cajita mas
			participantes = new int[tmp.length + 1][tmp[0].length];

			// pasar los participantes que ya teniamos
			for (int i = 0; i < tmp.length; i++) {
				for (int j = 0; j < tmp[0].length; j++) {
					participantes[i][j] = tmp[i][j];
				}
			}
		} else {
			// Si no tenemos participantes, crear el primer espacio para rellenarlo
			participantes = new int[1][4];
		}

		// Añadir el nuevo participantes al final de array
		participantes[participantes.length - 1][0] = dorsal;
		participantes[participantes.length - 1][1] = marca2002;
		participantes[participantes.length - 1][2] = marca2001;
		participantes[participantes.length - 1][3] = marca2000;

		return participantes;
	}

	public static String[] addNombreParticipante(String[] nombres, String nombre) {
		// Si tenemos nombres guardados
		if (nombres.length > 0) {
			// Guardar esos nombres
			String[] tmp = nombres;
			// re-crear el array con una cajita mas
			nombres = new String[tmp.length + 1];

			// pasar los nombres que ya teniamos
			for (int i = 0; i < tmp.length; i++) {
				nombres[i] = tmp[i];
			}
		} else {
			// Si no tenemos nombres, crear el primer espacio para rellenarlo
			nombres = new String[1];
		}

		// Añadir el nuevo nombre
		nombres[nombres.length - 1] = nombre;

		return nombres;
	}

	public static void imprimirParticipante(int participante, int[][] participantes, String[] nombres) {
		System.out.println("Participante " + participante);
		System.out.println("\tNombre: " + nombres[participante]);
		System.out.println("\tNumero Dorsal: " + participantes[participante][0]);
		System.out.println("\tMejor marca 2002: " + participantes[participante][1]);
		System.out.println("\tMejor marca 2001: " + participantes[participante][2]);
		System.out.println("\tMejor marca 2000: " + participantes[participante][3]);
		System.out.println();
	}

	/**
	 * x = 0 => Dorsales x = 1 => Marca2002 x = 2 => Marca2001 x = 3 => Marca2000
	 */
	public static int[][] ordenarPorXMenoraMayor(int[][] participantes, int X) {
		int index = 0;
		int[] swap;

		// va comparando todos los numeros del array, array.length - 1 veces
		// en cada iteracion, se compara un numero menos
		while (index < participantes.length) {
			for (int i = 0; i < participantes.length - 1 - index; i++) {
				// si el numero i es mayor que el siguiente, intercambiarlos
				if (participantes[i][X] > participantes[i + 1][X]) {
					swap = participantes[i];
					participantes[i] = participantes[i + 1];
					participantes[i + 1] = swap;
				}
			}
			// añadir uno al index, para comparar un numero menos la proxima vez
			index++;
		}

		return participantes;
	}

	/**
	 * x = 0 => Dorsales x = 1 => Marca2002 x = 2 => Marca2001 x = 3 => Marca2000
	 */
	public static int[][] ordenarPorXMayoraMenor(int[][] participantes, int X) {
		int index = 0;
		int[] swap;

		while (index < participantes.length) {
			for (int i = 0; i < participantes.length - 1 - index; i++) {
				if (participantes[i][X] < participantes[i + 1][X]) {
					swap = participantes[i];
					participantes[i] = participantes[i + 1];
					participantes[i + 1] = swap;
				}
			}
			index++;
		}

		return participantes;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0, totalParticipantes = 0, numDorsal = 0;
		int mejor2002, mejor2001, mejor2000;
		String nombre;

		int[][] participantes = new int[0][0];
		String[] nombres = new String[0];

		System.out.println("1) Inscribir un participante.");
		System.out.println("2) Mostrar listado de datos.");
		System.out.println("3) Mostrar listado por marcas.");
		System.out.println("4) Finalizar el programa.");

		System.out.print("\nIntroduce una opción: ");
		menu = sc.nextInt();

		while (menu != 4) {
			switch (menu) {
			case 1:
				if (totalParticipantes == 10) {
					System.out.println("Lo sentimos, las plazas están llenas.\n");
				} else {
					totalParticipantes++;

					System.out.println("== Ficha Participante " + (totalParticipantes) + "º ==\n");
					System.out.print("Nombre: ");
					nombre = sc.next();
					sc.nextLine();
					System.out.print("Número dorsal: ");
					numDorsal = sc.nextInt();
					System.out.print("Mejor marca 2002: ");
					mejor2002 = sc.nextInt();
					System.out.print("Mejor marca 2001: ");
					mejor2001 = sc.nextInt();
					System.out.print("Mejor marca 2000: ");
					mejor2000 = sc.nextInt();
					System.out.println("\n");

					participantes = addParticipante(participantes, numDorsal, mejor2002, mejor2001, mejor2000);
					nombres = addNombreParticipante(nombres, nombre);
				}

				break;

			case 2: // se debe mostrar un listado por número de dorsal

				if (totalParticipantes == 0) {
					System.out.println("\nNo hay participantes.\n\n");
				} else {
					System.out.println("== Jugadores, ordenados por numero de dorsal ==");
					participantes = ordenarPorXMenoraMayor(participantes, 0);
					for (int i = 0; i < participantes.length; i++) {
						imprimirParticipante(i, participantes, nombres);
					}
				}

				break;

			case 3:
				if (totalParticipantes == 0) {
					System.out.println("\nNo hay participantes.\n\n");
				} else {
					System.out.println("== Jugadores, ordenados por mejor marca de 2002 ==");
					participantes = ordenarPorXMayoraMenor(participantes, 1);
					for (int i = 0; i < participantes.length; i++) {
						imprimirParticipante(i, participantes, nombres);
					}
				}
				break;
			case 4:
				break;
			}

			System.out.println("1) Inscribir un participante.");
			System.out.println("2) Mostrar listado de datos.");
			System.out.println("3) Mostrar listado por marcas.");
			System.out.println("4) Finalizar el programa.");

			System.out.print("\nIntroduce una opción: ");
			menu = sc.nextInt();

		}

		sc.close();

	}

}
