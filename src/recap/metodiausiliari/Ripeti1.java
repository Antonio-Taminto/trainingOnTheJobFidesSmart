package recap.metodiausiliari;

import java.util.Scanner;

public class Ripeti1 {
    public static void main(String[] args) {
        String string;
        int counter;
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
        counter = scanner.nextInt();
        printNTimes(string,counter);
        scanner.close();
    }
    private static void printNTimes(String stringa,int counter){
        if(counter<1){
            System.out.println("errore numero non valido");
        }else {
            for (int i = 0; i < counter; i++) {
                System.out.println(stringa);
            }
        }
    }
}
