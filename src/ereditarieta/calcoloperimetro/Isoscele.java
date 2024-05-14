package ereditarieta.calcoloperimetro;

public class Isoscele extends Triangolo{
    public Isoscele(Integer lato1, Integer lato2, Integer lato3) {
        super(lato1, lato2, lato3);
    }

    @Override
    public boolean isTriangolo() {
        if (super.isTriangolo())
            return !getLato1().equals(getLato2()) && !getLato1().equals(getLato3()) && !getLato2().equals(getLato3());
        return false;
    }
}
