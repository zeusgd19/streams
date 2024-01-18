package Comparable.AceptaElReto;

import java.util.*;

public class JusticaLoteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int localidades;
        int dinero;
        int premios;
        localidades = sc.nextInt();
        List<Justicia> lista = new ArrayList<>();

        while(localidades != -1){
            if(localidades != 0) {
                lista.add(new Justicia(dinero = sc.nextInt()
                        ,premios = sc.nextInt())
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
        String resultado = "";
            Collections.sort(lista);

        for (int i = 0; i < lista.size() - 1; i++) {
            for(int j = i + 1; j < lista.size(); j ++) {
                if (lista.get(i).getDinero() > lista.get(j).getDinero()) {
                    if (lista.get(i).getPremio() <= lista.get(j).getPremio()) {
                        resultado = "NO";
                        break;
                    } else {
                        resultado = "SI";
                    }
                }
            }
        }
            return resultado;
        }
}
