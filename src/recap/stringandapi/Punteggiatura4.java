package recap.stringandapi;

import java.util.Scanner;

public class Punteggiatura4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parole = new String[5];
        int counterPunteggiatura=0;
        for (int i = 0; i < 5; i++) {
            parole[i] = scanner.nextLine();
        }

        for (String string : parole) {
            for (int i = 0; i < string.length(); i++) {
                char lettera = string.charAt(i);
                if (lettera == '.' || lettera == ',' || lettera == ';' || lettera == ':' || lettera == '!' || lettera == '?') {
                    counterPunteggiatura++;
                }
            }
        }
        System.out.println(counterPunteggiatura);
        scanner.close();
    }
}
