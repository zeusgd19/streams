package Comparable.AceptaElReto;

import java.util.*;

public class FelipeYSusTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte casoPrueba;
        short prioridad;
        short duracion;
        casoPrueba = sc.nextByte();
        List<Felipe> lista = new ArrayList<>();

        while(casoPrueba != -1){
            if(casoPrueba != 0) {
                lista.add(new Felipe(prioridad = sc.nextShort()
                        ,duracion = sc.nextShort())
                );
                casoPrueba--;
            } else {
                System.out.println(ordenar(lista));
                System.out.println("---");
                casoPrueba = sc.nextByte();
                if(casoPrueba == 0){
                    break;
                }
                lista = new ArrayList<>();
            }
        }
    }

    public static String ordenar(List<Felipe> lista){
        StringBuilder resultado = new StringBuilder();

        Comparator<Felipe> comparator = (p,q) -> q.getPrioridad() - p.getPrioridad();
        Comparator<Felipe> comparator2 = comparator.thenComparing(Felipe::getDuracion);
        Collections.sort(lista,comparator2);
        for (Felipe felipe : lista){
            resultado.append(felipe).append("\n");
        }
        return resultado.toString();
    }
}
