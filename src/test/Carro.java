package test;
/* @author Mauricio Gutierrez, David Morales, Carlos Carrasco, John Banner 
 * Version 03.2023
 * */


public class Carro {

	private int cantidadOcupantes;
	private int fechaIngreso;
	private int fila;
	private int columna;
	
	//constructor sin parametros
	public Carro() {}
	
	//constructor parametrado
	public Carro(int cantidadOcupantes, int fechaIngreso, int fila, int columna) {
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.fila = fila;
		this.columna = columna;
		
	}

	//accesadores
	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}


	public int getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(int fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	
	//metodo para desplegar datos y coordenadas en tablero
	public void mostrarDatos() {
		System.out.println("Cantidad de ocupantes: " + cantidadOcupantes);
		System.out.println("Fecha de ingreso :" + fechaIngreso);
		System.out.println("*Coordenadas*" + "\nFila:" + fila + "\nColumna: " + columna);
	}

}

