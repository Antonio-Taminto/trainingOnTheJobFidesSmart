package ereditarieta.quesito;

import java.util.Scanner;

public class Quesito {
    private String domanda;
    private String risposta;
    private Integer punteggio;

    public Quesito(String domanda, Integer punteggio, String risposta) {
        this.domanda = domanda;
        this.punteggio = punteggio;
        this.risposta = risposta;
    }

    public String getDomanda() {
        return domanda;
    }

    public void setDomanda(String domanda) {
        this.domanda = domanda;
    }

    public Integer getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(Integer punteggio) {
        this.punteggio = punteggio;
    }

    public String getRisposta() {
        return risposta;
    }

    public void setRisposta(String risposta) {
        this.risposta = risposta;
    }
    public Integer ask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(domanda);
        System.out.println("qual è la tua risposta?");
        String risposta = scanner.nextLine();
        if(risposta.equals(this.risposta)){
            System.out.println("Corretto!");
            return punteggio;
        }else {
            System.out.println("Sbagliato!");
            return 0;
        }
    }
}
