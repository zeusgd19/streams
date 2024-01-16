package Comparable;

public class Felipe{
    private int prioridad;
    private int duracion;

    public Felipe(int prioridad, int duracion) {
        this.duracion = duracion;
        this.prioridad = prioridad;
    }


    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    @Override
    public String toString(){
        return prioridad + " " + duracion;
    }
}
