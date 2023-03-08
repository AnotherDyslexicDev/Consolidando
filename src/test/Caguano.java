package test;
/*	 
 *  @author Mauricio Gutierrez, David Morales, Carlos Carrasco 
 * 	@version 03.2023
 * */


public class Caguano extends Carro {

	private int alcanceTiro;
	private String colorConfeti;
	
	//Constructor sin parametros
	public Caguano () {}
	
	



	//Constructor parametrado
	public Caguano ( int cantidadOcupantes, int fechaIngreso, int fila, int columna, int alcanceTiro, String colorConfeti) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}

	/*Accesadores y mutadores */
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
	public int getFila() {
		return super.getFila();
	}
	public int getColumna() {
		return super.getColumna();
	}
	*/
	/**
	  * {@inheritDoc}
	  */
	@Override
	public String toString() {
	    return "*Caguano* \nAlcance de tiro: " + this.alcanceTiro + "\nColor de confeti: " + this.colorConfeti;
	}

}
