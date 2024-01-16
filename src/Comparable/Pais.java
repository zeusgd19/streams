package Comparable;

public class Pais implements Comparable<Pais>{

    private String country;
    private int value;

    public Pais(String country,int value){
        this.country = country;
        this.value = value;
    }

    public String getCountry(){
        return country;
    }

    public int getValue(){
        return value;
    }

    public String toString(){
        return country + " - " + value;
    }
    @Override
    public int compareTo(Pais other) {
        return this.value - other.getValue();
    }
}
