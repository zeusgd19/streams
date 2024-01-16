package Comparable;

public class Ninios {
    private int prioridad;
    private int peso;

    public Ninios(int prioridad, int peso) {
        this.peso = peso;
        this.prioridad = prioridad;
    }


    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public String toString(){
        return prioridad + " " + peso;
    }
}
