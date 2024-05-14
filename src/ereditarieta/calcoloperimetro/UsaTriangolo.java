package ereditarieta.calcoloperimetro;

public class UsaTriangolo {
    public static void main(String[] args) {
        Integer lato1 = 3,lato2 = 3,lato3 =3;
        Triangolo triangolo = new Triangolo(lato1,lato2,lato3);
        Isoscele isoscele = new Isoscele(lato1,lato2,lato3);
        Scaleno scaleno = new Scaleno(lato1,lato2,lato3);

        if(triangolo.isTriangolo()){
            System.out.println("è un triangolo con perimetro: " +triangolo.calcoloPerimetro());

        }else {
            System.out.println("non è un triangolo");
        }
        if(isoscele.isTriangolo()){
            System.out.println("è un triangolo isoscele con perimetro: " + isoscele.calcoloPerimetro());
        }else {
            System.out.println("non è un triangolo isoscele");
        }
        if(scaleno.isTriangolo()){
            System.out.println("è un triangolo scaleno con perimetro: " + scaleno.calcoloPerimetro());
        }else {
            System.out.println("non è un triangolo scaleno");
        }
    }
}
