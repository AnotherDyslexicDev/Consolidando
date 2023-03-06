package test;
/* @author Mauricio Gutierrez, David Morales, Carlos Carrasco, John Banner 
 * Version 03.2023
 * */
import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;


public class Tablero {

	private char[][] matriz;
	
	public Tablero() {
		super();
		this.matriz =  new char[15][15];
	}
	ArrayList<Kromis>listaKromis = new ArrayList<Kromis>();
	public void generarKromis() {
	    Random random = new Random();   
	 // Generar filas y columnas aleatorias para las Kromis
	    int fila1 = random.nextInt(12);
	    int columna1 = random.nextInt(15);   
	   
	    int fila2 = random.nextInt(12);
	    int columna2 = random.nextInt(15);
	    	
	    	while (columna2 == columna1 && Math.abs(fila2 - fila1) < 3) {
	    		  fila2 = random.nextInt(12);
	    		  columna2 = random.nextInt(15);
	    		  System.out.println("reintentando");
	    	}
	    	
	    int fila3 = random.nextInt(12);
	    int columna3 = random.nextInt(15);

		    while ((columna3 == columna1 && Math.abs(fila3 - fila1) < 3) || (columna3 == columna2 && Math.abs(fila3 - fila2) < 3))  {
	            // posiciones chocan, reintentar
	         fila3 = random.nextInt(12);
	        columna3 = random.nextInt(15);
	        System.out.println("Reintentando");
	    	}

		   
		    System.out.println("f1:" + fila1);
		    System.out.println("c1:" + columna1);
		    System.out.println("f2:" + fila2);
		    System.out.println("c2:" +columna2);
		    System.out.println("f3:" + fila3);
		    
		   
		    System.out.println("c3:" + columna3);
  
	    // Crear las tres Kromis 
	    Kromis k1 = new Kromis(50, 1990, fila1, columna1, 2023, "Kromi");
	    listaKromis.add(k1);
	    matriz[fila1][columna1] = 'K';
	    matriz[fila1+1][columna1] = 'K';
	    matriz[fila1+2][columna1] = 'K';
	    
	    
	    Kromis k2 = new Kromis(10, 1995, fila2, columna2, 2023, "Kromi");
	    listaKromis.add(k2);
	    matriz[fila2][columna2] = 'K';
	    matriz[fila2+1][columna2] = 'K';
	    matriz[fila2+2][columna2] = 'K';
	    
	    
	    Kromis k3 = new Kromis(7, 1992, fila3, columna3, 2023, "Kromi");
	    listaKromis.add(k3);
	    matriz[fila3][columna3] = 'K';
	    matriz[fila3+1][columna3] = 'K';
	    matriz[fila3+2][columna3] = 'K';

	    
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
		System.out.println("huevo:" + x);
		System.out.println("huevo:" + y);
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
		
		
		tablero.generarKromis();
		tablero.mostrarMatriz();
	}
	
	
}

