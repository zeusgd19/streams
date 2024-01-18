package Comparable.AceptaElReto;

public class ObjetosTutankamon implements Comparable<ObjetosTutankamon>{
    private String objeto;
    private short valor;
    private short peso;

    public ObjetosTutankamon(String objeto, short valor, short peso) {
        this.peso = peso;
        this.valor = valor;
        this.objeto = objeto;
    }


    public short getValor() {
        return valor;
    }

    public void setValor(short valor) {
        this.valor = valor;
    }

    public short getPeso() {
        return peso;
    }

    public void setPeso(short peso) {
        this.peso = peso;
    }
    @Override
    public String toString(){
        return objeto + " ";
    }

    public int compareTo(ObjetosTutankamon otro){
        if(this.valor == otro.getValor()){
            return this.peso - otro.getPeso();
        } else {
            return otro.getValor() - this.valor;
        }
    }

}
