package array.programmareconarray;

import java.util.Scanner;

public class CercaSomma3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        boolean sommma100 = false;
        System.out.println("Inserisci 5 numeri");
        Scanner scanner  = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i : array) {
            for (int j : array) {
                if (i + j == 100) {
                    sommma100 = true;
                    break;
                }
            }
        }
        if(sommma100){
            System.out.println("ci sono due numeri con somma pari a 100!");
        }else {
            System.out.println("non ci sono due numeri con somma pari a 100!");
        }
        scanner.close();
    }

}
