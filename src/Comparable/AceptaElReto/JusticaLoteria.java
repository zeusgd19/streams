package Comparable.AceptaElReto;

import java.util.*;

public class JusticaLoteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int localidades;
        localidades = sc.nextInt();
        List<Justicia> lista = new ArrayList<>();

        while(localidades != -1){
            if(localidades != 0) {
                lista.add(new Justicia(sc.nextInt()
                        , sc.nextInt())
                );
                localidades--;
            } else {
                System.out.println(comprobar(lista));
                localidades = sc.nextInt();
                if(localidades == 0){
                    break;
                }
                lista = new ArrayList<>();
            }
        }
    }

    public static String comprobar(List<Justicia> lista){
            Collections.sort(lista);

        for (int i = 0; i < lista.size() - 1; i++) {
            if(lista.get(i).getDinero() > lista.get(i + 1).getDinero()) {
                if (lista.get(i).getPremio() <= lista.get(i + 1).getPremio()) {
                    return "NO";
                }
            }
        }
            return "SI";
        }
}
