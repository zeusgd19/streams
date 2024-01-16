package Comparable;

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
                dinero = sc.nextInt();
                premios = sc.nextInt();
                lista.add(new Justicia(dinero,premios));
                localidades--;
            } else {
                System.out.println(comprobar(lista));
                localidades = sc.nextInt();
                if(localidades == 0){
                    break;
                }
                lista = new ArrayList<Justicia>();
            }
        }
    }

    public static String comprobar(List<Justicia> lista){
        String resultado = "";
            Collections.sort(lista);

        for (int i = 0; i < lista.size() - 1; i++) {
            if(lista.get(i).getDinero() > lista.get(i + 1).getDinero()) {
                if (lista.get(i).getPremio() <= lista.get(i + 1).getPremio()){
                    resultado = "NO";
                    break;
                } else {
                    resultado = "SI";
                }
            }
        }
            return resultado;
        }
}
