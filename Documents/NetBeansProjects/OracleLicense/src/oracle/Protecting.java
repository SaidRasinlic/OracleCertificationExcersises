package oracle;

public class Protecting extends Exception {

    static final int INTERVAL = 10;
    char c;
    static int age = 23;

    public static void main(String[] args) throws Protecting {
        Protecting pr = new Protecting();
        System.out.println(pr.c);
        System.out.println((int)pr.c);
        System.out.println("ovo je iznad char default value");

        if (0 > 5) {
            System.out.println("0 is greater than 5");
        } else if (0 < 5) {
            System.out.println("its not");
        } else {
            System.out.println("maybe it is");
        }

        try {

            String s = "Said";

            System.out.println(age);

            pr.m1();

        } catch (Protecting | NullPointerException ex) {

            pr.m1();

        } finally {

            pr.m2();
        }

        String s = "Said";

        System.out.println(s.charAt(1));
    }

    public void m1() throws Protecting {

        int x = 2;
        final int lol = 232;

        print();

        this.m2();

        Protecting.methodStatic();

        throw new Protecting();

    }

    public void m2() throws RuntimeException {
        throw new NullPointerException();
    }

    static void methodStatic() throws Protecting {
        System.out.println("methodStatic();");
        print();

        final int lol = 232;
        int a = 3;

        new Protecting().m2();

    }

    static void print() {
        System.out.println("static method print();");
    }

}
