package recap.array;

public class StampaZigZag1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0, j = array.length-1; i < array.length/2; i++,j--) {
            System.out.println(array[i] +" "+ array[j]);
        }
    }
}
