package array;

import java.util.Scanner;

public class MinimoDiArray3 {
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
        int smallest = array[0];
        int position = 0;
        for (int i = 1; i < arrayLength; i++) {
               if(smallest>array[i]){
                   smallest = array[i];
                   position = i;
               }
        }
        System.out.println("Il valore minimo e’ "+ smallest + " in posizione " + position);
    }
}
