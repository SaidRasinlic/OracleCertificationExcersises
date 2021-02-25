package aljahmer.nothing.thelastday;

public class InstanceOff {

}

interface Flyer {
}

class Bird implements Flyer {
}

class Eagle extends Bird {
}

class Bat {
}

class TestClass {

    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new SubBat();

        if (f instanceof Flyer) {
            System.out.println("f is a Flyer");
        }
        if (e instanceof Bird) {
            System.out.println("e is a Bird");
        }
        if (b instanceof Flyer) {
            System.out.println("b is a Bird");
        }

        A o = new A();

        if (!((o instanceof A) || (o instanceof B))) {

        }

        int x = "HELlo world".compareTo("HEllo world");

        System.out.println(x);
        int hex = 0xCAFE_BABE;
        
      

        System.out.println(hex);
    }
}

class A {
}

class B extends A {
}

class C extends B {
}

class SubBat extends Bat implements Flyer {

}
