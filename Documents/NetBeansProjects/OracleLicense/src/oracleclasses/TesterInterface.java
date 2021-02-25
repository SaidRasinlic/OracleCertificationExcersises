package oracleclasses;

interface TesterInterface {

    public static final int Z = 3; // implicitno

    public void xD();

    default void compute() {
        System.out.println("Default method bro base shit");
    }

    static void haha() {
        System.out.println("HAHAHA STATIC METHOD");
    }

    public abstract void hehe();  //defaultna vrijednost public abstract

    public void print();

    public static void prt() {
        System.out.println("heheh");
    }

    public static void main(String[] args) {
        System.out.println("I am a static main method inside Inteface !!");

        int i = 0;

        boolean bool1 = true;

        boolean bool2 = false;

        boolean bool = false;

        boolean bool3 = true;

        boolean xx = (bool3 && method1("5"));

        bool = (bool2 & method1("1"));  //1
        bool = (bool2 && method1("2"));  //2
        bool = (bool1 | method1("3"));  //3
        bool = (bool1 || method1("4")); //4 

        boolean b = false | true;
        boolean b2 = false || true;

        System.out.println(xx);

    }

    public static boolean method1(String str) {
        System.out.println(str);
        return true;
    }
}

class Xo implements TesterInterface {

    @Override
    public void xD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hehe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void compute() {
        System.out.println("overriden");
    }

    public static void main(String[] args) {

        Xo x = new Xo();

        if (true) {
            if (false) {
                System.out.println("True False");
            } else {
                System.out.println("True True");
            }
        }

    }
}
