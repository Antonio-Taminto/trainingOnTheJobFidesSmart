package array.programmareconarray;

public class SelectionSortStringhe6 {
    public static void main(String[] args) {
        String[] valori = {"ciao", "ciaolungo", "cia"};
        for (int i = 0; i < valori.length; i++) {
            int posmin = i;
            for (int j = i; j < valori.length; j++) {
                if (valori[j].length() < valori[posmin].length())
                    posmin = j;
            }

            String tmp = valori[i];
            valori[i] = valori[posmin];
            valori[posmin] = tmp;
        }
        for (String s : valori) {
            System.out.println(s);
        }
    }
}
