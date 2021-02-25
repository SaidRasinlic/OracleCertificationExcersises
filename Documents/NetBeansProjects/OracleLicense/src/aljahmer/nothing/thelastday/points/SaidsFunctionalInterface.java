package aljahmer.nothing.thelastday.points;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaidsFunctionalInterface {

    public static void main(String[] args) {

        DriverLicence.check((int a, int l) -> {
            return a >= l;
        }, 10);
        System.out.println("/////////////////");
        DriverLicence.check((x, y) -> x >= y, 10);
        DriverLicence.check((r, f) -> r > f, 20);

        DriverLicence dld = new DriverLicence();
        dld.check((gsf, asf) -> gsf > asf, 20);
        System.out.println("-----------------");
        Licence licence = (a, al) -> {
            return a > al;
        };
        System.out.println(licence.legalityCheck(12, 15));
        String[][][] arr = {{{"a", "b", "c"}, {"d", "e", null}}, {{"x"}, null}, {{"y"}}, {{"z", "p"}, {}}};
//      System.out.println(arr[3][1][0]); arrayindex outofbounds

        int[][][] arrNums3 = {{{14, 325, 363, 357}, {245, 23, 52, 35}, {235, 325, 2}, {234}}, {{34343, 34}, {}}, {}};
        int[][] arrNums2 = {{45, 46, 475, 85, 94}, {424, 46, 346, 344}, {43, 9999}};
        int[] arrNums1 = {325, 32, 23, 62};
        System.out.println(arrNums3[1][0][1]);
        System.out.println(arrNums2[2][1]);
    }
}

@FunctionalInterface
interface Licence {

    public boolean legalityCheck(int age, int ageLimit);
}

class DriverLicence {

    public static void check(Licence licence, int age) {
        if (licence.legalityCheck(age, 18)) {
            System.out.println("Legal as fuck!");
        } else {
            System.out.println("Not legal, please grow up boi!");
        }
    }

    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);
        System.out.println(LocalDateTime.parse("2020-12-20", DateTimeFormatter.ISO_DATE));
    }
}

class A {

    public A() throws IOException {

    }

    public String editString(String s) {
        return s += " *EDITED IN THE METHOD*";
    }

    public int i = 10;

    public void f() {
    }

    public void g() {
    }
}

class B extends A {

    public B() throws IOException {

    }

    public int i = 20;

    @Override
    public void g() {
    }
}

class C {

    static char ch = 32;  // 97
    static float f;
    static boolean bool;

    public static void main(String[] args) throws Exception {

        A a = new A();//1
        A b = new B();//2
        System.out.println(b.i);
        System.out.println(b.editString("Said"));
        System.out.print(f);
        System.out.print(" ");
        System.out.print(ch);
        System.out.print(" ");
        System.out.print(bool);
        System.out.println(" ");
        System.out.println((int) Character.MAX_VALUE + " " + (int) Character.MIN_VALUE);
    }
}

interface House {

    int x = 1;

    public default String getAddress() {
        return "101 Main Str";
    }

    public default void lol() {
    }
}

interface Camp {

    public default void getCamp() {
        System.out.println("Camp");
    }
}

interface Bungalow extends House {

    int x = 1;

    @Override
    public default String getAddress() {
        System.out.println(House.super.getAddress());
        return "101 Smart Str";
    }
}

class MyHouse implements House, Bungalow {

    String foo() {
        System.out.println(Bungalow.super.getAddress());
        return getAddress();
        // System.out.println(x);   //compile error: The field x is ambiguous
    }

    public static void main(String[] args) {
        MyHouse myHouse = new MyHouse();
        String myString = myHouse.foo();
        System.out.println(myString);
    }
}

class MyHouseII implements Bungalow, House, Camp {

    void print() {
        System.out.println(Bungalow.super.getAddress());
        Camp.super.getCamp();
    }

    public static void main(String[] args) {
        new MyHouseII().print();
    }
}

class Outer {

    class Inner {
    }
}

class ChildOfInner extends Outer.Inner {

    ChildOfInner() {
        (new Outer()).super();
    }
} // ----------------------------------------------------------------------> NAUCIIIIIII NAUCIIIII NAUCIIII NAUCIIII NAUCIIIII

class Square {

    private double side = 0;
    //  double area;

    public Square(double length) {
        this.side = length;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}

class Tr {

    public static void main(String[] args) throws Exception {
        Square sq = new Square(10.0);
        System.out.println(sq.getArea());
    }
}