package Comparable.AceptaElReto;

public class Felipe{
    private short prioridad;
    private short duracion;

    public Felipe(short prioridad, short duracion) {
        this.duracion = duracion;
        this.prioridad = prioridad;
    }


    public short getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(short prioridad) {
        this.prioridad = prioridad;
    }

    public short getDuracion() {
        return duracion;
    }

    public void setDuracion(short duracion) {
        this.duracion = duracion;
    }
    @Override
    public String toString(){
        return prioridad + " " + duracion;
    }
}
