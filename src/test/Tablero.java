package test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tablero {
	
	// Atributos de la clase Tablero.
	char[][] Matriz = new char[15][15];
	ArrayList<Carro> listaCarros = new ArrayList<Carro>();
	ArrayList<Huevo> listaHuevos = new ArrayList<Huevo>();
	ArrayList<ArrayList<Posicion>> posiciones = new ArrayList<ArrayList<Posicion>>();
	static Random random = new Random();
	int puntaje = 0;
	
	// Metodos para crear vehiculos y posicionarlos en el Tablero.
	public void CrearKromi(int numero) {
		for (int i = 0; i < numero; i++) {
		listaCarros.add(new Kromi(4 + genRandom(0, 5), 2000 + genRandom(0, 24),
				  genRandom(0, 13), genRandom(0, 15), 1980 + genRandom(0, 44),
				  "AllCatsAreBeautyfull"));
		verificacionCarro(listaCarros.get(listaCarros.size() - 1));
		almacenarVehiculo(listaCarros.get(listaCarros.size() - 1));
		}
	}
	public void CrearCaguano(int numero) {
		for (int i = 0; i < numero; i++) {
		listaCarros.add(new Caguano(2 +
				  random.nextInt(5), 2000 + random.nextInt(24), random.nextInt(15),
				  random.nextInt(14), 25 + random.nextInt(26), "Pink"));
		verificacionCarro(listaCarros.get(listaCarros.size() - 1));
		almacenarVehiculo(listaCarros.get(listaCarros.size() - 1));
		}
	}
	public void CrearTrupalla(int numero) {
		for (int i = 0; i < numero; i++) {
		listaCarros.add(new Trupalla(1 + genRandom(0, 4), 2000 + genRandom(0, 24),
				genRandom(0, 15), genRandom(0, 15), 1 + genRandom(0, 5),
				  "Piranha Bot N: 0" + (i + 1)));
		verificacionCarro(listaCarros.get(listaCarros.size() - 1));
		almacenarVehiculo(listaCarros.get(listaCarros.size() - 1));
		}
	}
	
	public void LanzarHuevo(Tablero tablero, Tablero tableroJugador) {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		
		System.out.println("	INGRESE NUMERO DE COLUMNA: (VALOR ENTERO ENTRE 1 y 15 INCLUSIVES)");
		x = scan.nextInt() - 1;
		scan.nextLine();
		System.out.println("	INGRESE NUMERO DE FILA: (VALOR ENTERO ENTRE 1 y 15 INCLUSIVES)");
		y = scan.nextInt() - 1;
		scan.nextLine();
		System.out.println("----------------------------------");
	//	Huevo huveo = new Huevo(x,y);
		listaHuevos.add(new Huevo(x,y));
		listaHuevos.get(listaHuevos.size() - 1).poblarJugador(x, y, tablero, tableroJugador);
		verificarPosicionVehiculo(listaHuevos.get(listaHuevos.size() - 1));
		System.out.println(listaHuevos.get(listaHuevos.size() - 1).getMensaje());
		System.out.println("Tu puntaje actual es: " + CalcularPuntaje() + " Puntos.");
		/*
		 * puntaje += huveo.obtenerPuntaje(x, y, tablero,tableroJugador); String mensaje
		 * = huveo.getMensaje(); System.out.println(mensaje
		 * +"\nEl puntaje acumulado es : "+puntaje);
		 */

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
	
	public int CalcularPuntaje() {
		int puntaje = 0;
		
		for (int i = 0; i < listaHuevos.size(); i++) {
			puntaje = puntaje + listaHuevos.get(i).getPuntaje();
		}
		
	  	for (int i = 0; i < posiciones.size(); i++) { 
	  		for (int j = 0; j < posiciones.get(i).size(); j++) {
	  			if (posiciones.get(i).size() == 3 && posiciones.get(i).get(j).getY() == 99 && posiciones.get(i).get(j).getX() == 99) {
	  				puntaje = puntaje + 10;
	  			}
	  		}
	  	}
	  	
	  	for (int i = 0; i < posiciones.size(); i++) { 
	  		for (int j = 0; j < posiciones.get(i).size(); j++) {
	  			if (posiciones.get(i).size() == 2 && posiciones.get(i).get(j).getY() == 99 && posiciones.get(i).get(j).getX() == 99) {
	  				puntaje = puntaje + 7;
	  			}
	  		}
	  	}
		
		return puntaje;
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
	
	public static int genRandom(int bajo, int alto) {
		Random ran = new Random();
		return bajo + ran.nextInt(alto);
	}
	
	public void almacenarVehiculo(Carro carro) {
		if (carro instanceof Kromi ) {
			int x = listaCarros.get(listaCarros.size() - 1).getColumna();
			int y = listaCarros.get(listaCarros.size() - 1).getFila();
			ArrayList<Posicion> posicion = new ArrayList<Posicion>();
			posicion.add(new Posicion(x, y));
			posicion.add(new Posicion(x, y + 1));
			posicion.add(new Posicion(x, y + 2));
			posiciones.add(posicion);
		}
		if (carro instanceof Caguano ) {
			int x = listaCarros.get(listaCarros.size() - 1).getColumna();
			int y = listaCarros.get(listaCarros.size() - 1).getFila();
			ArrayList<Posicion> posicion = new ArrayList<Posicion>();
			posicion.add(new Posicion(x, y));
			posicion.add(new Posicion(x + 1, y));
			posiciones.add(posicion);
		}
		if (carro instanceof Trupalla ) {
			int x = listaCarros.get(listaCarros.size() - 1).getColumna();
			int y = listaCarros.get(listaCarros.size() - 1).getFila();
			ArrayList<Posicion> posicion = new ArrayList<Posicion>();
			posicion.add(new Posicion(x, y));
			posiciones.add(posicion);
		}
	}
	
	public void	verificarPosicionVehiculo(Huevo huevo) {
		  int x = huevo.getColumna(); 
		  int y = huevo.getFila(); 
		  	for (int i = 0; i < posiciones.size(); i++) { 
		  		for (int j = 0; j < posiciones.get(i).size(); j++) {
		  			if (posiciones.get(i).get(j).getX() == x && posiciones.get(i).get(j).getY() == y) {
		  				posiciones.get(i).get(j).setX(99);
		  				posiciones.get(i).get(j).setY(99);
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