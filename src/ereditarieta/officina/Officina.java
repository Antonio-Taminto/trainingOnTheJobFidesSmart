package ereditarieta.officina;

import ereditarieta.veicolo.Motociclo;
import ereditarieta.veicolo.Veicolo;
import ereditarieta.veicolo.Vettura;

public class Officina {
    public double ripara(Veicolo veicolo){
        double prezzo=0.0;
        if(veicolo instanceof Motociclo){
            prezzo = 100.0;
        } else if (veicolo instanceof Vettura) {
            prezzo = 150.0;
        }
        if(veicolo.isGuasto()){
            prezzo+=50;
            veicolo.setGuasto(false);
        }
        return prezzo;
    }
}
