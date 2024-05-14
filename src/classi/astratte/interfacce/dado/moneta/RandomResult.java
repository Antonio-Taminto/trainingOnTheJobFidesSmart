package classi.astratte.interfacce.dado.moneta;

import java.util.Random;

public abstract class RandomResult {
    private int facce;
    public RandomResult( int facce){
        this.facce = facce;
    }
    public int tiro(){
        Random random = new Random();
        int result = random.nextInt(facce);
        return result;
    }
}
