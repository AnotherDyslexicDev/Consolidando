package test;
/**
 * @author Mauricio Gutierrez, David Morales, Carlos Carrasco 
 * @version 03.2023
 * */

/**
 * La clase Trupalla extiende de la clase Carro e incluye atributos adicionales.
 */
public class Trupalla extends Carro {

	private int nivelArmadura;
	private String nombreConductor;

	public Trupalla() {
	}

	/**
	 * Constructor de la clase Trupalla que recibe todos los atributos necesarios
	 * para crear una Trupalla.
	 * 
	 * @param cantidadOcupantes, Cantidad de ocupantes de la Trupalla.
	 * @param fechaIngreso,      Fecha de ingreso de la Trupalla a la institución.
	 * @param fila,              Fila en la que se encuentra la Trupalla en el
	 *                           tablero.
	 * @param columna,           Columna en la que se encuentra la Trupalla en el
	 *                           tablero.
	 * @param nivelArmadura,     Nivel de armadura de la Trupalla.
	 * @param nombreConductor,   Nombre del conductor de la Trupalla.
	 */
	public Trupalla(int cantidadOcupantes, int fechaIngreso, int fila, int columna, int nivelArmadura,
			String nombreConductor) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.nivelArmadura = nivelArmadura;
		this.nombreConductor = nombreConductor;
	}

	/* Accesadores y mutadores */
	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	/*
	 * public int getFila() { return super.getFila(); } public int getColumna() {
	 * return super.getColumna(); }
	 */

	@Override
	public String toString() {
		return "*Trupalla* \nNivel de armadura: " + this.nivelArmadura + "\nPersona que lo manipula: "
				+ this.nombreConductor;
	}

}
