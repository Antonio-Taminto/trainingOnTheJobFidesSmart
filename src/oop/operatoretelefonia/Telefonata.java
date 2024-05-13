package oop.operatoretelefonia;
/**
 * Scrivere applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore di telefonia cellulare.
 * Si devono quindi rappresentare i dati relativi ad una carta SIM ed in particolare:
 * - il numero di telefono
 * - il credito disponibile in euro
 * - la lista delle telefonate effettuate
 * - le telefonate dovranno essere riferite ad una classe Telefonata a parte
 * Per ciascuna telefonata deve essere rappresentata la durata in minuti e il numero verso cui è effettuata
 * La classe SIM dovrà fornire le seguenti funzionalità:
 * - un costruttore parametrizzato che crea una SIM con numero di telefono, un credito e la lista delle telefonate vuota
 * - un metodo per l'inserimento di una telefonata con i dati forniti dall'utente.
 * - una funzione per il calcolo dei minuti totali di conversazione.
 * - una funzione per il calcolo delle telefonate effettuate verso un certo numero
 * - una procedura per la stampa dei dati della SIM e l'elenco delle telefonate.
 */
public class Telefonata {
    private Integer durataInMinuti;
    private Long numeroChiamato;

    public Telefonata(Integer durataInMinuti, Long numeroChiamato) {
        this.durataInMinuti = durataInMinuti;
        this.numeroChiamato = numeroChiamato;
    }

    public Integer getDurataInMinuti() {
        return durataInMinuti;
    }

    public void setDurataInMinuti(Integer durataInMinuti) {
        this.durataInMinuti = durataInMinuti;
    }

    public Long getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setNumeroChiamato(Long numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }
}
