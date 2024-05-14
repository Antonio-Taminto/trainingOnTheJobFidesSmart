package ereditarieta.calcoloarea;

public class Rettangolo {
    private Integer base,altezza;

    public Rettangolo(Integer altezza, Integer base) {
        this.altezza = altezza;
        this.base = base;
    }

    public Integer getAltezza() {
        return altezza;
    }

    public void setAltezza(Integer altezza) {
        this.altezza = altezza;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }
    public Integer calcoloArea(){
        Integer area = base*altezza;
        return area;
    }
}
