package aljahmer.nothing;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class SeventhGate {

    public static void main(String[] args) {

        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);
        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1));
        System.out.println(date);
        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
        System.out.println("----------------------------");
        LocalDateTime ldtNow = LocalDateTime.of(2020, Month.NOVEMBER, 30, 10, 0);
        ZonedDateTime zdtNow = ZonedDateTime.of(ldtNow, ZoneId.of(ZoneId.systemDefault().toString()));
        zdtNow = zdtNow.plus(Duration.ofDays(1));
        System.out.println(zdtNow);
        Some s = (a, b)
                -> System.out.println(a * b);

        s.function(10, 10);
        System.out.println(new Type("typing..").toString());

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");  //1
        }
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");  //2
        }
        int i = 20;                  //3
        System.out.print(i + " ");   //4

        int String = 4;
        String name = "2";
        System.out.println(String + " WOOHO");
        int _ = 2;
        System.out.println(_);
        double taxRate = 0;

        taxRate = -2 > 0 ? taxRate : 33;

        System.out.println(taxRate);

        char c = 'a';
        char c2 = 'A';

        System.out.println((int) c + " <-small letter\nbig letter-> " + (int) c2);
        Float f = 0.0f;
        char ch = 'a';

        byte byt = (byte) ch;

        byte byt2 = -128;

        char ch32 = (char) byt2;

        System.out.println(ch32);

        System.out.println(byt);

        ++ch;
        System.out.println(Character.toString(ch));

        try {

            int t = 3;

        } catch (Exception ex) {

        }
    }
}

// 16,17, mada sve bi bilo ok da pregledas 22,23,29,30,31,37,39,40,41,47,49
@FunctionalInterface
interface Some {

    public abstract void function(int a, int b);
}

class Type {

    static String s;
    public Type() {

    }

    public static void main(String[] args) {
        System.out.println(s);

        List<String> s1 = new ArrayList<String>();
        String s = null;
        s1.add("a");
        s1.add(s); //
        s1.add("b");
        s1.remove(s); //2
        System.out.println(s1); //3 

        int rate = 10;
        double amount = 1 - rate / 100 * 1 - rate / 100;
        System.out.println(1 + 5 < 3 + 7);
        System.out.println((2 + 2) >= 2 + 3);

        int i = 0, j = 0;
        X1:
        for (i = 0; i < 3; i++) {
            X2:
            for (j = 3; j > 0; j--) {
                if (i < j) {
                    continue X1;
                } else {
                    break X2;
                }
            }
        }
        System.out.println(i + " " + j);

        int[][][] array3D = {{{0, 1}}, {{2, 3}}, {{4, 5}}};

    }

    public Type(String s) {
        this.s = s;

    }

    @Override
    public String toString() {
        return this.s;
    }

    static int yo = 4;

    void omgXD() {

        int x = 33;
        this.yo = 3;
    }
}

interface H2 {

    default void yo() {
    }
}

interface H1 {

    default void yo() {
    }
}

class Wtf implements H2, H1 {

    @Override
    public void yo() {
        H1.super.yo();
    }

    public void stringProcessor(String... strs) {
    }

    class XD implements H1, H2 {

        @Override
        public void yo() {
            H1.super.yo();
        }
    }
}