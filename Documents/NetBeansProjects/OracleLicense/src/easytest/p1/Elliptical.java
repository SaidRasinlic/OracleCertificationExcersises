package easytest.p1;

import java.util.ArrayList;

class Elliptical {

    public int radiusA, radiusB;
    public int sum = 100;

    final static int e = 3;
    static int c = 3;

    {

        sum = 24;
    }
    static int heh;

    public void setRadius(int r) {

        int coupon, offset, base;

        if (r > 99) {

            throw new IllegalArgumentException();

        }
        radiusA = r;
        radiusB = sum - radiusA;

    }

    public void getRadius() {
        System.out.println(radiusB);
    }

    ;
    
    public static void main(String[] args) {

        Integer in = new Integer(55);
        Long l = new Long(55);

        System.out.println(in.equals(l));
        int[][] table = new int[2][3];

        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {

                table[x][y] = x + y;
                System.out.println(table[x][y]);
            }

        }

        for (int[] n : table) {
            System.out.println(n[0]);
        }

        float f = 5.5f;
        double d = 1.5;

        System.out.println((int) (f + d));

        String s = "";

        System.out.println(s.isEmpty());

        int var = 20, i = 0;
        do {
            while (true) {
                if (i++ > var) {
                    break;
                }
            }
        } while (i < var--);
        System.out.println(var);

        System.out.println("calculating");

        Abs abs = new He();
        abs.calculate();

        Integer ix = new Integer(23);

        for (int rr = 0, j = 10; i < j; rr++, --j) {;

            System.out.println("a");
        }

        String someNum = "425";

        int value;
        value = Integer.parseInt(someNum);

        System.out.println(value + 1);
    }
}

/*
        System.out.println(b1 & b3);  // vraca true ako su oba true
        System.out.println(b4 | b3); // vraca true ako je jedan od dva operanda true
        System.out.println(b3 && b2); // vraca false ako je lijeva strana false
        System.out.println(b3 || b1); // vraca true ako je lijeva strana trued
 */
abstract class Abs {

    abstract void calculate();
}

class He extends Abs {

    @Override
    void calculate() {

    }

}


/*
    int i = 0, j = 5;
    lab1 : for( ; ; i++){
      for( ; ; --j)  if( i >j ) break lab1;
    }
    System.out.println(" i = "+i+", j = "+j);
  }
 */
class Doll {

    String name;

    Doll(String nm) {
        this.name = nm;
    }
}

class Barbie extends Doll {

    Barbie() {
        this("unknown");
    }

    Barbie(String nm) {
        super(nm);
    }

}

class TestClass {

    public static void main(String[] args) {
        Barbie b = new Barbie("mydoll");

        Doll b3 = new Doll("some");

        System.out.println(b3.name);

        Barbie b1 = new Barbie();

        System.out.println(b1.name);

        System.out.println(b.name);

    }
}

class ATest {

    String global = "111";

    public int parse(String arg) {
        int value = 0;
        try {
            String global = arg;
            value = Integer.parseInt(global);
        } catch (Exception e) {
            System.out.println(e.getClass());

        }
        System.out.print(global + " " + value + " ");
        return value + 999999999;  // zadnja se vraca buraz
    }

    public static void main(String[] args) {

        ATest ct = new ATest();
        System.out.print(ct.parse("333"));
        System.out.println();

        String str = "2";
        int i = 0;
        if ((str == null) || (i == str.length())) {

        }

        char cA[][] = {new char[]{'a', 'b', 'c'}, new char[]{'a', 'b', 'c'}, new char[]{'s'}};

        System.out.println(cA[2][0]);

        System.out.println("pokrenuo si ATEST");
        
        
        String myName = "Said";
        System.out.println(myName.substring(myName.indexOf("i", 1)));
    }
}

class A {

    int i;

    public A(int x) {
        this.i = x;
    }

    public static void printStatic() {
        System.out.println("Static method from A ");
    }

    public void printPublic() {
        System.out.println("Public method from A ");
    }

}

class B extends A {

    int j;

    public static void printStatic() {
        System.out.println("Static from B");
    }

    public B(int x, int y) {
        super(x);
        this.j = y;
    }

    B(int z) {
        this(z, z);
    }

    @Override
    public void printPublic() {
        System.out.println("Public from B");
    }
}

