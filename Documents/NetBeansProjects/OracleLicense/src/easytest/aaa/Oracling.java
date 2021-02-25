package easytest.aaa;

public class Oracling {

}

class AccessTest {

    String a = "x";
    static char b = 'x';
    String c = "x";

    class Inner {

        String a = "y";

        String get() {
            String c = "temp";
            c = "" + b;

            c = " " + AccessTest.this.a;
            // Line 1
            return c;
        }
    }

    AccessTest() {
        System.out.println(new Inner().get());
    }

    public static void main(String args[]) {

        
        int some1 = 1000;
        int some2 = 1000;
        
        Integer xx = -128;
        Integer ss = -128;
        
        
        Integer lol = some1;
        
        System.out.println(xx==ss);
        
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        
        System.out.println(Boolean.parseBoolean("true") == true);

        System.out.println("----------------------------------");

        byte b = 1;
        char c = 1;
        short s = 1;
        int i = 1;

        s += i;
        System.out.println(s);

        for (int integr = 1; integr > 0; Math.random()) {
            System.out.println("true");
            if (Math.random() >= 0.5) {
                break;
            }
        }

        System.out.println(Math.random());
        System.out.println("HAHAHAH");
        new AccessTest();

    }
}
