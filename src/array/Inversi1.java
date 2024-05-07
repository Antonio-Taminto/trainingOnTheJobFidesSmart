package array;

import java.util.Scanner;

public class Inversi1 {
    public static void main(String[] args) {
        int[] array= new int[10];
        int arrayLength = array.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci 10 numeri");
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
