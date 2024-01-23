package Comparable.AceptaElReto;

import java.util.*;

public class NiniosBuenos {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ninio;
    ninio = sc.nextInt();
    List<Ninios> lista = new ArrayList<>();

        while(ninio != -1){
        if(ninio != 0) {
            lista.add(new Ninios(sc.nextByte()
                    ,sc.nextShort())
            );
            ninio--;
        } else {
            System.out.println(ordenar(lista));
            System.out.println("---");
            ninio = sc.nextInt();
            if(ninio == 0){
                break;
            }
            lista = new ArrayList<>();
        }
    }
}

    public static String ordenar(List<Ninios> lista){
        StringBuilder resultado = new StringBuilder();

        Comparator<Ninios> comparator = (p, q) -> q.getPrioridad() - p.getPrioridad();
        Comparator<Ninios> comparator2 = comparator.thenComparing(Ninios::getPeso);
        Collections.sort(lista,comparator2);
        for (Ninios ninios : lista){
            resultado.append(ninios).append("\n");
        }
        return resultado.toString();
    }
}
