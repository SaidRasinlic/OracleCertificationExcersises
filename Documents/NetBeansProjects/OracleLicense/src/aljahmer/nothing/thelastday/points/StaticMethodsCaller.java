package aljahmer.nothing.thelastday.points;

public class StaticMethodsCaller {

    public static int getSwitch(String str) {
        return Integer.parseInt(str.substring(1, str.length() - 1));
    }

    public static void main(String args[]) {
        /*System.out.println("hello world".compareTo("Hello world") < 0);
        switch (getSwitch(args[0])) {
            case 0:
                System.out.println("Hello");
            case 1:
                System.out.println("World");
                break;
            default:
                System.out.println("Good Bye");
        }*/
        double x = 1.5;
        System.out.println(Math.round(x));
        int y = -5;
        System.out.println(++y);
    }
}

class Testy {

    static Testy testy;
    static int si = 10;
    int ew = 33;
    static int xx = 33;

    public static void main(String args[]) {
        // new StaticMethodsCaller();
        new Testy().lol();
    }

    public Testy() {
        //System.out.println(this);
    }

    static void m1() {
        System.out.println("static m1");
    }

    void m2(Testy this) {
        System.out.println("m2 non-static");
        Testy.m1();
        Testy.si = 23;
        Testy.this.m6();
        Testy.this.m7();
        Testy.this.m3();
        new Testy().m7();
        new Testy().m4();
    }

    void lol() {
        System.out.println(Testy.this);
    }

    static void m3() {
        System.out.println("m3 static");
    }

    void m4() {
        System.out.println("non-static m4");
    }

    static void m6() {
        m1();
        m3();
        new Testy().m2();
        new Testy().m4();
        new Testy().m3();
        new Testy().m1();
        Testy.m6();
        testy.m3();
        Testy.m6();
        Testy.m1();
    }

    void m7(Testy this) {
        Testy.this.m4();
        new Testy().m4();
    }
}

class JBTThisAsParameter {

    public static void main(String[] args) {
        JBT1 obj = new JBT1();
        obj.i = 10;
        obj.method();
    }
}

class JBT1 extends JBTThisAsParameter {

    int i;

    void method() {
        method1(this);
    }

    void method1(JBT1 t) {
        System.out.println(t.i);
    }
}
