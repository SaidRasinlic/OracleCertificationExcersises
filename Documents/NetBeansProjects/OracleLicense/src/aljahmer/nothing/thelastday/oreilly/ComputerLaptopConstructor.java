package aljahmer.nothing.thelastday.oreilly;

public class ComputerLaptopConstructor {

    protected ComputerLaptopConstructor() {
    }

    protected int omg;

    public static void main(String[] args) {

        Computer comp = new Laptop();

        comp.commonMethod();
        comp.computerMethod();
        ((Computer) comp).commonMethod();
        Mobile mobile = new Mobile();
        comp = (Computer) mobile;
        comp.commonMethod();

    }
}

class Computer {

    Computer() {
        this(0);
        System.out.print("[one]");
    }

    Computer(int v) {
        super();
        System.out.print("[two]");
    }

    public void computerMethod() {
        System.out.println("Compy comp method!");
    }

    public void commonMethod() {
        System.out.println("I am common from Computer!");
    }
}

class Laptop extends Computer {

    public Laptop() {
    }

    public void laptopMethod() {
        System.out.println("Lapy laptop method!");
    }

    @Override
    public void commonMethod() {
        System.out.println("I am common from Laptop!");
    }
}

class Mobile extends Laptop {

    public Mobile() {
    }

    public void mobileMethod() {
        System.out.println("Moby mobile method!");
    }

    @Override
    public void commonMethod() {
        System.out.println("I am common from Mobile!");
    }
}

class Said {

    int year = 21;
    String name = "Said";

    protected Said() {
    }
}

class SubSaid extends Said {

    public static void main(String[] args) {
        Said said = new Said();
    }
}
