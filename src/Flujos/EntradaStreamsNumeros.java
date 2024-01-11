package Flujos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaStreamsNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        List<Integer> numeros = new ArrayList<>();
        while(numero >= 0){
            numeros.add(numero);
            numero = sc.nextInt();
        }

        numeros.stream().filter(p -> p >= 1 && p <= 5).forEach(System.out::println);
    }
}
