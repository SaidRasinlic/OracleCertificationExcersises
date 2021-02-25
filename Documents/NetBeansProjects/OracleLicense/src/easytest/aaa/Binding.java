package easytest.aaa;

import aljahmer.ItzSoClazzy;

public class Binding {

    static int years = 99;
   

    void hello() {
        System.out.println("Hello from fucking Java Biding Class");
    }

    public static void main(String[] args) {

        Binding b = new OverridenClazzz();

        OverridenClazzz o = new OverridenClazzz();

        System.out.println(o.years);

        b.hello();

        ((OverridenClazzz) b).smd();

        Integer i1 = 1;
        Integer i2 = new Integer(2);

        System.out.println(i1.equals(i2));

        System.out.println("Said".replace('i', 'i') == "Said");

        System.out.println("Said".replace("id", "id") == "Said");

        String s = "Said".replace("id", "id");

        System.out.println(s);
    }
}

class OverridenClazzz extends Binding {

    @Override
    void hello() {

        System.out.println("Broski im from Overriden class");
    }

    void smd() {
        System.out.println("smd man im that clazz");
    }
}
