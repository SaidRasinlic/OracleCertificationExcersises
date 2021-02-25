package aljahmer.nothing.thelastday;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employee {

    public static void staticMethod() {
        System.out.println("Static method from \"aljahmer.nothing.thelastday\" ");
    }

    public void fromEmploye() {
        System.out.println("from Employee");
    }
    public static final int AGE = 99999;   //1

    public String name = "Tripaloski";
}

class BullClass {

    public static boolean validateEmployee(Employee e, Predicate<Employee> p) {
        return p.test(e);
    }

    public static void main(String[] args) {
        Employee e = new Employee(); //2     
        System.out.println(validateEmployee(e, ex -> e.AGE < 10000)); //3

        List ar = new ArrayList(0);

        ar.add(1);
        ar.add("Said");

        System.out.println(ar);

        int _2 = 2;

        LocalDateTime time = LocalDateTime.of(2015, 10, 1, 10, 10);
        System.out.println(time);

        char c = 'h';

        byte byt = (byte) c;

        int en = c;
        System.out.println((int) c + " HAHAHAH" + byt);

    }
}

interface House {

    void implementIt();

    public default String getAddress() {
        return "101 Main Str";
    }
}

abstract interface Bungalow extends House {

    @Override
    public default String getAddress() {
        return "101 Smart Str";
    }
}

class MyHouse implements Bungalow, House {

    @Override
    public String getAddress() {
        return "This is My House bro!";//Bungalow.super.getAddress();
    }

    @Override
    public void implementIt() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class Testin {

    public static void main(String[] args) {
        House ci = new MyHouse();  //1  
        System.out.println(ci.getAddress()); //2 

    }
}

class Glavna {

    public void method() {
        System.out.println("Glavna klasa!");
    }
;

}

class PodKlasa extends Glavna {

    @Override
    public void method() {
        super.method();
    }

    public static void main(String[] args) {

        new PodKlasa().method();
    }

}
