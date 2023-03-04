package test;
/* @author Mauricio Gutierrez, David Morales, Carlos Carrasco */

import java.util.*;

public class Tablero {

	private char[][] matriz;
	
	public Tablero() {
		super();
		this.matriz =  new char[15][15];
	}

	ArrayList<Huevo>listaHuevos = new ArrayList<Huevo>();
	
	public void lanzarHuevo() {
		Random random = new Random();   
		// Generates random integers 0 to 14  
		int x = random.nextInt(15);   
		// Generates random integers 0 to 14
		int y = random.nextInt(15);
		
		Huevo h = new Huevo(x,y);
		listaHuevos.add(h);
		matriz[x][y] = 'h';
	}
	
	//imprime linea matriz
	public void mostrarMatriz() {
		for (int i= 0; i < matriz.length; i++) {
			for (int j= 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tablero tablero = new Tablero();
		
		char m = '-';
		
		for (char[] row : tablero.matriz) {
			Arrays.fill(row, m);  
		}
		
		tablero.lanzarHuevo();
		
		
	
		tablero.mostrarMatriz();
	}
	
	
}

