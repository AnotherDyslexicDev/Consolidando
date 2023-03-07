package test;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {
	
	// Atributos de la clase Tablero.
	static char[][] Matriz = new char[15][15];
	ArrayList<Carro> listaCarros = new ArrayList<Carro>();
	ArrayList<Huevo> listaHuevos = new ArrayList<Huevo>();
	static Random random = new Random();
	

	// Metodos de la clase Tablero.
	/*
	 * public void CrearCarro() {
	 * 
	 * Kromi nombre = new Kromi(4 + random.nextInt(5), 2000 + random.nextInt(24),
	 * random.nextInt(13), random.nextInt(15), 1980 + random.nextInt(44),
	 * "AllCatsAreBeautyfull");
	 * 
	 * Kromi kromi1 = new Kromi(4 + random.nextInt(5), 2000 + random.nextInt(24),
	 * random.nextInt(13), random.nextInt(15), 1980 + random.nextInt(44),
	 * "AllCatsAreBeautyfull"); Caguano caguano1 = new Caguano(2 +
	 * random.nextInt(5), 2000 + random.nextInt(24), random.nextInt(15),
	 * random.nextInt(14), 25 + random.nextInt(26), "Pink"); Trupalla trupalla1 =
	 * new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24),
	 * random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5),
	 * "Sebastian Piranha");
	 * 
	 * //Verificacion de datos en los carros, se debe de incorporar el metodo
	 * toString de la clase Carro y hacer poliformismo a las clases hijas. (Carlos)
	 * listaCarros.forEach(name ->{ name.mostrarDatos(); }); }
	 */
	public void CrearKromi(int numero) {
		for (int i = 0; i < numero; i++) {
		listaCarros.add(new Kromi(4 + random.nextInt(5), 2000 + random.nextInt(24),
				  random.nextInt(13), random.nextInt(15), 1980 + random.nextInt(44),
				  "AllCatsAreBeautyfull"));
		verificacionKromi(listaCarros.get(listaCarros.size() - 1));
		}
	}
	public void CrearCaguano(int numero) {
		for (int i = 0; i < numero; i++) {
		listaCarros.add(new Caguano(2 +
				  random.nextInt(5), 2000 + random.nextInt(24), random.nextInt(15),
				  random.nextInt(14), 25 + random.nextInt(26), "Pink"));
		verificacionCaguano(listaCarros.get(listaCarros.size() - 1));
		}
	}
	public void CrearTrupalla(int numero) {
		for (int i = 0; i < numero; i++) {
		listaCarros.add(new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24),
				  random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5),
				  "Piranha Bot N: 0" + (i + 1)));
		verificacionTrupalla(listaCarros.get(listaCarros.size() - 1));
		}
	}
	
	public void LanzarHuevo() {
	}
	
	public void CrearTablero() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				Matriz[i][j] = '-';
			}
		}
		// Aqui va la logica de posicionamiento de carros en la matriz.
//		for (int i = 0; i < listaCarros.size(); i++) {
//			verificacionCarro(listaCarros.get(i));
//			MostrarTablero();
//			System.out.println("----------------------------------Vehiculo N: " + (i + 1));
//		}
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
	public static void verificacionKromi(Carro carro) {
		int x = carro.getColumna();
		int y = carro.getFila();
		boolean check = false;
		
			while (!check) {
				if (Matriz[x][y] == '-' && Matriz[x][y + 1] == '-' && Matriz[x][y + 2] == '-') {
					Matriz[x][y] = 'K';
					Matriz[x][y + 1] = 'K';
					Matriz[x][y + 2] = 'K';
					check = true;
				}
				else {
					carro.setFila(random.nextInt(13));
					carro.setColumna(random.nextInt(15));
				}
			}
	}
		
	public static void verificacionCaguano(Carro carro) {
		int x = carro.getColumna();
		int y = carro.getFila();
		boolean check = false;
		
			while (!check) {
				if (Matriz[x][y] == '-' && Matriz[x + 1][y] == '-') {
					Matriz[x][y] = 'C';
					Matriz[x + 1][y] = 'C';
					check = true;
				}
				else {
					carro.setColumna(random.nextInt(15));
					carro.setFila(random.nextInt(14));
				}
			}
	}
	
	public static void verificacionTrupalla(Carro carro) {
		int x = carro.getColumna();
		int y = carro.getFila();
		boolean check = false;
		
			while (!check) {
				if (Matriz[x][y] == '-') {
					Matriz[x][y] = 'T';
					check = true;
				}
				else {
					carro.setColumna(random.nextInt(15));
					carro.setFila(random.nextInt(15));
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