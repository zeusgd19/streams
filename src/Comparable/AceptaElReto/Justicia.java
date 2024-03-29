package Comparable.AceptaElReto;

public class Justicia implements Comparable<Justicia>{
    private int dinero;
    private int premio;

    public Justicia(int prioridad, int duracion) {
        this.premio = duracion;
        this.dinero = prioridad;
    }


    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }
    @Override
    public String toString(){
        return dinero + " " + premio;
    }

    @Override
    public int compareTo(Justicia otro) {
        if(otro.getDinero() == this.dinero) {
            return otro.getPremio() - this.premio;
        }
        return otro.getDinero() - this.dinero;
    }
}
