package recap.array;

import java.util.Scanner;

public class TreConsecutivi4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        boolean treConsecutivi = false;
        for (int i = 2; i < array.length; i++) {
            if(array[i] == array[i-1] && array[i] == array[i-2]){
                treConsecutivi = true;
                break;
            }
        }
        if (treConsecutivi){
            System.out.println("Tre valori consecutivi uguali");
        }else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
