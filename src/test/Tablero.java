package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tablero {
	
	// Atributos de la clase Tablero.
	static char[][] Matriz = new char[15][15];
	ArrayList<Carro> listaCarros = new ArrayList<Carro>();
	ArrayList<Huevo> listaHuevos = new ArrayList<Huevo>();
	static Random random = new Random();

	// Metodos de la clase Tablero.
	public void CrearCarro() {
		Kromi kromi1 = new Kromi(4 + random.nextInt(5), 2000 + random.nextInt(24), random.nextInt(13), random.nextInt(15), 1980 + random.nextInt(44), "AllCatsAreBeautyfull");
		Kromi kromi2 = new Kromi(4 + random.nextInt(5), 2000 + random.nextInt(24), random.nextInt(13), random.nextInt(15), 1980 + random.nextInt(44), "AllCatsAreBeautyfull");
		Kromi kromi3 = new Kromi(4 + random.nextInt(5), 2000 + random.nextInt(24), random.nextInt(13), random.nextInt(15), 1980 + random.nextInt(44), "AllCatsAreBeautyfull");
		Caguano caguano1 = new Caguano(2 + random.nextInt(5), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(14), 25 + random.nextInt(26), "Pink");
		Caguano caguano2 = new Caguano(2 + random.nextInt(5), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(14), 25 + random.nextInt(26), "Pink");
		Caguano caguano3 = new Caguano(2 + random.nextInt(5), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(14), 25 + random.nextInt(26), "Pink");
		Caguano caguano4 = new Caguano(2 + random.nextInt(5), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(14), 25 + random.nextInt(26), "Pink");
		Caguano caguano5 = new Caguano(2 + random.nextInt(5), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(14), 25 + random.nextInt(26), "Pink");
		Trupalla trupalla1 = new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5), "Sebastian Piranha");
		Trupalla trupalla2 = new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5), "Mario Rozas");
		Trupalla trupalla3 = new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5), "Eduardo Gordon");
		Trupalla trupalla4 = new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5), "Sergio Jadue");
		Trupalla trupalla5 = new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5), "Augusto Pinochet");
		Trupalla trupalla6 = new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5), "Sebastian Davalos");
		Trupalla trupalla7 = new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5), "Jose Antonio Kast");
		Trupalla trupalla8 = new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5), "Gabriel Boric");
		Trupalla trupalla9 = new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5), "La Tia Pikachu");
		Trupalla trupalla10 = new Trupalla(1 + random.nextInt(4), 2000 + random.nextInt(24), random.nextInt(15), random.nextInt(15), 1 + random.nextInt(5), "Sensual Spiderman");
		Collections.addAll(listaCarros, kromi1, kromi2, kromi3, caguano1, caguano2, caguano3, caguano4, caguano5, 
				trupalla1, trupalla2, trupalla3, trupalla4, trupalla5, trupalla6, trupalla7, trupalla8, trupalla9, trupalla10);
		
//Verificacion de datos en los carros, se debe de incorporar el metodo toString de la clase Carro y hacer poliformismo a las clases hijas. (Carlos)
		listaCarros.forEach(name ->{
            name.mostrarDatos();
        });
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
		for (int i = 0; i < listaCarros.size(); i++) {
			verificacionCarro(listaCarros.get(i));
			MostrarTablero();
			System.out.println("----------------------------------Vehiculo N: " + (i + 1));
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
	}
	
	public void CalcularPuntaje() {
	}
	
	//funcion auxiliar de verificacion de posicionamiento de carro.
	public static void verificacionCarro(Carro carro) {
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
					carro.setFila(random.nextInt(13));
					carro.setColumna(random.nextInt(15));
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
					carro.setColumna(random.nextInt(15));
					carro.setFila(random.nextInt(14));
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
					carro.setColumna(random.nextInt(15));
					carro.setFila(random.nextInt(15));
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