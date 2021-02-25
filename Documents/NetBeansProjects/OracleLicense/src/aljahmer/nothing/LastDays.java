package aljahmer.nothing;

public class LastDays implements TheInterface, TheInterfaceII {

    @Override
    public void m1() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void m2() {
        TheInterface.super.m2(); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {

    }
}

interface TheInterface {

    public abstract void m1();

    default void m2() {
    }

    static void m3() {
    }
}

interface TheInterfaceII {

    public abstract void m1();

    default void m3() {
    }

    default void m2() {
    }
}