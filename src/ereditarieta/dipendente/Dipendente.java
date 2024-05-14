package ereditarieta.dipendente;

public class Dipendente extends Persona{
    private Integer annoAssunzione;
    private Double salario;

    public Dipendente(String nome, String indirizzo, Integer annoAssunzione, Double salario) {
        super(nome, indirizzo);
        this.annoAssunzione = annoAssunzione;
        this.salario = salario;
    }

    public Integer getAnnoAssunzione() {
        return annoAssunzione;
    }

    public void setAnnoAssunzione(Integer annoAssunzione) {
        this.annoAssunzione = annoAssunzione;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void visualizza() {
        super.visualizza();
        System.out.println(" Anno Assunzione : " + annoAssunzione);
        System.out.println(" Salario : " + salario);
    }
    public boolean guadagnaDiPiu(Dipendente dipendente){
        if(salario> dipendente.salario){
            return true;
        }else {
            return false;
        }

    }
}
