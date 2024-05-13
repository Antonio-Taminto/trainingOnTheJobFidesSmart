package oop.potenza;

public class Potenza {
    private Double base,esponente;
    public Potenza(Double base,Double esponente){
        this.base = base;
        this.esponente = esponente;
    }

    public Double getEsponente() {
        return esponente;
    }

    public void setEsponente(Double esponente) {
        this.esponente = esponente;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }
    public Double pow(){
        return Math.pow(base,esponente);
    }
}
