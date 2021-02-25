package aljahmer.nothing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Kevlar {

    public String car = "Mercedes Benz";
     int age = 21;
    public String name = "Said";
    private final String SURNAME;
    protected double salary = 5000;

    public void yolo() {
        System.out.println("PRINT THIS FROM KEVLAR");
     
    }

    public Kevlar(String surname) {
        this.SURNAME = surname;
        System.out.println("YO FROM THE BASE");
    }
}

class Constructor extends Kevlar {

    public Constructor(String surname) {
        super(surname);
    }
}

class Executor {

    public static void main(String[] args) {

        Constructor cons = new Constructor("Rašinlić");
        System.out.println(cons.age);

        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(" I ------------------------");

        /*   b1.append(b2.substring(2, 5).toUpperCase());
        System.out.println(b1);
        System.out.println(b2); */
        System.out.println(" II ------------------------");

        /*   b2.insert(3, b1.append("a"));
        System.out.println(b1);
        System.out.println(b2);
         */
        System.out.println(" III ------------------------");

        b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
        System.out.println(b1);
        System.out.println(b2);

        String a = Integer.toBinaryString(Integer.MIN_VALUE);
        String b = Integer.toBinaryString(Integer.MAX_VALUE);
        System.out.println(a);
        System.out.println(b);

        int x = -0b1111111111111111111111111111111;
        System.out.println(x);

        int big = 1234567890;
        float approx = big;
        System.out.println(big - (int) approx);

        System.out.println(big + " " + approx);
    
        LocalDate ld = LocalDate.from(DateTimeFormatter.ISO_LOCAL_DATE.parse("2020-10-30"));
    
        System.out.println(ld);
        
    }
    
    
}

