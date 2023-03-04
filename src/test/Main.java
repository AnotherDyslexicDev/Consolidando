package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Tablero tablero = new Tablero();
		menuPrincipal(tablero);

	}

	// Funcion para acceder al MENU PRINCIPAL.
	public static void menuPrincipal(Tablero tablero) {
		boolean tableroCreado = false;
		Scanner scan = new Scanner(System.in);
		String input = "";

		System.out.println("JUEGO INVASION A LA CAMARA SECRETA");
		System.out.println("----------------------------------");

		while (!input.equals("4")) {
			System.out.println("[1] CREAR TABLERO");
			System.out.println("[2] MOSTRAR TABLERO");
			System.out.println("[3] INICIAR PARTIDA");
			System.out.println("[4] SALIR");
			System.out.println("----------------------------------");
			System.out.println("INGRESE NUMERO: ");
			input = scan.nextLine();

			if (input.equals("1")) {
				System.out.println("	Tablero generado con exito.");
				System.out.println("----------------------------------");
//				tablero.CrearTablero();
				tablero.CrearCarro();
				tableroCreado = true;
			} else if ((input.equals("2") || input.equals("3")) && tableroCreado == false) {
				System.out.println("	EL tablero no ha sido creado.");
				System.out.println("----------------------------------");
			} else if (input.equals("2") && tableroCreado == true) {
				System.out.println("	Se ha mostrado el tablero.");
				System.out.println("----------------------------------");
				tablero.MostrarTablero();
			} else if (input.equals("3") && tableroCreado == true) {
				System.out.println("	Se ha iniciado el juego, buena suerte!.");
				System.out.println("----------------------------------");
				partidaIniciada(tablero);
			} else if (input.equals("4")) {
				System.out.println("	Se ha cerrado el juego");
				System.out.println("----------------------------------");
				System.exit(0);
			} else {
				System.out.println("	INPUT INVALIDO, INGRESE NUMERO VALIDO");
				System.out.println("----------------------------------");
			}
		}
		scan.close();
	}

	// Funcion para MENU en partida iniciada.
	public static void partidaIniciada(Tablero tablero) {
		Scanner scan = new Scanner(System.in);
		String input = "";

		while (!input.equals("4")) {
			System.out.println("[1] LANZAR HUEVO");
			System.out.println("[2] MOSTRAR TABLERO");
			System.out.println("[3] CALCULAR PUNTAJE");
			System.out.println("[4] FINALIZAR PARTIDA");
			System.out.println("----------------------------------");
			System.out.println("INGRESE NUMERO: ");
			input = scan.nextLine();

			if (input.equals("1")) {
				System.out.println("	HUEVO LANZADO!");
				System.out.println("----------------------------------");
				tablero.CrearTablero();
			} else if (input.equals("2")) {
				System.out.println("	Se ha mostrado el tablero.");
				System.out.println("----------------------------------");
				tablero.MostrarTablero();
			} else if (input.equals("3")) {
				System.out.println("	TU PUNTAJE ACTUAL ES: ");
				System.out.println("----------------------------------");
			} else if (input.equals("4")) {
				System.out.println("	HA FINALIZADO LA PARTIDA: ");
				System.out.println("----------------------------------");
				System.exit(0);
			} else {
				System.out.println("	INPUT INVALIDO, INGRESE NUMERO VALIDO");
				System.out.println("----------------------------------");
			}
		}
		scan.close();
	}
}