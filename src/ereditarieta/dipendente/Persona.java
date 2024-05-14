package ereditarieta.dipendente;

public class Persona {
    private String nome; // nome e cognome
    private String indirizzo; // indirizzo

    // costruttore
    public Persona(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    // visualizza i dati della persona
    public void visualizza() {
        System.out.println(" Nome : " + nome);
        System.out.println(" Indirizzo : " + indirizzo);
    }
}