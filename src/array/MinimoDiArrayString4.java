package array;


import java.util.Scanner;

public class MinimoDiArrayString4 {
    public static void main(String[] args) {
        String[] array= new String[10];
        int arrayLength = array.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci 10 parole");
        for(int i = 0;i< arrayLength;i++){
            array[i] = scanner.nextLine();
        }
        scanner.close();
        System.out.println();
        String smallest = array[0];
        int position = 0;
        for (int i = 1; i < arrayLength; i++) {
            if(smallest.compareTo(array[i]) < 0){
                smallest = array[i];
                position = i;
            }
        }
        System.out.println("La prima parola in ordine lessicografico è  "+ smallest + " in posizione " + position);

    }
}
