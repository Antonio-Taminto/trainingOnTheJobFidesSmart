package ereditarieta.prodotti;

/**
 *  * Scrivere inoltre una classe ProdottoScontabile che rappresenta un caso particolare di Prodotto in
 *  * cui `e possibile vendere pi`u di una unit`a per volta.
 *  * • Superata una certa quantit`a di prodotti venduti contemporaneamente, verr`a praticato uno sconto
 *  * al prezzo totale di vendita.
 *  * • L’entit`a dello sconto e la quantit`a di prodotti oltre la quale si ottiene tale sconto `e decisa al momento
 *  * della creazione dell’oggetto della classe.
 *  * Implementare tale meccanismo di vendita in una nuova versione del metodo vendi che ricever`a la quantit`a
 *  * da vendere come parametro.
 *  * Le classi implementate dovranno essere raccolte in un package prodotti.
 *  * Scrivere inoltre una classe UsaProdotti che contiene un main che testa le varie funzionalit`a delle classi
 *  * implementate. La classe UsaProdotti deve appartenere al package di default.
 */
public class ProdottoScontabile extends Prodotto{
    private Integer sconto;
    private Integer quantitaPerSconto;

    public ProdottoScontabile(String descrizione, Double prezzo, Integer quantitaDisponibile, Integer quantitaPerSconto, Integer sconto) {
        super(descrizione, prezzo, quantitaDisponibile);
        this.quantitaPerSconto = quantitaPerSconto;
        this.sconto = sconto;
    }

    public ProdottoScontabile(Double prezzo, String descrizione, Integer quantitaPerSconto, Integer sconto) {
        super(prezzo, descrizione);
        this.quantitaPerSconto = quantitaPerSconto;
        this.sconto = sconto;
    }

    public Integer getQuantitaPerSconto() {
        return quantitaPerSconto;
    }

    public void setQuantitaPerSconto(Integer quantitaPerSconto) {
        this.quantitaPerSconto = quantitaPerSconto;
    }

    public Integer getSconto() {
        return sconto;
    }

    public void setSconto(Integer sconto) {
        this.sconto = sconto;
    }

    public boolean vendi(Integer quantitaDaAquistare) {
        if (getQuantitaDisponibile()>=quantitaDaAquistare){
            Double prezzo = getPrezzo()*quantitaDaAquistare;
            if(quantitaDaAquistare>=quantitaPerSconto){
                prezzo -= (prezzo/100*sconto);
            }
            System.out.println("Venduto un " + getDescrizione() + " al prezzo di euro : " + prezzo + " in totale");
            return true;
        }else {
            return false;
        }

    }
}
