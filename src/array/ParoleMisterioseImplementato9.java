package array;

import java.util.Scanner;

public class ParoleMisterioseImplementato9 {
    public static void main(String[] args) {
        String[] parole = {"cane", "gatto", "topo", "criceto", "pesce"};
        int tentativi = 0;
        Scanner scanner = new Scanner(System.in);
        while(tentativi<3){
            boolean found=false;
            System.out.println("Inserire una parola: ");
            String parola = scanner.nextLine();
            for (String s : parole) {
                if(parola.equals(s)){
                    found = true;
                }
            }
            if(found){
                System.out.println("Indovinato");
                System.out.print("Le altre parole sono: ");
                for (String s : parole) {

                    if(!parola.equals(s)){
                        System.out.print(s+" ");
                    }
                }
                System.out.println();
                tentativi = 0;
            }else {
                System.out.println("Sbagliato");
                tentativi++;
            }
            if(tentativi==3){
                System.out.print("Le parole erano: ");
                for (String s : parole) {
                    System.out.print(s+" ");
                }
            }
        }
        scanner.close();
    }
}
