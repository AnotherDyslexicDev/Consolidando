package test;

/**
 * @author Mauricio Gutierrez, David Morales, Carlos Carrasco 
 * @version 03.2023
 * 
 * */
/**
 * Representa una posición en matriz con coordenadas X e Y.
 */
public class Posicion {
	private int x;
	private int y;

	Posicion() {
	}

	/**
	 * Crea una nueva instancia de posicion con las coordenadas x, y
	 *
	 * @param x la coordenada X de la posicion
	 * @param y la coordenada Y de la posicion
	 */
	Posicion(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * deuvelve la coordenada X de la posicion
	 *
	 * @return la coordenada X
	 */
	public int getX() {
		return x;
	}

	/**
	 * Establece coordenada de la posicion donde se encuentra x
	 *
	 * @param x, la nueva coordenada X.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * deuvelve la coordenada Y de la posicion
	 *
	 * @return la coordenada Y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Establece la coordenada de la posicion donde se encuentra y
	 *
	 * @param y, la nueva coordenada Y.
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Retorna una representación en cadena de texto de la posición en el formato
	 * "Posicion [x=X, y=Y]".
	 *
	 * @return una cadena que representa la posición, sirvio para entender mejor la
	 *         matriz y trabajar con ella
	 */
	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}

}
