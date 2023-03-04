package test;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {
	
	// Atributos de la clase Tablero.
	char[][] Matriz = new char[15][15];
	Carro[] listaCarros = new Carro[18];
	ArrayList<Huevo> listaHuevos = new ArrayList<Huevo>();

	// Metodos de la clase Tablero.
	public void CrearCarro() {
//		Kromi kromi1 = new Kromi();
//		Kromi kromi2 = new Kromi();
//		Kromi kromi3 = new Kromi();
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
	}
	
	public void MostrarTablero() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(Matriz[i][j]);
				System.out.print("  ");
			}
			System.out.println("");
		}
	}
	
	public void CalcularPuntaje() {
	}
	
	// Constructor Vacio.
	public Tablero() {
	}
	
	// Constructor con atributos.
	public Tablero(String nombre) {
		this.Matriz = new char[15][15];
	}
	
}