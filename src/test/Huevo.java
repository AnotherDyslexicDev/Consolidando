package test;

/**
 * @author Mauricio Gutierrez, David Morales, Carlos Carrasco
 * @version 03.2023 Esta clase representa un huevo que se lanzará en el tablero
 */
public class Huevo {
	private int fila;
	private int columna;
	private int puntaje;
	private String mensaje = "";

	/**
	 * Crea un objeto Huevo con los valores de fila, columna y puntaje dados.
	 * 
	 * @param fila    La fila en la que se lanza el huevo.
	 * @param columna La columna en la que se lanza el huevo.
	 * @param puntaje El puntaje asociado a este huevo.
	 */
	public Huevo(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
		// this.puntaje =obtenerPuntaje(fila,columna) ;
	}

	public Huevo() {
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

	/**
	 * devuelve la columna del huevo.
	 * 
	 * @return columna del huevo
	 */
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

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public void poblarJugador(int x, int y, Tablero tablero, Tablero tableroJugador) {

		if (tableroJugador.Matriz[x][y] == 'H') {
			puntaje = 0;
			setMensaje("Se ha desperdiciado un huevo");
		} else if (tablero.Matriz[x][y] == 'K') {
			puntaje = 3;
			tableroJugador.Matriz[x][y] = 'H';
			setMensaje("Has obtenido! " + puntaje + " Puntos.");
		} else if (tablero.Matriz[x][y] == 'C') {
			puntaje = 2;
			tableroJugador.Matriz[x][y] = 'H';
			setMensaje("Has obtenido! " + puntaje + " Puntos.");
		} else if (tablero.Matriz[x][y] == 'T') {
			puntaje = 1;
			tableroJugador.Matriz[x][y] = 'H';
			setMensaje("Has obtenido! " + puntaje + " Puntos.");
		} else if (tablero.Matriz[x][y] == '-') {
			tableroJugador.Matriz[x][y] = 'H';
			setMensaje("Has obtenido! " + puntaje + " Puntos.");
		}
	}

	@Override
	public String toString() {
		return "Huevo: \nfila=" + fila + ", \ncolumna=" + columna + ", \npuntaje=" + puntaje + "git\n";
	}
}
