package oop.orario;

public class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time();

        time1.setTime(23,9,10);
        time2.setTime(22,10,15);
        System.out.println(time1);
        time1.addTime(time2);
        System.out.println(time1);
        time1.subtractTime(time2);
        System.out.println(time1);
    }
}
