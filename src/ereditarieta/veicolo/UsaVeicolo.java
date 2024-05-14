package ereditarieta.veicolo;

public class UsaVeicolo {
    public static void main(String[] args) {
        Veicolo veicolo1 = new Vettura(false,"BMW","m3","AB123CD","utilitaria");
        Veicolo veicolo2 = new Vettura(false,"audi","a3","AB456CD","utilitaria");
        Veicolo veicolo3 = new Motociclo(false,"KTM","790","AB12345",799);
        Veicolo veicolo4 = new Motociclo(false,"KTM","890","AB67890",899);

        Veicolo[] veicoloArray = {veicolo1,veicolo2,veicolo3,veicolo4};

        for (Veicolo veicolo : veicoloArray) {
            if(veicolo.getMarca().equals("KTM"))
                veicolo.setGuasto(true);
        }
        for (Veicolo veicolo : veicoloArray) {
            if (veicolo.isGuasto()){
                System.out.println(veicolo);
            }
        }

    }
}
