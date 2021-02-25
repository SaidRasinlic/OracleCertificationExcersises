package clothing.pants;

import static clothing.Shirt.getColor;
import clothing.Shirt;

public class Jeans {

    // long float double char default values print dont forget to try this at home!Lol!
    public void matchShirt() {

        String color = Shirt.getColor();
        String color2 = getColor();
        if (color.equals("Green")) {
            System.out.println("Fit");
        }
    }

    public static void main(String[] args) {

        char eet = 0;
        --eet;
        System.out.println((int) --eet);
        System.out.println("-----");
        Jeans trouser = new Jeans();
        trouser.matchShirt();

        char c = '1';
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1;
        float f = 1;
        double d = 1;
        boolean bool = Boolean.valueOf("1");

        /*
Double j = new Double(5);
double k =j;
Here unboxing is occurred. getting value from Wrapper object and assign to primitive data type(int,doulbe,float) double k= j;
is equivalent to j.doubleValue(); return type is double.
Double j = 5;
         */
        
        int k = 3;
        int wf = 3;
        double y = new Integer(5);  //unboxing followed by widening
        System.out.println("---------");
        long sds = Integer.valueOf(24); //unboxing followed by widening
        float edj = k + wf;
        int as = Character.MIN_VALUE;
        System.out.println(as + " ------------------------------------------------");
        char wrjwe = Character.MAX_VALUE;
        System.out.println((int) wrjwe + " MAX------------------------------------------");
        Character character = 5;
        Byte byty = 6;
        Short shorty = 32767; // max       
        Integer inty = new Integer("1");
        double wr = inty;

        final short ss = -128;
        final byte b2 = ss;
        Short s2 = b2;
        Byte wrwr = b2;
      //Integer i2 = b2;
      //Integer i3 = ss;
        char charlton = 65535;
        char ssj = (char) 24.24;
        char sfw = (char) -35;
        System.out.println(sfw);
        System.out.println("SFW");
        System.out.println(charlton);

        /*Double efe = inty;
        Long longy = 1;   // 1 je int i ne moze int to long a onda long to Long ne radi dvije automatizacije
        Float floaty = 1;
        Double doubley = 1;
        final byte b = 12;
Byte b2 = b;
Character c = b;  // Only an error if b isn't final
char c2 = b;      // Only an error if b isn't final
Short s = b;      // Only an error if b isn't final
short s2 = b;
Integer i = b;  // Error, as indicated in the question
int i2 = b;
Long l = b;     // Also an error
long l2 = b;
Float f = b;    // Also an error
float f2 = b;
Double d = b;   // Also an error
double d2 = b;     
         */
        Boolean booly = Boolean.valueOf("1");
        switch (inty) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("gtfo");
            default:
                System.out.println("default");
        }
    }
}

/*
https://www.pass4cram.com/demo/1z0-808.pdf
https://www.youtube.com/watch?v=4NshxkCx5ac&feature=youtu.be 
 */
