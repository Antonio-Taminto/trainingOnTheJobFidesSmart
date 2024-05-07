package array;

public class Temperature7 {
    public static void main(String[] args) {
        double[] temperature = {18.0, 19.5, 20.0, 21.0, 22.3,
                24.0, 23.6, 22.8, 22.9, 20.5, 19.2, 18.7};
        double media=0;
        for (double t : temperature) {
            media+=t;
        }
        media /= temperature.length;
        for (double t : temperature) {
            if(t<media){
                System.out.println(t + " inferiore alla media");
            }else {
                System.out.println(t + " superiore o uguale alla media");
            }
        }
    }
}
