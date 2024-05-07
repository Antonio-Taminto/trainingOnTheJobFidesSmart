package recap.stringandapi;

import java.util.Scanner;

public class SpaziVocali3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parolaDaInvertire = scanner.nextLine();
        parolaDaInvertire = parolaDaInvertire.toLowerCase();
        int counter = 0;
        for (int i = 0; i < parolaDaInvertire.length()-1; i++) {
            char lettera = parolaDaInvertire.charAt(i+1);
            if ((lettera == 'a' || lettera == 'e' || lettera == 'i' || lettera == 'o' || lettera == 'u') &&
                    parolaDaInvertire.charAt(i) == ' ') {
                counter++;
            }
        }
        System.out.println(counter);
        scanner.close();
    }
}
