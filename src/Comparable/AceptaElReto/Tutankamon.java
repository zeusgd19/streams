package Comparable.AceptaElReto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Tutankamon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte objetos;
        String objeto;
        short valor;
        short peso;
        objetos = sc.nextByte();
        List<ObjetosTutankamon> lista = new ArrayList<>();

        while(objetos != -1){
            if(objetos != 0) {
                lista.add(new ObjetosTutankamon(objeto = sc.next()
                        ,valor = sc.nextShort()
                        ,peso = sc.nextShort())
                );
                objetos--;
            } else {
                System.out.println(extraccionOrdenada(lista));
                objetos = sc.nextByte();
                if(objetos == 0){
                    break;
                }
                lista = new ArrayList<>();
            }
        }
    }

    public static String extraccionOrdenada(List<ObjetosTutankamon> lista){
        StringBuilder resultado = new StringBuilder();
        Collections.sort(lista);

        for (ObjetosTutankamon objeto:lista
             ) {
            resultado.append(objeto).append(" ");
        }
        return resultado.toString();
    }
}
