package test;
/* @author Mauricio Gutierrez, David Morales, Carlos Carrasco, John Banner 
 * Version 03.2023
 * */

public class Trupallas extends Carro {

	private int nivelArmadura;
	private String nombreConductor;
	
	public Trupallas () {}
	
	public Trupallas ( int cantidadOcupantes, int fechaIngreso, int fila, int columna, int nivelArmadura, String nombreConductor) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.nivelArmadura = nivelArmadura;
		this.nombreConductor = nombreConductor;
	}

	//accesadores
	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}
	
	

}
