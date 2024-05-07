package recap.array;

import java.util.Scanner;

public class DueSequenze6 {
    public static void main(String[] args) {
        String[] array = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci 5 parole");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        System.out.println("Inserisci altre 5 parole");
        boolean areEquals = false;
        for (int i = 0; i < array.length; i++) {
            String parola = scanner.nextLine();
            for (String string : array) {
                if (parola.equals(string)) {
                    areEquals = true;
                    break;
                }
            }
        }
        if (areEquals) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
