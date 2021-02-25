package easytest.p1;

public class ArrayTest {

    static int[][] table = new int[2][3];

    public static void init() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
//insert code to initialize       

            }
        }
    }

    public static void multiply() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
//insert code to multiply     

            }
        }
    }

    public static void main(String[] args) {

        final int age = 22;
        StringBuilder sb = new StringBuilder();

        byte bit = age;
    }
}


/* 
table[x][y] = x+y; and table[x][y] = table[x][y]*2;
 */
class H {

    int age;

    static void staticBye() {
        System.out.println("GOOODBYEEE from H");
    }

    int h = 99;
    protected String fromH = "Hello from H";

    void play() {
        System.out.println("playing BASEE");
    }
}

class K extends H {

    int age;

    public void setAge(int age) {
        this.age = age;
    }

    static void staticBye() {
        System.out.println("GOODBYEEE FROM K (extends H)");
    }

    String fromK = "Hello from K";
    int k = 11;

    @Override
    void play() {
        System.out.println("sub class playing");
    }
}

class KHM {

    public static void main(String[] args) {

        H h = new K();
        h.play();
        h.play();
        System.out.println(h.fromH);
        System.out.println(h.h);
        h.play();
        h.staticBye();

        K k = (K) h;
        String ss = k.fromK;
        String s = k.fromH;
        k.play();
        k.staticBye();
        k.staticBye();

    }
}

/*
An invariant means a certain condition that constrains the state stored in the object.
 */
class Doll1 {

    String name;

    Doll1(String nm) {
        this.name = nm;
    }
}

class Barbie1 extends Doll1 {

    Barbie1() {
      this("");
    }

    Barbie1(String nm) {
        super(nm);
    }
}

class TestClass1 {
static int x = 22;
    public static void main(String[] args) {
        Barbie b = new Barbie("rejsulema");

        
        System.out.println(b.name);
        System.out.println(b.hashCode());

        Barbie b1 = new Barbie();
        
     x = (x=3) * 4;
        System.out.println(x);
     
    }
}
