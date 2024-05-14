package ereditarieta.veicolo;

public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private boolean isGuasto;

    public Veicolo(boolean isGuasto, String marca, String modello, String targa) {
        this.isGuasto = isGuasto;
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
    }

    public boolean isGuasto() {
        return isGuasto;
    }

    public void setGuasto(boolean guasto) {
        isGuasto = guasto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "isGuasto=" + isGuasto +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
