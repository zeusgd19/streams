package Flujos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class EntradasStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        List<String> cadenas = new ArrayList<>();

        while(!cadena.isEmpty()){
            cadenas.add(cadena);
            cadena = sc.nextLine();
        }

        cadenas.stream().forEach(System.out::println);
    }
}
