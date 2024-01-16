package Comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Poblacion {

    public static void analfabetas(List<Pais> lista, String line){
        String info[] = line.split(",");
        String country = info[5];
        int value = Integer.parseInt(info[8]);
        lista.add(new Pais(country,value));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("illiterate.csv"));
        String line;
        reader.readLine();
        List<Pais> lista = new ArrayList<>();
        while ((line = reader.readLine())!=null) {
            analfabetas(lista,line);
        }
        reader.close();

        lista.stream().sorted().forEach(System.out::println);
    }
}
