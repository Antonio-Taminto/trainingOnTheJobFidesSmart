package recap.stringandapi;

import java.util.Scanner;

public class Lunghezze3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        int lengthSum = 0;
        string = scanner.nextLine();
        while (!string.isEmpty()){
            if(Character.isUpperCase(string.charAt(0))){
                lengthSum+=string.length();
            }
            string = scanner.nextLine();
        };
        System.out.println(lengthSum);
        scanner.close();
    }
}
