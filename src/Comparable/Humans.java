package Comparable;

public class Humans implements Comparable<Humans>{

    private String nombre;
    private int salario;
    public Humans(String nombre,int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre(){
        return nombre;
    }

    public int getSalario(){
        return salario;
    }

    public String toString(){
        return nombre + " - " + salario;
    }
    @Override
    public int compareTo(Humans other) {
        return other.getSalario() - this.salario;
    }
}
