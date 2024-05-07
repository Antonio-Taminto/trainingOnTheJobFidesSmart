package array;

import java.util.Scanner;

public class Cerca5 {
    public static void main(String[] args) {
        int[] array = {18, 9, 20, 211, 22, 0, -12, -83, 29, 5};
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        boolean isPresente = false;
        for (int i : array) {
            if (n == i) {
                isPresente = true;
                break;
            }
        }
        scanner.close();
        if(isPresente){
            System.out.println("Presente !");
        }else {
            System.out.println("Assente !");
        }
    }
}
