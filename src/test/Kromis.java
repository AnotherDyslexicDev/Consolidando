package test;
/* @author Mauricio Gutierrez, David Morales, Carlos Carrasco, John Banner 
 * Version 03.2023
 * */

public class Kromis extends Carro{

	private int periodoFabricacion;
	private String marca;
	
	public Kromis (int cantidadOcupantes, int fechaIngreso, int fila, int columna, int periodoFabricacion, String marca) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.periodoFabricacion = periodoFabricacion;
		this.marca = marca;
	}
 
	//accesadores
	public int getPeriodoFabricacion() {
		return periodoFabricacion;
	}

	public String getMarca() {
		return marca;
	}
	
	//sobreescribimos metodo getFila para obtener las filas ocupadas por cada kromi
	@Override
	public int getFila() {
		return super.getFila();
	}
	public int getFila2() {
		return super.getFila() + 1;
	}
	public int getFila3() {
		return super.getFila() + 2;
	}
	
	
	
	
}
