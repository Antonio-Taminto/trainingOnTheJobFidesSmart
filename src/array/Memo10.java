package array;

import java.util.Scanner;

public class Memo10 {
    public static void main(String[] args) {
        String[] memo = {"cane", "gatto", "topo", "criceto", "pesce",
                "uccello","maiale","leone","elefante","insetto"};
        char selezione=' ';
        Scanner scanner = new Scanner(System.in);
        while(!(selezione == 'E'|| selezione == 'e')){
            System.out.println("Seleziona cosa si vuol fare: " +
                    "\n[S] Stampa stringhe dalla posizione ... alla ..." +
                    "\n[M] Modifica stringa in posizione ..." +
                    "\n[T] Trova posizione della stringa ..." +
                    "\n[E] Esci\n");
            selezione = scanner.next().charAt(0);
            switch (selezione){
                case 's':case'S':
                    System.out.println("posizione dove inziare");
                    int start= scanner.nextInt();
                    System.out.println("posizione dove finire");
                    int end = scanner.nextInt();
                    stampaDatePosizioni(start,end,memo);
                    break;
                case 'm': case'M':
                    System.out.println("posizione da cambiare");
                    int position = scanner.nextInt();
                    System.out.println("stringa con cui cambiare");
                    String newString = scanner.next();
                    cambiaStringConPosizione(position,newString,memo);
                    break;
                case't': case'T':
                    System.out.println("stringa da cercare");
                    String stringToFind = scanner.next();
                    findInArrayFromString(stringToFind,memo);
                    break;
                case'e': case'E':
                    System.out.print("il contenuto è : ");
                    for (String s : memo) {
                        System.out.print(s+ " ");
                    }
                    break;
                default:
                    System.out.println("errore selezione errata");
            }
        }
    }
    private static void stampaDatePosizioni(int start, int end, String[] array){
        for (int i = start; i < end; i++) {
            System.out.println(array[i]);
        }
    }
    private static void cambiaStringConPosizione(int position,String Dato,String[] array){
        array[position] = Dato;
    }
    private static void findInArrayFromString(String stringToFind,String[] array){
        boolean found = false;
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if(stringToFind.equals(array[i])){
                found = true;
                position = i;
            }
        }
        if(found){
            System.out.println("posizione : " + position);
        }else {
            System.out.println("errore non trovata");
        }
    }
}
