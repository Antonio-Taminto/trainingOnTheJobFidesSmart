package classi.astratte.interfacce.quadrato.cubo;

public class UsaOperazione {
    public static void main(String[] args) {
        CalcoloQuadrato calcoloQuadrato = new CalcoloQuadrato();
        CalcoloCubo calcoloCubo = new CalcoloCubo();

        System.out.println(calcoloCubo.calcolo(10));
        System.out.println(calcoloQuadrato.calcolo(10));
    }
}
