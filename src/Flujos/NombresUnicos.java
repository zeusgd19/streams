package Flujos;

import java.util.ArrayList;

public class NombresUnicos {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "García", 1968);
        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);
        personas.add(persona);
        persona = new Person("Juan","Perez",1975);
        personas.add(persona);

        personas.stream().map(Person::getFirstName)
                .distinct()
                .sorted()
                .forEach(System.out::println);


    }
}
