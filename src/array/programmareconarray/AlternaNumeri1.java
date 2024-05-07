package array.programmareconarray;

import java.util.Scanner;

public class AlternaNumeri1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Inserisci 10 numeri");
        Scanner scanner  = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Numeri in inserimenti dispari :");
        for (int i = 0; i < array.length; i+=2) {
            System.out.println(array[i]);
        }
        System.out.println("Numeri in inserimenti pari :");
        for (int i = 1; i < array.length; i+=2) {
            System.out.println(array[i]);
        }

    }
}
