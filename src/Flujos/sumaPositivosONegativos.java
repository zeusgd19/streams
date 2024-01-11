package Flujos;

import java.util.ArrayList;
import java.util.List;

public class sumaPositivosONegativos {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(7);
        numeros.add(3);
        numeros.add(-1);
        numeros.add(-5);
        numeros.add(9);
        numeros.add(0);
        numeros.add(-100);
        numeros.add(-32);
        numeros.add(2);


        long cuantosPostivos = numeros.stream().filter(numero -> numero >= 0).count();
        long cuantosNegativos = numeros.stream().filter(numero -> numero < 0).count();
        int suma = numeros.stream().mapToInt(Integer::valueOf).sum();

        System.out.printf("Hay %d numeros poistivos y %d numero negativos, y la suma de todos es %d",cuantosPostivos,cuantosNegativos,suma);
    }
}
