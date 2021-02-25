package easytest.aaa;

import easytest.Easy;

public class EasyMerge {

    public final int AGE = 2;

    public void m1(final int n) {
        System.out.print(n);
    }

    public static void main(String[] args) {

        EasyMerge merge = new EasyMerge();
        Easy ez = new Easy() {};
    }
}

class Finale extends EasyMerge {

    int AGE = 22;

    public static void main(String[] args) {
        Finale finale = new Finale();
        System.out.println(finale.AGE);
        finale.m1(20);
    }
}
