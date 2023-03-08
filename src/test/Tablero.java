package test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tablero {
	
	// Atributos de la clase Tablero.
	char[][] Matriz = new char[15][15];
	ArrayList<Carro> listaCarros = new ArrayList<Carro>();
	ArrayList<Huevo> listaHuevos = new ArrayList<Huevo>();
	static Random random = new Random();
	
	// Metodos para crear vehiculos y posicionarlos en el Tablero.
	public void CrearKromi(int numero) {
		for (int i = 0; i < numero; i++) {
		listaCarros.add(new Kromi(4 + random.nextInt(5), 2000 + random.nextInt(24),
				  random.nextInt(13), random.nextInt(15), 1980 + random.nextInt(44),
				  "AllCatsAreBeautyfull"));
		verificacionCarro(listaCarros.get(listaCarros.size() - 1));
		}
	}
	public void CrearCaguano(int numero) {
		for (int i = 0; i < numero; i++) {
		listaCarros.add(new Caguano(2 +
				  random.nextInt(5), 2000 + random.nextInt(24), random.nextInt(15),
				  random.nextInt(14), 25 + random.nextInt(26), "Pink"));
		verificacionCarro(listaCarros.get(listaCarros.size() - 1));
		}
	}
	public void CrearTrupalla(int numero) {
		for (int i = 0; i < numero; i++) {
		listaCarros.add(new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24),
				  random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5),
				  "Piranha Bot N: 0" + (i + 1)));
		verificacionCarro(listaCarros.get(listaCarros.size() - 1));
		}
	}
	
	public void LanzarHuevo(Tablero tablero, Tablero tableroJugador) {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		int puntaje;
		System.out.println("	INGRESE NUMERO DE COLUMNA: (VALOR ENTERO ENTRE 1 y 15 INCLUSIVES)");
		x = scan.nextInt() - 1;
		scan.nextLine();
		System.out.println("	INGRESE NUMERO DE FILA: (VALOR ENTERO ENTRE 1 y 15 INCLUSIVES)");
		y = scan.nextInt() - 1;
		scan.nextLine();
		System.out.println("----------------------------------");
		
		if (tablero.Matriz[x][y] == '-') {
			tableroJugador.Matriz[x][y] = 'H';
			puntaje = 0;
			System.out.println("Has fallado! + 0 Puntos.");
		}
		else if (tablero.Matriz[x][y] == 'K') {
			tableroJugador.Matriz[x][y] = 'H';
			puntaje = 3;
			System.out.println("Has golpeado una Kromi! + 3 Puntos.");
		}
		else if (tablero.Matriz[x][y] == 'C') {
			tableroJugador.Matriz[x][y] = 'H';
			puntaje = 2;
			System.out.println("Has golpeado un Caguano! + 2 Puntos.");
		}
		else if (tablero.Matriz[x][y] == 'T') {
			tableroJugador.Matriz[x][y] = 'H';
			puntaje = 1;
			System.out.println("Has golpeado una Trupalla! + 1 Puntos.");
		}
		// crear objeto huevo y almacenar en arraylist.
	}
	
	public void CrearTablero() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				Matriz[i][j] = '-';
			}
		}
	}
	
	public void MostrarTablero() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(Matriz[j][i]);
				System.out.print("  ");
			}
			System.out.println("");
		}
		System.out.println("------------------------------------------");
	}
	
	public void CalcularPuntaje() {
	}
	

	//funcion auxiliar de verificacion de posicionamiento de carro.
	public void verificacionCarro(Carro carro) {
		int x = carro.getColumna();
		int y = carro.getFila();
		boolean check = false;
		
		if (carro instanceof Kromi) {
			while (!check) {
				if (Matriz[x][y] == '-' && Matriz[x][y + 1] == '-' && Matriz[x][y + 2] == '-') {
					Matriz[x][y] = 'K';
					Matriz[x][y + 1] = 'K';
					Matriz[x][y + 2] = 'K';
					check = true;
				}
				else {
					x = random.nextInt(15);
					y = random.nextInt(13);
				}
			}
		}
		else if (carro instanceof Caguano) {
			while (!check) {
				if (Matriz[x][y] == '-' && Matriz[x + 1][y] == '-') {
					Matriz[x][y] = 'C';
					Matriz[x + 1][y] = 'C';
					check = true;
				}
				else {
					x = random.nextInt(14);
					y = random.nextInt(15);
				}
			}
		}
		else if (carro instanceof Trupalla) {
			while (!check) {
				if (Matriz[x][y] == '-') {
					Matriz[x][y] = 'T';
					check = true;
				}
				else {
					x = random.nextInt(15);
					y = random.nextInt(15);
				}
			}
		}
	}
	
	// Constructor Vacio.
	public Tablero() {
	}
	
	// Constructor con atributos.
	public Tablero(String nombre) {
		this.Matriz = new char[15][15];
	}
	
}