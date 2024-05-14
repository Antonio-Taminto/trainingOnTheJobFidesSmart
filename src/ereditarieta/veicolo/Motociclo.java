package ereditarieta.veicolo;

public class Motociclo extends Veicolo{
    private Integer cilindrata;

    public Motociclo(boolean isGuasto, String marca, String modello, String targa, Integer cilindrata) {
        super(isGuasto, marca, modello, targa);
        this.cilindrata = cilindrata;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "Motociclo{" +
                "isGuasto=" + isGuasto() +
                ", targa='" + getTarga() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modello='" + getModello() + '\'' +
                "cilindrata=" + cilindrata +
                '}';
    }
}
