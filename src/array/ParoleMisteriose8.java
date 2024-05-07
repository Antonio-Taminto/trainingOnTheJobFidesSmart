package array;

import java.util.Scanner;

public class ParoleMisteriose8 {
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
                tentativi = 0;
            }else {
                System.out.println("Sbagliato");
                tentativi++;
            }
        }
        scanner.close();
    }
}
