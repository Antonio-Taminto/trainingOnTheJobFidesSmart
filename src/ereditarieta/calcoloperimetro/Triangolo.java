package ereditarieta.calcoloperimetro;

public class Triangolo {
    private Integer lato1,lato2,lato3;

    public Triangolo(Integer lato1, Integer lato2, Integer lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public Integer getLato1() {
        return lato1;
    }

    public void setLato1(Integer lato1) {
        this.lato1 = lato1;
    }

    public Integer getLato2() {
        return lato2;
    }

    public void setLato2(Integer lato2) {
        this.lato2 = lato2;
    }

    public Integer getLato3() {
        return lato3;
    }

    public void setLato3(Integer lato3) {
        this.lato3 = lato3;
    }
    public boolean isTriangolo(){
        boolean isTriangolo = lato1 + lato2 > lato3  && lato1 + lato3 > lato2 && lato2 + lato3 > lato1;
        return isTriangolo;
    }
    public Integer calcoloPerimetro(){
        if (isTriangolo()){
            return lato1+lato2+lato3;
        }else {
            return 0;
        }
    }
}
