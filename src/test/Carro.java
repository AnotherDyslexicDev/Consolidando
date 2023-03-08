package test;
/*	 
 *  @author Mauricio Gutierrez, David Morales, Carlos Carrasco 
 * 	@version 03.2023
 * */


public class Carro {

	private int cantidadOcupantes;
	private int fechaIngreso;
	private int fila;
	private int columna;
	
	//constructor sin parametros
	public Carro() {}
	
	/* Constructor clase carro con sus parametros
	 * @param cantidadOcupantes define numero de ocupantes del carro, fechaIngreso define fecha de ingreso a institucion
	 */
	public Carro(int cantidadOcupantes, int fechaIngreso, int fila, int columna) {
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.fila = fila;
		this.columna = columna;
		
	}

	/*accesadores y modificadores. */
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
		System.out.println("*Coordenadas*" + "\nFila: " + fila + "\nColumna: " + columna);
	}

	@Override
	public String toString() {
	    return "*Carro* \nCantidad de ocupantes: " + this.cantidadOcupantes + "\nFecha de ingreso: " 
	    		+ this.fechaIngreso + "\nUbicación: (" + this.fila + ", " + this.columna + ")";
		}

}

