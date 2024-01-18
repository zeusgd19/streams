package Comparable.AceptaElReto;

public class Ninios {
    private byte prioridad;
    private short peso;

    public Ninios(byte prioridad, short peso) {
        this.peso = peso;
        this.prioridad = prioridad;
    }


    public byte getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(byte prioridad) {
        this.prioridad = prioridad;
    }

    public short getPeso() {
        return peso;
    }

    public void setPeso(short peso) {
        this.peso = peso;
    }
    @Override
    public String toString(){
        return prioridad + " " + peso;
    }
}
