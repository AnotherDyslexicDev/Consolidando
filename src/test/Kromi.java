package test;
/* @author Mauricio Gutierrez, David Morales, Carlos Carrasco, John Banner 
 * Version 03.2023
 * */

public class Kromi extends Carro{

	private int periodoFabricacion;
	private String marca;
	
	public Kromi(int cantidadOcupantes, int fechaIngreso, int fila, int columna, int periodoFabricacion, String marca) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.periodoFabricacion = periodoFabricacion;
		this.marca = marca;
	}
 
	//accesadores
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
	
	public int getFila() {
		return super.getFila();
	}
	public int getColumna() {
		return super.getColumna();
	}
	
	@Override
	public String toString() {
	    return "*Kromi* \nMarca: " + this.marca + "\nAño de fabricación: " + this.periodoFabricacion;
	}

	
}
