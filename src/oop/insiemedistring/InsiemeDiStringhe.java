package oop.insiemedistring;

/**
 * Scrivere una classe InsiemeDiStringhe che consente di rappresentare un qualunque insieme finito di stringhe. La classe InsiemeDiStringhe ha il seguente scheletro:
 * 1]class InsiemeDiStringhe {..} variabile che rappresenta l'insieme di stringhe considerato dall'oggetto.
 * 2] InsiemeDiStringhe(..) costruttore che permette di creare un oggetto che rappresenta l'insieme di stringhe contenute in un array T.
 * 3] public String stringaLunga() restituisce la stringa di lunghezza massima, se vi sono più stringhe di lunghezza max ne restituisce una arbitrariamente.
 * 4] public String spaziStringa() restituisce la stringa contenente più spazi
 * 5] public String preStringa() visualizza tutte le stringhe che hanno il prefisso specificato .
 */
public class InsiemeDiStringhe {
    private String[] stringArray;

    public InsiemeDiStringhe(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }
    public String stringaLunga(){
        String stringaLunga = "";
        for (String string : stringArray) {
            if(stringaLunga.length()<string.length()){
                stringaLunga = string;
            }
        }
        return stringaLunga;
    }
    public String spaziStringa(){
        int counterStringaSpazi=0;
        int posizioneString=0;
        for (int i = 0; i < stringArray.length; i++) {
            int counter = 0;
            for (int j = 0; j < stringArray[i].length(); j++) {
                if (stringArray[i].charAt(j)==' '){
                    counter++;
                }
            }
            if(counterStringaSpazi<counter){
                counterStringaSpazi = counter;
                posizioneString = i;
            }
        }
        if(counterStringaSpazi==0){
            return "ERRORE!nessuno spazio prensente";
        }else {
            return stringArray[posizioneString];
        }
    }
    public String preStringa(){
        return "non eseguito";
    }
}
