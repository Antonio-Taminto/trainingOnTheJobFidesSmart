package recap.stringandapi;

import java.util.Scanner;

public class Contrario1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parolaDaInvertire = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = parolaDaInvertire.length()-1; i >= 0; i--) {
            stringBuilder.append(parolaDaInvertire.charAt(i));
        }
        System.out.println(stringBuilder);
    }
}
