package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Tablero tablero = new Tablero();
		tablero.CrearTablero();
		Tablero  tableroJugador = new Tablero();
		tableroJugador.CrearTablero();
		
		menuPrincipal(tablero);
		partidaIniciada(tablero, tableroJugador);
	}

	// Funcion para acceder al MENU PRINCIPAL.
	public static void menuPrincipal(Tablero tablero) {
		Scanner scan = new Scanner(System.in);
		String input = "";

		System.out.println("JUEGO INVASION A LA CAMARA SECRETA");
		System.out.println("----------------------------------");

		while (!input.equals("3")) {
			System.out.println("[1] INICIAR PARTIDA");
			System.out.println("[2] MEJORES PUNTAJES");
			System.out.println("[3] SALIR");
			System.out.println("----------------------------------");
			System.out.println("INGRESE NUMERO: ");
			input = scan.nextLine();

			if (input.equals("1")) {
				System.out.println("	Partida Iniciada, buena suerte!.");
				System.out.println("----------------------------------");
				tablero.CrearKromi(3);
				tablero.CrearCaguano(5);
				tablero.CrearTrupalla(10);
				break;
				
			} else if (input.equals("2")) {
				System.out.println("	Se han mostrado los puntajes");
				System.out.println("----------------------------------");
				
			} else if (input.equals("3")) {
				System.out.println("	Se ha cerrado el juego.");
				System.out.println("----------------------------------");
				System.exit(0);
			} else {
				System.out.println("	INPUT INVALIDO, INGRESE NUMERO VALIDO");
				System.out.println("----------------------------------");
			}
		}
	}

	// Funcion para MENU en partida iniciada.
	public static void partidaIniciada(Tablero tablero, Tablero tableroJugador) {
		Scanner scan = new Scanner(System.in);
		String input = "";

		while (!input.equals("3")) {
			tablero.MostrarTablero();
			System.out.println("[1] LANZAR HUEVO");
			System.out.println("[2] MOSTRAR SOLUCION");
			System.out.println("[3] FINALIZAR PARTIDA");
			System.out.println("----------------------------------");
			System.out.println("INGRESE NUMERO: ");
			input = scan.nextLine();

			if (input.equals("1")) {
				System.out.println("	Se ha lanzado un huevo.");
				System.out.println("----------------------------------");
				tablero.LanzarHuevo(tablero, tableroJugador);
				tableroJugador.MostrarTablero();
			} else if (input.equals("2")) {
				System.out.println("	Se ha mostrado el tablero.");
				System.out.println("----------------------------------");
				tablero.MostrarTablero();
				System.out.println("	PARTIDA FINALIZADA.");
				System.out.println("----------------------------------");				
				System.out.println("Tu puntaje FINAL es: " + tablero.CalcularPuntaje() + " Puntos.");
				System.out.println("----------------------------------");
				System.exit(0);
				
			} else if (input.equals("3")) {
				System.out.println("	PARTIDA FINALIZADA.");
				System.out.println("Tu puntaje FINAL es: " + tablero.CalcularPuntaje() + " Puntos.");
				System.out.println("----------------------------------");
			} else {
				System.out.println("	INPUT INVALIDO, INGRESE NUMERO VALIDO");
				System.out.println("----------------------------------");
			}
		}
		scan.close();
	}
}