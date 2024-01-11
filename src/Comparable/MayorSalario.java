package Comparable;

import java.util.ArrayList;

public class MayorSalario {
    public static void main(String[] args) {
        ArrayList<Humans> lista = new ArrayList<>();

        Humans humano = new Humans("Pau",2000);
        lista.add(humano);

        humano = new Humans("Antonio",2500);
        lista.add(humano);

        lista.add(new Humans("Darius",3200));


        lista.stream().sorted().forEach(System.out::println);
    }
}
