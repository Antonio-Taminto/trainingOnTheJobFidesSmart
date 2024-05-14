package classi.astratte.interfacce.dado.moneta;

import java.util.Random;

public class MonetaNoEreditarieta {
    private int facce;
    public MonetaNoEreditarieta(){
        this.facce = 2;
    }
    public int tiro(){
        Random random = new Random();
        int result = random.nextInt(facce);
        return result;
    }
}
