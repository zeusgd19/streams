package Comparable;

import java.util.*;

public class FelipeYSusTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casoPrueba;
        int prioridad;
        int duracion;
        casoPrueba = sc.nextInt();
        List<Felipe> lista = new ArrayList<>();

        while(casoPrueba != -1){
            if(casoPrueba != 0) {
                prioridad = sc.nextInt();
                duracion = sc.nextInt();
                lista.add(new Felipe(prioridad,duracion));
                casoPrueba--;
            } else {
                System.out.println(ordenar(lista));
                System.out.println("---");
                casoPrueba = sc.nextInt();
                if(casoPrueba == 0){
                    break;
                }
                lista = new ArrayList<Felipe>();
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
