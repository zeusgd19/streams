package Flujos;

import java.util.ArrayList;
import java.util.List;

public class EmpiezaPorA {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "Andrés", 1968);
        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);
        personas.add(persona);

        long cuantos = personas.stream().filter(person -> person.getLastName().
                startsWith("A")).count();

        System.out.printf("El numero de personas que su primer apellidos empieza por A son: %d",cuantos);

    }
}
