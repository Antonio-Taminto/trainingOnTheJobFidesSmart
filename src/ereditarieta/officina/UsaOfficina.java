package ereditarieta.officina;

import ereditarieta.veicolo.Motociclo;
import ereditarieta.veicolo.Veicolo;
import ereditarieta.veicolo.Vettura;

public class UsaOfficina {
    public static void main(String[] args) {
        Veicolo veicolo1 = new Vettura(false,"BMW","m3","AB123CD","utilitaria");
        Veicolo veicolo2 = new Vettura(true,"audi","a3","AB456CD","utilitaria");
        Veicolo veicolo3 = new Motociclo(true,"KTM","790","AB12345",799);
        Veicolo veicolo4 = new Motociclo(false,"KTM","890","AB67890",899);

        Officina officina = new Officina();
        System.out.println("riparazione veicolo1 al prezzo di: " + officina.ripara(veicolo1) + "€");
        System.out.println("riparazione veicolo2 al prezzo di: " + officina.ripara(veicolo2) + "€");
        System.out.println("riparazione veicolo3 al prezzo di: " + officina.ripara(veicolo3) + "€");
        System.out.println("riparazione veicolo4 al prezzo di: " + officina.ripara(veicolo4) + "€");
    }
}
