package test;
/**
 * @author Mauricio Gutierrez, David Morales, Carlos Carrasco 
 * @version 03.2023
 * */

/**
 * La clase Kromi extiende de la clase Carro e incluye atributos adicionales.
 */
public class Kromi extends Carro {

	private int periodoFabricacion;
	private String marca;

	/**
	 * Constructor de la clase Kromi que recibe todos los atributos necesarios para
	 * crear una Kromi.
	 * 
	 * @param cantidadOcupantes,  Cantidad de ocupantes de la Kromi.
	 * @param fechaIngreso,       Fecha de ingreso de la Kromi a la institución.
	 * @param fila                Fila en la que se encuentra la Kromi en el
	 *                            tablero.
	 * @param columna,            Columna en la que se encuentra la Kromi en el
	 *                            tablero.
	 * @param periodoFabricacion, Año de fabricación de la Kromi.
	 * @param marca,              Marca de la Kromi.
	 */
	public Kromi(int cantidadOcupantes, int fechaIngreso, int fila, int columna, int periodoFabricacion, String marca) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.periodoFabricacion = periodoFabricacion;
		this.marca = marca;
	}

	/* Accesadores y mutadores */
	public int getPeriodoFabricacion() {
		return periodoFabricacion;
	}

	public void setPeriodoFabricacion(int periodoFabricacion) {
		this.periodoFabricacion = periodoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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
		return "*Kromi* \nMarca: " + this.marca + "\nAño de fabricación: " + this.periodoFabricacion;
	}

}
