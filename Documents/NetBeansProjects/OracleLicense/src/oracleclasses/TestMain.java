package oracleclasses;

import testwo.*;
import static testwo.Fragment.*;

public class TestMain {

    private String stri = "sssTRING";
    private Object o;

    void doSomething(Object s) {
        o = s;
        System.out.println(o.hashCode());
    }
    static int counter = 0;

    static {
        System.out.println("POZVAN");
        counter++;
    }

    transient int zz = 242; // VARIJABLE su transient volatile a METODE native abstract 
    static volatile int z = 324;

    // native void print ();
    //  abstract void print2();
    public static void main(String[] args) {
        /*  try {
            boolean bool = false;
            System.out.println(bool);
            System.out.println("test");

            Exception e = null;
            throw e;
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("SAIDIDIDIDID");
        } */

 /*   Object obj = new Object(); // 1
        TestMain tc = new TestMain(); //2
        tc.doSomething(obj); //3
        obj = new Object();    //4
        obj = null;    //5
        tc.doSomething(obj); //6 
        System.out.println(tc.sum(32, 2_147_483_648L)); */
        String s = "       M      an    ch     ester U     ni ted        ";

        System.out.println(s.length() + " = POCETNI LENGTH");
        String sub = (String) s.subSequence(5, 9);

        System.out.println(sub + " = REZULTAT SUBA");
        System.out.println(sub.length() + " = LENGTH");

        String withoutWhitespace = s.replaceAll("\\s+", "");
        String withoutWhitespace2 = s.replaceAll("\\s", "");

        System.out.println(withoutWhitespace);

        Fragment fragment = new Fragment();

        int x = fragment.FRAG;
        fragment.apply(testNum);

        StringBuilder sb = new StringBuilder("Rašinlić");
        System.out.println(sb.length());

        sb.setLength(7);
        sb.setLength(3);
        sb.setLength(10);
        System.out.println(sb);

        System.out.println(String.format("%.20f", 1.35f - 0.00026f));

    }

    public static void stringTest(String s) {
        s.replace('h', 's');

    }

    public int setVar(int a, float b, int c) {
        return this.setVar(a, b, c);
    }

    public float setVar2(double a, int b, float c) {
        return (c * b);
    }

    public long sum(long i1, int i2) {
        return i1 + i2;
    }

    public int sum(int i1, long i2) {
        return (int) i2;
    }

    public int sum(long i1, long i2) {
        return (int) i1;
    }

}
