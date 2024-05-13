package oop.orario;

/**
 * Scrivi una classe Time che contenga un orario valido. Deve essere possibile impostare un orario in ore,minuti,secondi;
 * la classe deve prevedere un metodo per la validazione di un orario, un metodo per aggiungere un orario ad un altro
 * e un metodo per sottrarre due orari.
 */
public class Time {
    private int ore,minuti,secondi;

    public Time() {
    }

    public Integer getMinuti() {
        return minuti;
    }

    public void setMinuti(Integer minuti) {
        this.minuti = minuti;
    }

    public Integer getOre() {
        return ore;
    }

    public void setOre(Integer ore) {
        this.ore = ore;
    }

    public Integer getSecondi() {
        return secondi;
    }

    public void setSecondi(Integer secondi) {
        this.secondi = secondi;
    }

    @Override
    public String toString() {
        return "Time:" +
                " Ore= " + ore +
                " Minuti= " + minuti +
                " Secondi= " + secondi;
    }

    private boolean isTimeCorrect(Integer ore, Integer minuti, Integer secondi){
        boolean oreValido = (ore<=23 && ore>=0);
        boolean minutiValido = (minuti<=59 && minuti>=0);
        boolean secondiValido = (secondi<=59 && secondi >=0);
        if(oreValido && minutiValido && secondiValido){
            return true;
        }else {
            return false;
        }
    }
    public void setTime(Integer ore,Integer minuti,Integer secondi){
        if (isTimeCorrect(ore,minuti,secondi)){
            setOre(ore);
            setMinuti(minuti);
            setSecondi(secondi);
            System.out.println("Orario correttamente aggiunto");
        }else {
            System.out.println("Orario errato");
        }
    }
    public void addTime(Time timeToAdd){
        if(timeToAdd.isTimeCorrect(timeToAdd.getOre(), timeToAdd.getMinuti(),timeToAdd.getSecondi())&&
            isTimeCorrect(this.ore,this.minuti,this.secondi)) {
            int newSecondi = this.secondi + timeToAdd.secondi;
            int newMinuti = this.minuti + timeToAdd.minuti;
            int newOre = this.ore + timeToAdd.ore;
            if (newSecondi > 59) {
                newSecondi -= 60;
                newMinuti++;
            }
            if (newMinuti > 59) {
                newMinuti -= 60;
                newOre++;
            }
            if (newOre > 23) {
                newOre -= 24;
            }
            setTime(newOre, newMinuti, newSecondi);
            System.out.println("Orario aggiunto");
        }else {
            System.out.println("Orario non corretto");
        }
    }
    public void subtractTime(Time timeToSubtract){
        if(timeToSubtract.isTimeCorrect(timeToSubtract.ore, timeToSubtract.minuti,timeToSubtract.secondi)&&
                isTimeCorrect(this.ore,this.minuti,this.secondi)){
            int newSecondi = this.secondi - timeToSubtract.secondi;
            int newMinuti = this.minuti - timeToSubtract.minuti;
            int newOre = this.ore - timeToSubtract.ore;
            if(newSecondi<0){
                newMinuti--;
                newSecondi+=59;
            }
            if (newMinuti<0){
                newOre--;
                newMinuti+=59;
            }
            if (newOre<0){
                newOre = Math.abs(newOre);
            }
            setTime(newOre,newMinuti,newSecondi);
            System.out.println("Orario sottratto");
        }else {
            System.out.println("Orario non corretto");
        }
    }

}
