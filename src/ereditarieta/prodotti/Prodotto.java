package ereditarieta.prodotti;

/**
 * Scrivere una classe Prodotto che rappresenta un prodotto vendibile in un negozio, indicandone:
 * • una breve descrizione,
 * • il prezzo,
 * • e la quantit`a disponibile in magazzino.
 * Un prodotto pu`o essere creato indicandone facoltativamente la quantit`a iniziale. Se non `e indicata tale
 * quantit`a iniziale il prodotto `e creato con quantit`a pari a zero.
 * La classe Prodotto deve fornire due metodi:
 * • rifornisci che incrementa la quantit`a di prodotto disponibile di valore ricevuto come parametro;
 * • vendi che, se il prodotto `e disponibile, rappresenta la vendita di una unit`a. In caso la vendita vada
 * a buon fine, il metodo vendi dovr`a stampare un messaggio che contiene descrizione e prezzo del
 * prodotto, e restituire true al chiamante. In caso contrario il metodo vendi non stamper`a nessun
 * messaggio e restiuir`a false.
 * Scrivere inoltre una classe ProdottoScontabile che rappresenta un caso particolare di Prodotto in
 * cui `e possibile vendere pi`u di una unit`a per volta.
 * • Superata una certa quantit`a di prodotti venduti contemporaneamente, verr`a praticato uno sconto
 * al prezzo totale di vendita.
 * • L’entit`a dello sconto e la quantit`a di prodotti oltre la quale si ottiene tale sconto `e decisa al momento
 * della creazione dell’oggetto della classe.
 * Implementare tale meccanismo di vendita in una nuova versione del metodo vendi che ricever`a la quantit`a
 * da vendere come parametro.
 * Le classi implementate dovranno essere raccolte in un package prodotti.
 * Scrivere inoltre una classe UsaProdotti che contiene un main che testa le varie funzionalit`a delle classi
 * implementate. La classe UsaProdotti deve appartenere al package di default.
 */
public class Prodotto {
    private String descrizione;
    private Double prezzo;
    private Integer quantitaDisponibile;

    public Prodotto(String descrizione, Double prezzo, Integer quantitaDisponibile) {
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantitaDisponibile = quantitaDisponibile;
    }

    public Prodotto(Double prezzo, String descrizione) {
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.quantitaDisponibile = 0;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public Integer getQuantitaDisponibile() {
        return quantitaDisponibile;
    }

    public void setQuantitaDisponibile(Integer quantitaDisponibile) {
        this.quantitaDisponibile = quantitaDisponibile;
    }
    public void rifornisci(Integer quantita){
        quantitaDisponibile += quantita;
        System.out.println("aggiunti " + quantita + " ora disponibili sono : " + quantitaDisponibile);
    }
    public boolean vendi(){
        if(quantitaDisponibile>0){
            quantitaDisponibile--;
            System.out.println("Venduto un " + descrizione + " al prezzo di euro : " + prezzo + " cadauno");
            return true;
        }else {
            return false;
        }
    }
}
