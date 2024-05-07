package array.programmareconarray;

import java.util.Scanner;

public class TantiPariQuantiDispari2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int counterPari = 0,counterDispari = 0;
        System.out.println("Inserisci 10 numeri");
        Scanner scanner  = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i : array) {
            if(i%2 == 0){
                counterPari++;
            }else {
                counterDispari++;
            }
        }
        if(counterDispari == counterPari){
            System.out.println("Tanti pari quanti dispari");
        } else if (counterDispari>=counterPari) {
            System.out.println("hai inserito più numeri dispari");
        }else {
            System.out.println("hai inserito più numeri pari");
        }
        scanner.close();
    }
}
