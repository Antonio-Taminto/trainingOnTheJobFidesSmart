package ereditarieta.veicolo;

public class Vettura extends Veicolo{
    private String tipologia;

    public Vettura(boolean isGuasto, String marca, String modello, String targa, String tipologia) {
        super(isGuasto, marca, modello, targa);
        this.tipologia = tipologia;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    @Override
    public String toString() {
        return "Vettura{" +
                "isGuasto=" + isGuasto() +
                ", targa='" + getTarga() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modello='" + getModello() + '\'' +
                "tipologia='" + tipologia + '\'' +
                '}';
    }
}
