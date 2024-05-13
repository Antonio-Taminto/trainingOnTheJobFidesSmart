package oop.insiemedistring;

public class TestInsiemeDiStringhe {
    public static void main(String[] args) {
        String[] stringArray = {"gatto","cane","topo","elefante"};
        InsiemeDiStringhe insiemeDiStringhe  = new InsiemeDiStringhe(stringArray);
        System.out.println(insiemeDiStringhe.spaziStringa());
        System.out.println(insiemeDiStringhe.stringaLunga());
        System.out.println(insiemeDiStringhe.preStringa());
    }
}
