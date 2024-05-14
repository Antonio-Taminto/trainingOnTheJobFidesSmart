package classi.astratte.interfacce.dado.moneta;

public class TestRandom {
    public static void main(String[] args) {
        DadoNoEreditarieta dadoNoEreditarieta = new DadoNoEreditarieta(6);
        MonetaNoEreditarieta monetaNoEreditarieta = new MonetaNoEreditarieta();

        Dado dado = new Dado(6);
        Moneta moneta = new Moneta();

        System.out.println(dadoNoEreditarieta.tiro());
        if (monetaNoEreditarieta.tiro() == 1)
            System.out.println("testa");
        else
            System.out.println("croce");

        System.out.println(dado.tiro());
        if (moneta.tiro() == 1)
            System.out.println("testa");
        else
            System.out.println("croce");
    }
}
