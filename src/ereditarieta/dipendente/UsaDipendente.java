package ereditarieta.dipendente;

public class UsaDipendente {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente("Mario Rossi","via roma 13",2020,1250.5);
        Dipendente dipendente2 = new Dipendente("Paolo Bianchi","via napoli 1",2021,1200.0);
        Dipendente dipendente3 = new Dipendente("Anna Verdi","via milano 3",2022,1300.2);

        if(dipendente1.guadagnaDiPiu(dipendente2) && dipendente1.guadagnaDiPiu(dipendente3)){
            dipendente1.visualizza();
            if(dipendente2.guadagnaDiPiu(dipendente3)){
                dipendente2.visualizza();
                dipendente3.visualizza();
            }else {
                dipendente3.visualizza();
                dipendente2.visualizza();
            }
        } else if (dipendente2.guadagnaDiPiu(dipendente1) && dipendente2.guadagnaDiPiu(dipendente3) ) {
            dipendente2.visualizza();
            if(dipendente1.guadagnaDiPiu(dipendente3)){
                dipendente1.visualizza();
                dipendente3.visualizza();
            }else {
                dipendente3.visualizza();
                dipendente1.visualizza();
            }
        }else {
            dipendente3.visualizza();
            if(dipendente1.guadagnaDiPiu(dipendente2)){
                dipendente1.visualizza();
                dipendente2.visualizza();
            }else {
                dipendente2.visualizza();
                dipendente1.visualizza();
            }
        }
    }
}
