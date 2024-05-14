package ereditarieta.quesito;

import java.util.Scanner;

public class QuesitoSiNo extends Quesito{
    public QuesitoSiNo(String domanda, Integer punteggio, String risposta) {
        super(domanda, punteggio, risposta);
    }

    @Override
    public Integer ask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getDomanda());
        System.out.println("qual è la tua risposta?[si/no]");
        String risposta = scanner.nextLine();
        scanner.close();
        if(risposta.equals(this.getRisposta())){
            System.out.println("Corretto!");
            return getPunteggio();
        }else {
            System.out.println("Sbagliato!");
            return 0;
        }
    }
}
