package Flujos;

import java.util.ArrayList;

public class MediaAnio {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book booksDos;
        Person autor;
        autor = new Person("Joanne","Rowling",1965);
        booksDos = new Book(autor,"Harry Potter y la piedra filosofal",320);
        books.add(booksDos);
        booksDos = new Book(autor,"Harry Potter y la camara secreta",320);
        books.add(booksDos);
        booksDos = new Book(autor,"Harry Potter y el prisionero de Azkaban",320);
        books.add(booksDos);
        booksDos = new Book(autor,"Harry Potter y el cáliz de fuego",320);
        books.add(booksDos);


        autor = new Person("Carlos","Ruiz Zafon",1964);
        booksDos = new Book(autor,"El principe de la niebla",208);
        books.add(booksDos);

        booksDos = new Book(autor,"Las luces de septiembre",320);
        books.add(booksDos);

        double average = books.stream()
                .map(Book::getAuthor)
                .mapToInt(Person::getBirthYear)
                .average()
                .getAsDouble();


        books.stream()
                .map(Book::getName)
                .filter(name -> name.contains("Potter"))
                .forEach(System.out::println);


        System.out.println("Average of the authors' birth years: " + average);
    }
}
