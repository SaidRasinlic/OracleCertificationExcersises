package aljahmer.nothing;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class StaticTest {

    static int x;

    public StaticTest(int x) {
        this.x = x;
        System.out.println(this);
    }

    @Override
    public String toString() {

        return "TestClass.si = " + this.x;
    }

    void m1() {
        StaticTest.m2();  // 1
        m4();             // 2
        // non static method cannot be referenced from static context StaticTest.m3();  // 3
        StaticTest.this.m3();

        this.m4();
    }

    static void m2() {
        StaticTest.m4();
    }  // 4

    void m3() {
        m1();            // 5
        m2();            // 6
        // error --> -||-  StaticTest.m1(); // 7
        this.m4();
    }

    static void m4() {
    }

    static void throwIt() {
        throw new NullPointerException();
    }

    public static void main(String[] args) {

        int[] objArr = new int[]{}; // is valid.

        System.out.println(objArr.length);

        {
            System.out.println("SMDD");
        }
        //      Object [] enz = new int[]{1,2,3};
        new StaticTest(5);

        ArrayList<Double> al = new ArrayList<>();
        al.indexOf(2.0);
        System.out.println(al.size());
        LocalDate ldBro = LocalDate.of(2000, 01, 14);

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldBro);
        System.out.println(ldt);

        StringBuilder sb = new StringBuilder();

        int x = 24242;
        long l = x;
        float f = x;
        float ff = 242.3f;
        double d = x;
        double dd = ff;

        String s = "Said";

        Object obj1 = new Object();
        Object obj2 = obj1;

        System.out.println(obj1 == obj2);
        if (obj1.equals(obj2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static int printSum(double a, double b) {
        System.out.println("In double " + (a + b));
        return 2;
    }

    public static void printSum(float a, float b) {
        System.out.println("In float " + (a + b));
    }

    public static void printSum(double a, int b) {
        System.out.println("In double " + (a + b));
    }
}

class TestClass {

    public static void main(String args[]) {
        B c = new C();
        System.out.println(c.max(10, 20));
    }
}

class A {

    int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}

class B extends A {

    int max(int x, int y) {
        return 2 * super.max(x, y);
    }
}

class C extends B {

    int max(int x, int y) {
        return super.max(2 * x, 2 * y);
    }
}

interface Account {

    public default String getId() {
        return "0000";
    }
}

interface PremiumAccount extends Account {

    public String getId();
}

class BankAccount implements PremiumAccount {

    int x;
    // 18,17 pitanje 30,32,34,36,37,40,43,44,46,49,50,52,53,54,55,63,67

    public static void main(String[] args) {

        int[][] ab = {{1, 2, 3}, {4, 5}};
        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < ab[i].length; j++) {
                System.out.print(ab[i][j] + " ");
                if (ab[i][j] == 2) {
                    break;
                }
            }
            continue;
        }

        StringBuilder sb = new StringBuilder();
        int num = new Random().nextInt();
        System.out.println(num);

        List al = new ArrayList(); //1
        al.add(111); //2
        al.add(222);
        al.add(333);
        al.add(444);
        al.add(555);
        al.add(32.2);
        al.add("Said");
        al.add(3, "224242222222");
        System.out.println(al);
        System.out.println(al + " AHHAHAAHHA");

        System.out.println("----------------");
        System.out.println(al.get(0));
        System.out.println(al.get(al.size() - 1));
        //3
        System.out.println(al);

        ArrayList<String> strArr = new ArrayList<>();

        Collections.shuffle(al);
        System.out.println(al);

        String s = "asa";

        int[][] a = new int[2][];
        // error NullPointerException a[0][0] = 3;
        Account acct = new BankAccount();
        System.out.println(acct.getId());

        int n, n1, n2 = 100;
        System.out.println(n2);

        int a2[] = {1, 2}, b[], c[][];

        ArrayList listOfStrings;

        int gimmeInt = Integer.parseInt("15");

        System.out.println(gimmeInt);
        String numStr = "012345";

        System.out.println(Integer.parseInt("32", 16));

    }

    @Override
    public String getId() {
        return super.toString();
    }
}

interface Hoho {
    void hello();
}

interface Hoho2 extends Hoho {
    @Override
    public void hello();
}

class Car {

    static final private double XX = 343;

    final static private double X = 434;

    private static final double Y = 3;

    public Car() {
    }

    public Car(int insert) {

    }

    public Car(int a, int b, int c) {

    }
}

class SportsCar extends Car {

    public SportsCar() {
        this(8);
    }

    public SportsCar(int a) {
        super();

    }

    public SportsCar(int n, int n1, int n2) {
        n = 33;
        n2 = 33;
        n2 = 33;
    }
}

class Test {

    public static void main(String args[]) {
        int k = 9, s = 5;
        switch (k) {
            default:
                if (k == 10) {
                    s = s * 2;
                } else {
                    s = s + 4;
                    break;
                }
            case 7:
                s = s + 3;
        }
        System.out.println(s);
    }
}
