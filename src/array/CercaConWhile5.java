package array;

import java.util.Scanner;

public class CercaConWhile5 {
    public static void main(String[] args) {
        int[] array = {18, 9, 20, 211, 22, 0, -12, -83, 29, 5};
        int n;
        Scanner scanner = new Scanner(System.in);

        boolean isPresente = false;
        while(!isPresente){
            System.out.println("Inserire un numero : ");
            n = scanner.nextInt();
            for (int arrayVar : array) {
                if (n == arrayVar) {
                    isPresente = true;
                    break;
                }
            }
            if(isPresente){
                System.out.println("Presente !");
            }else {
                System.out.println("Assente !");
            }
        }
        scanner.close();
    }

}
