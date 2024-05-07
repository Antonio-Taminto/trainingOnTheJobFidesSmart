package recap.metodiausiliari;

import java.util.Scanner;

public class Concatena4 {
    public static void main(String[] args) {
        String[] parole = new String[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            parole[i] = scanner.nextLine();
        }
        System.out.println(stringaConcatenata(parole));
    }
    private static String stringaConcatenata(String[] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if(i< array.length-1){
                stringBuilder.append("*");
            }
        }
        return stringBuilder.toString();
    }
}
