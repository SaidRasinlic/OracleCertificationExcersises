package aljahmer;

public class Test {

    public static int[] getArray() {
        return new int[]{1, 222, 15, 4, 5};
    }

    public static void main(String[] args) {

        int index = 2;
        try {
            int x = getArray()[index = 2]++;

            System.out.println(x);

        } catch (Exception e) {
            e.printStackTrace();
        } // empty catch
        System.out.println("index = " + index);

    }
}

interface Pow {

    static void wow() {
        System.out.println("In Pow.wow");
    }
}

abstract class Wow {

    static void wow() {
        System.out.println("In Wow.wow");
    }
}

class Powwow extends Wow implements Pow {

    public static void main(String[] args) {
        Powwow f = new Powwow();
        f.wow();

        System.out.println(Boolean.TRUE.hashCode());
        System.out.println(Boolean.TRUE==Boolean.TRUE);
    }
}
