package recap.metodiausiliari;

public class MezziCasuali3 {
    public static void main(String[] args) {
        System.out.println(numeroRandom());
    }

    private static double numeroRandom() {
        double random = Math.random();
        if(random>=0.5){
            return random-0.5;
        }else {
            return random;
        }
    }
}
