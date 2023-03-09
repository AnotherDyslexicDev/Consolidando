package test;

public class Huevo {
    private int fila;
    private int columna;
    private int puntaje;
    private String mensaje ="";

   
	public Huevo(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        //this.puntaje =obtenerPuntaje(fila,columna) ;
    }
    public Huevo() {}

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

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

    public void poblarJugador(int x, int y, Tablero tablero,Tablero tableroJugador) {
    	
        
    	if (tableroJugador.Matriz[x][y] == 'H') {
			puntaje = 0;			
			setMensaje("Se ha desperdiciado un huevo");    	
		}
		else if (tablero.Matriz[x][y] == 'K') {
			puntaje = 3;
			tableroJugador.Matriz[x][y]='H';
			setMensaje("Has obtenido! "+puntaje + " Puntos."); 
		}
		else if (tablero.Matriz[x][y] == 'C') {
			puntaje = 2;
			tableroJugador.Matriz[x][y]='H';
			setMensaje("Has obtenido! "+puntaje + " Puntos.");
		}
		else if (tablero.Matriz[x][y] == 'T') {
			puntaje = 1;
			tableroJugador.Matriz[x][y]='H';
			setMensaje("Has obtenido! "+puntaje + " Puntos.");
		}
		else if (tablero.Matriz[x][y] == '-') {
			tableroJugador.Matriz[x][y]='H';
			setMensaje("Has obtenido! "+puntaje + " Puntos.");
		}
    }
    @Override
    public String toString() {
        return "Huevo: \nfila=" + fila + ", \ncolumna=" + columna + ", \npuntaje=" + puntaje + "git\n";
    }
}
