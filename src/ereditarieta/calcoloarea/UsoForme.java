package ereditarieta.calcoloarea;

public class UsoForme {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(10,25);
        Parallelepipedo parallelepipedo = new Parallelepipedo(20,15,10);

        System.out.println("l'area del rettangolo è: " + rettangolo.calcoloArea());
        System.out.println("il volume del parallelepipedo è: " + parallelepipedo.calcoloVolume());
    }
}
