package easytest.aaa;

public class Sub extends Super {

    int i, j, k;

    public Sub(int m, int n) {

        i = m;
        j = m;
    }

    public Sub(int m) {
        super(m);
    }

    static public void out1() {

    }

    static public int out2() {
        return 1;
    }
//; Java EE + EJB, JSF, MySQL, EclipseLink (JPA), JavaScript, HTML, CSS,jQuery, Bootstrap, AJAX

    public static void main(String[] args) {

        int i = 10;
//        System.out.println(i < 20 ? out1() : 8);

        //  Integer k = i < 20 ? out1() : out2();
        byte b = 10;
        short s = 50;
        s = args.length == 0 ? s : b;

        System.out.println("II DIO");

        int val = '1';
        System.out.println(val);
        System.out.println("IDU SLOVA BURAZ");
        int valA = 'A';
        int vala = 'a';

        System.out.println(vala + " " + valA);
//System.out.println(i < 20 ? out1() : out2());
        System.out.println("1ASINLIC12".compareTo("HELLOWORLD"));
        System.out.println("RASINLIC12".compareTo("HELLO WORLD") < 0);
        System.out.println("------------");
        System.out.println("SAID".compareTo("sAID"));
        System.out.println("sAid".compareTo("sAId") < 0);

        /*  if (args[0].equals("open")) {
            if (args[1].equals("someone")) {
                System.out.println("Hello!");
            } else {
                System.out.println("Go away " + args[1]);
            }
        } */
    }
    String[][] arr = new String[2][3];
}
