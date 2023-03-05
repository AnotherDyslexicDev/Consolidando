package test;
/* @author Mauricio Gutierrez, David Morales, Carlos Carrasco, John Banner 
 * Version 03.2023
 * */

public class Caguanos extends Carro {

	private int alcanceTiro;
	private String colorConfeti;
	
	//Constructor sin parametros
	public Caguanos () {}
	
	//Constructor parametrado
	public Caguanos ( int cantidadOcupantes, int fechaIngreso, int fila, int columna, int alcanceTiro, String colorConfeti) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}

	//accesadores
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}
	
	//sobreescribimos metodo getColumna para obtener las Columnas ocupadas por cada caguano
		@Override
		public int getColumna() {
			return super.getColumna();
		}
		public int getColumna2() {
			return super.getColumna() + 1;
		}
}
