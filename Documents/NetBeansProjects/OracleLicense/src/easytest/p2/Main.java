package easytest.p2;

import easytest.p1.Movable;

public class Main {

    public static void main(String[] args) {

        Movable m = new Donkey();

        m.move(10);
        m.moveBack(20);

        System.out.println(m.location);

    }
}
