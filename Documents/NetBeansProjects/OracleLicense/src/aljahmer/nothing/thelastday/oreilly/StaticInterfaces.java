package aljahmer.nothing.thelastday.oreilly;

public class StaticInterfaces {

}

class Foo {

    static interface Interface {

        public static final int K = 3;

        static void m1() {
            System.out.println("staticna metoda");
        }

        default void m2() {
            System.out.println("default metoda");
        }

        abstract void m3();
    }
}

class SpinTheShit {

    public static void main(String[] args) {

        Foo.Interface foski = () -> {
            System.out.println("m3 broski");
        };
        foski.m3();
    }
}

class Lol {

    static void run() {
        class Xd {

            final static int wdw = 3;
        }
    }
}
