package recap.array;

import java.util.Scanner;

public class SecondoArray3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int newArrayLength = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i : array) {
            if(i>0){
                newArrayLength++;
            }
        }
        int[] newArray = new int[newArrayLength];
        for (int i = 0,j=0; i < array.length; i++) {
            if(array[i]>0){
                newArray[j] = array[i];
                j++;
            }
        }
        for (int i = newArray.length-1; i >=0 ; i--) {
            System.out.println(newArray[i]);
        }
        scanner.close();
    }
}
