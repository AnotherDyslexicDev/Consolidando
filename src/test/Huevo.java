package test;

public class Huevo {
    private int fila;
    private int columna;
    private int puntaje;

    public Huevo(int fila, int columna, int puntaje) {
        this.fila = fila;
        this.columna = columna;
        this.puntaje = puntaje;
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

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

   /* public void calcularPuntaje(Tablero tablero) {
    	int contadorK =0;
    	int contadorC =0;
    	int contadorT =0;
        String letra = Tablero.getPosicion(fila, columna);
        if (letra.equals("K")) {
        	contadorK++;
            Tablero.LanzarHuevo(fila, columna);
            if (contadorK==3) {
                puntaje += 10;
            } else {
                puntaje += 3;
            }
        } else if (letra.equals("C")) {
        	contadorC++;
            Tablero.LanzarHuevo(fila, columna);
            if (contadorC==2) {
                puntaje += 7;
            } else {
                puntaje += 2;
            }
        } else if (letra.equals("T")) {
        	contadorT++;
            Tablero.LanzarHuevo(fila, columna);
            if (contadorT==3) {
                puntaje += 0;
            } else {
                puntaje += 1;
            }
        } else {
            Tablero.LanzarHuevo(fila, columna);
            puntaje+=0;
        }
    }*/
    @Override
    public String toString() {
        return "Huevo: \nfila=" + fila + ", \ncolumna=" + columna + ", \npuntaje=" + puntaje + "git\n";
    }
}
