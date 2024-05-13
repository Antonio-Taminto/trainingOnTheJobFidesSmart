package ereditarieta.prodotti;

public class UsaProdotto {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto(10.0,"un prodotto carino");
        ProdottoScontabile prodottoScontabile = new ProdottoScontabile(10.0,"un altro prodotto carino",10,20);
        prodotto.rifornisci(10);
        prodottoScontabile.rifornisci(15);
        prodotto.vendi();
        prodottoScontabile.vendi();
        prodottoScontabile.vendi(10);
    }
}
