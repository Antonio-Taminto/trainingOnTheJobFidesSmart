package recap.array;

public class DoppioUnoDellaltro5 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        boolean isDoppio = false;
        for (int i : array) {
            if(isDoppio){
                break;
            }
            for (int j : array) {
                if (i/2 == j) {
                    isDoppio = true;
                    break;
                }
            }
        }
        if (isDoppio){
            System.out.println("Doppio uno dell’altro");
        }else {
            System.out.println("NO");
        }
    }
}
