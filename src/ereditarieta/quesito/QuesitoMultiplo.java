package ereditarieta.quesito;

import java.util.Scanner;

public class QuesitoMultiplo extends QuesitoNumerico{
    private int numeroDiRisposte;
    public QuesitoMultiplo(String domanda, Integer punteggio, String risposta,int numeroDiRisposte) {
        super(domanda, punteggio, risposta);
        this.numeroDiRisposte = numeroDiRisposte;
    }
    @Override
    public Integer ask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getDomanda());
        System.out.println("qual è la tua risposta?");
        Integer risposta = scanner.nextInt();
        scanner.close();
        if (risposta<1 || risposta>numeroDiRisposte){
            System.out.println("risposta non corretta");
            return 0;
        }
        if(risposta.equals(Integer.parseInt(getRisposta()))){
            System.out.println("Corretto!");
            return getPunteggio();
        }else {
            System.out.println("Sbagliato!");
            return 0;
        }
    }
}
