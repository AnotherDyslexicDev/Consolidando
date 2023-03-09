package test;

/* @author Mauricio Gutierrez, David Morales, Carlos Carrasco, John Banner 
 * Version 03.2023
 * */
/**
 * La clase Caguano extiende de la clase Carro e incluye atributos adicionales.
 */
public class Caguano extends Carro {

	private int alcanceTiro;
	private String colorConfeti;

	// Constructor sin parametros
	public Caguano() {
	}

	/**
	 * Constructor parametrado de la clase Caguano que recibe todos los atributos
	 * necesarios para crear un objeto Caguano.
	 * 
	 * @param cantidadOcupantes, Cantidad de ocupantes del Caguano.
	 * @param fechaIngreso,      Fecha de ingreso del Caguano a la institución.
	 * @param fila,              Fila en la que se encuentra el Caguano en el
	 *                           tablero.
	 * @param columna,           Columna en la que se encuentra el Caguano en el
	 *                           tablero.
	 * @param alcanceTiro,       Alcance de tiro del Caguano.
	 * @param colorConfeti,      Color de confeti del Caguano.
	 */
	public Caguano(int cantidadOcupantes, int fechaIngreso, int fila, int columna, int alcanceTiro,
			String colorConfeti) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}

	/* Accesadores y mutadores */
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

	/*
	 * public int getFila() { return super.getFila(); } public int getColumna() {
	 * return super.getColumna(); }
	 */
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "*Caguano* \nAlcance de tiro: " + this.alcanceTiro + "\nColor de confeti: " + this.colorConfeti;
	}

}
