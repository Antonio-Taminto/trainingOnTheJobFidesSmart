package recap.stringandapi;

import java.util.Scanner;

public class SoloVocali2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parolaDaInvertire = scanner.nextLine();
        StringBuilder parolaSoloVocali = new StringBuilder();
        for (int i = 0; i < parolaDaInvertire.length(); i++) {
            char lettera = parolaDaInvertire.charAt(i);
            if(lettera == 'a'||lettera == 'e'||lettera == 'i'||lettera == 'o'||lettera == 'u'){
                parolaSoloVocali.append(lettera);
            }
        }
        System.out.println(parolaSoloVocali);
        scanner.close();
    }
}
