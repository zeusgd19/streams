package Flujos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ApellidosUnicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] personas;
        Person persona;
        List<Person> apellidos = new ArrayList<>();
        String datos = sc.nextLine();
        personas = datos.split(" ");

        while(!datos.isEmpty()){
            persona = new Person(personas[0],personas[1],Integer.parseInt(personas[2]));
            datos = sc.nextLine();
            personas = datos.split(" ");
            apellidos.add(persona);
        }

        apellidos.stream().
                map(Person::getLastName).
                distinct().
                sorted().forEach(System.out::println);
    }
}
