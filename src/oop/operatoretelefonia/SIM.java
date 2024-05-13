package oop.operatoretelefonia;

import java.util.ArrayList;
import java.util.List;

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
public class SIM {
    private Long numeroDiTelefono;
    private Double credito;
    private List<Telefonata> telefonataArray;

    public SIM(Double credito, Long numeroDiTelefono) {
        this.credito = credito;
        this.numeroDiTelefono = numeroDiTelefono;
        this.telefonataArray = new ArrayList<>();
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public Long getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public void setNumeroDiTelefono(Long numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public List<Telefonata> getTelefonataArray() {
        return telefonataArray;
    }

    public void setTelefonataArray(List<Telefonata> telefonataArray) {
        this.telefonataArray = telefonataArray;
    }
    public void addTelefonata(Integer durataInMinuti, Long numeroChiamato){
        Telefonata telefonataToAdd = new Telefonata(durataInMinuti,numeroChiamato);
        telefonataArray.add(telefonataToAdd);
    }
    public void minutiTotaliChiamata(){
        int minutiTotali = 0;
        for (Telefonata telefonata : telefonataArray) {
            minutiTotali += telefonata.getDurataInMinuti();
        }
        System.out.println("Minuti totali: " + minutiTotali );
    }
    public void chiamateVersoUnNumero(Long numeroDiTelefono){
        int counterChiamate = 0;
        for (Telefonata telefonata : telefonataArray) {
            if(telefonata.getNumeroChiamato().equals(numeroDiTelefono)){
                counterChiamate++;
            }
        }
        System.out.println("Le chiamate effettuate verso il numero " + numeroDiTelefono +
                    " sono state :" +counterChiamate);
    }
    public void stampaDettagliSIM(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Numero di Telefono: ");
        stringBuilder.append(numeroDiTelefono);
        stringBuilder.append(" con credito : ");
        stringBuilder.append(credito);
        stringBuilder.append("\nLista Chiamate:\n");
        for (Telefonata telefonata : telefonataArray) {
            stringBuilder.append("Numero chiamato: ");
            stringBuilder.append(telefonata.getNumeroChiamato());
            stringBuilder.append(" dalla durata di ");
            stringBuilder.append(telefonata.getDurataInMinuti());
            stringBuilder.append(" minuti\n");
        }
        System.out.print(stringBuilder);
    }
}
