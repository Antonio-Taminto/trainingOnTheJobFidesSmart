package oop.operatoretelefonia;

public class TestOperatoreSim {
    public static void main(String[] args) {
        SIM sim = new SIM(0.0,3317516201L);
        sim.addTelefonata(10,3337308129L);
        sim.addTelefonata(15,3337308129L);
        sim.chiamateVersoUnNumero(3337308129L);
        sim.minutiTotaliChiamata();
        sim.stampaDettagliSIM();


    }
}
