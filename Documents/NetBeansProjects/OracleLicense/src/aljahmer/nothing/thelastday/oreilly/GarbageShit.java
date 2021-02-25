package aljahmer.nothing.thelastday.oreilly;

import java.time.LocalDate;

public class GarbageShit {

    static int st = 22;

    int nonst = 35462;

    class Inner {

        final static int k = 3;
        int fe;
    }

    static class StInner {

        static int xd;
        int rg;

    }

    void run() {
        class Local {

            static final int EF = 3;
            int et;
        }
    }

    public static void main(String[] args) {

        GarbageShit.Inner shet = new GarbageShit().new Inner();
        System.out.println(Inner.k);

        GarbageA a = new GarbageA("A");

        LocalDate date = LocalDate.of(2015, 1, 1);
        date.withYear(5);
        System.out.println(date.plusMonths(12));
    }
}

class GarbageA {

    String name;

    public GarbageA(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + "Successfully garbage-collected");
    }
}

class GarbageB {

    String name;

    public GarbageB(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + "Successfully garbage-collected");
    }
}
