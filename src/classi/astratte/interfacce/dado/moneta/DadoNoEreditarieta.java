package classi.astratte.interfacce.dado.moneta;

import java.util.Random;

public class DadoNoEreditarieta {
    private int facce;
    public DadoNoEreditarieta( int facce){
        this.facce = facce;
    }
    public int tiro(){
        Random random = new Random();
        int result = random.nextInt(facce);
        return result;
    }
}
