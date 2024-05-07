package array.programmareconarray;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DueListe2_5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int counterNumeriInComune = 0;
        int sommaNumeriInComune =0;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Inserisci 5 numeri");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Inserisci altri 5 numeri");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }
        boolean uguali;
        int[] numeriComuni = new int[5];
        boolean[] controllato = new boolean[5];
        for (int i : array1) {
            uguali = false;
            for (int j = 0; j < 5; j++) {
                if (i == array2[j] && !controllato[j]) {
                    numeriComuni[counterNumeriInComune] = i;
                    counterNumeriInComune++;
                    controllato[j] = true;
                    break;
                }
            }
        }
        for (int i = 0; i < counterNumeriInComune; i++) {
            sommaNumeriInComune += numeriComuni[i];
        }

        System.out.println("Le due liste hanno " + counterNumeriInComune + " numeri in comune");
        if(counterNumeriInComune>1){
            System.out.println("La somma dei numeri in comune alle due liste è :"+sommaNumeriInComune);
        }
        scanner.close();
    }
}
