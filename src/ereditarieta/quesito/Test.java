package ereditarieta.quesito;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Quesito quesito = new Quesito("una domanda generale",10,"una risposta corretta");
        QuesitoSiNo quesitoSiNo = new QuesitoSiNo("una domanda generale con risposta si/no",10,"si");
        QuesitoNumerico quesitoNumerico = new QuesitoNumerico("una domanda generale con risposta numeriica",10,"10");
        QuesitoMultiplo quesitoMultiplo = new QuesitoMultiplo("una domanda generale multipla",10,"1",4);

        Quesito[] quesitoArray = {quesito,quesitoSiNo,quesitoNumerico,quesitoMultiplo};
        Random random = new Random();
        int numeroQuestitoDaChiedere = random.nextInt(quesitoArray.length);
        if(numeroQuestitoDaChiedere == 0)
            numeroQuestitoDaChiedere++;
        int punteggio = 0;
        System.out.println("verranno effettuati : " + numeroQuestitoDaChiedere+" questiti ");
        for (int i = 0; i < numeroQuestitoDaChiedere;i++) {
            int randomDomanda = random.nextInt(quesitoArray.length);
            punteggio += quesitoArray[i].ask();
        }
        System.out.println("il punteggio finale è:" +punteggio);
    }
}
