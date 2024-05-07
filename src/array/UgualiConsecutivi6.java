package array;

import java.util.Scanner;

public class UgualiConsecutivi6 {
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
        for (int i = 1; i < arrayLength; i++) {
            if(array[i]==array[i-1]){
                System.out.println("Il valore " +array[i]+" in posizione " + i + " è uguale al precedente");
            }
        }
    }
}
