package aljahmer;

import aljahmer.nothing.Kevlar;

public class ZeroGravity extends Kevlar {

    public ZeroGravity(String surname) {
        super(surname);
    }

    public static void main(String[] args) {

        System.out.println("Argument count: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }

        int x = 1;

        switch (x) {
            case 'a':
                System.out.println("wtffff it workss switch case broski ahahah");
            default:
                System.out.println("DEFAULT ---------------->1");
        }

        byte b = (byte) x;

        int e = 22;
        int b2 = 19;

        System.out.println(e & b2);

        ZeroGravity kevlar = new ZeroGravity("Rašinlić");

        kevlar.yolo();

        System.out.println(kevlar.salary);

        System.out.println("Short values: ");
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println("------------------");

        System.out.println("Character values: ");
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

    }

}
