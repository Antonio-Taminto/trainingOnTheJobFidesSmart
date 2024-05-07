package array.programmareconarray;

import java.util.Scanner;

public class DueListe4 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Inserisci 5 numeri");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Inserisci altri 5 numeri");
        for (int i = 0; i < array.length; i++) {
            array[i] += scanner.nextInt();
        }
        System.out.println("Le somme dei numeri in posizioni corrispondenti sono :");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
