package array.programmareconarray;

import java.util.Scanner;

public class RubricaTelefonica7 {
    public static void main(String[] args) {
        String[] nomi = new String[5];
        long[] numeroTelefono = new long[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il nome:");
            nomi[i] = scanner.nextLine();
            System.out.println("Inserisci il numero di telefono:");
            numeroTelefono[i] = scanner.nextLong();
            scanner.nextLine();
        }
        System.out.println("Ecco il contenuto della rubrica");
        for (int i = 0; i < 5; i++) {
            System.out.print(nomi[i]+ " " + numeroTelefono[i] + "\n" );
        }
    }
}
