package test;

/**
 * @author Mauricio Gutierrez, David Morales, Carlos Carrasco
 * @version 03.2023 Esta clase representa un huevo que se lanzará en el tablero
 */

public class Huevo {
	private int fila;
	private int columna;
	private int puntaje;

	/**
	 * Crea un objeto Huevo con los valores de fila, columna y puntaje dados.
	 * 
	 * @param fila    La fila en la que se lanza el huevo.
	 * @param columna La columna en la que se lanza el huevo.
	 * @param puntaje El puntaje asociado a este huevo.
	 */
	public Huevo(int fila, int columna, int puntaje) {
		this.fila = fila;
		this.columna = columna;
		this.puntaje = puntaje;
	}

	/**
	 * Devuelve la fila del huevo.
	 * 
	 * @return La fila del huevo.
	 */
	public int getFila() {
		return fila;
	}

	/**
	 * Establece la fila del huevo.
	 * 
	 * @param fila La nueva fila del huevo.
	 */
	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	/**
	 * Establece la columna del huevo.
	 * 
	 * @param columna La nueva columna del huevo.
	 */
	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int getPuntaje() {
		return puntaje;
	}

	/**
	 * Establece el puntaje del huevo lanzado
	 * 
	 * @param puntaje, nuevo puntaje del huevo.
	 */
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	/*
	 * public void calcularPuntaje(Tablero tablero) { int contadorK =0; int
	 * contadorC =0; int contadorT =0; String letra = Tablero.getPosicion(fila,
	 * columna); if (letra.equals("K")) { contadorK++; Tablero.LanzarHuevo(fila,
	 * columna); if (contadorK==3) { puntaje += 10; } else { puntaje += 3; } } else
	 * if (letra.equals("C")) { contadorC++; Tablero.LanzarHuevo(fila, columna); if
	 * (contadorC==2) { puntaje += 7; } else { puntaje += 2; } } else if
	 * (letra.equals("T")) { contadorT++; Tablero.LanzarHuevo(fila, columna); if
	 * (contadorT==3) { puntaje += 0; } else { puntaje += 1; } } else {
	 * Tablero.LanzarHuevo(fila, columna); puntaje+=0; } }
	 */
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Huevo: \nfila=" + fila + ", \ncolumna=" + columna + ", \npuntaje=" + puntaje + "git\n";
	}
}
