package array;

import java.util.Scanner;

public class Inversi2 {
    public static void main(String[] args) {
        int[] array;
        int arrayLength ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("quanti numeri vuoi inserire?");
        arrayLength = scanner.nextInt();
        System.out.println("inserisci " + arrayLength+ " numeri: ");
        array = new int[arrayLength];
        for(int i = 0;i< arrayLength;i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println();
        for (int i = arrayLength-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
