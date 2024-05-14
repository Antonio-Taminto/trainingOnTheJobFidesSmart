package ereditarieta.quesito;

import java.util.Scanner;

public class QuesitoNumerico extends Quesito{
    public QuesitoNumerico(String domanda, Integer punteggio, String risposta) {
        super(domanda, punteggio, risposta);
    }

    @Override
    public Integer ask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getDomanda());
        System.out.println("qual è la tua risposta?");
        Integer risposta = scanner.nextInt();
        if(risposta.equals(Integer.parseInt(getRisposta()))){
            System.out.println("Corretto!");
            return getPunteggio();
        }else {
            System.out.println("Sbagliato!");
            return 0;
        }
    }
}
