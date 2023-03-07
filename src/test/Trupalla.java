package test;
/* @author Mauricio Gutierrez, David Morales, Carlos Carrasco, John Banner 
 * Version 03.2023
 * */

public class Trupalla extends Carro {

	private int nivelArmadura;
	private String nombreConductor;
	
	public Trupalla() {}
	
	public Trupalla( int cantidadOcupantes, int fechaIngreso, int fila, int columna, int nivelArmadura, String nombreConductor) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.nivelArmadura = nivelArmadura;
		this.nombreConductor = nombreConductor;
	}

	//accesadores
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
	public int getFila() {
		return super.getFila();
	}
	public int getColumna() {
		return super.getColumna();
	}
	*/
	

}
