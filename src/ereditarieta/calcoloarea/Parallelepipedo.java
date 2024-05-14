package ereditarieta.calcoloarea;

public class Parallelepipedo extends Rettangolo{
    private Integer profondita;

    public Parallelepipedo(Integer altezza, Integer base, Integer profondita) {
        super(altezza, base);
        this.profondita = profondita;
    }

    public Integer getProfondita() {
        return profondita;
    }

    public void setProfondita(Integer profondita) {
        this.profondita = profondita;
    }
    public Integer calcoloVolume(){
        Integer volume = calcoloArea() * profondita;
        return volume;
    }
}
