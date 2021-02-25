package oracle;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class A {

    int valbroski=246;
    private int val = 32;
    public int value = 0;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
    
    

    
    protected void nextLine()   {
 
    }

    public static int setRecursion(int num) {
        if (num == 1) {
            return 1;
        }
        return setRecursion(num - 1) + num;
    }

    public static void untilRecursion(int start, A stop) {  // start = 12, stop =3
        System.out.println("Hey I am called" + stop.value);
        if (stop.value >= start) {
            return;
        }
        stop.value++;
        untilRecursion(start--, stop);

    }

    public static void main(String[] args) {
        /* a.nextLine();
        int recursion = A.setRecursion(5);
        System.out.println(A.setRecursion(8));
        System.out.println(recursion);
         */

        A stop = new A();
        stop.value = 3;

        stop.valbroski=2424;
        
        
        
        int start = 12;
        //untilRecursion(start, stop);

        byte[] ascii = "Rašinlić".getBytes(StandardCharsets.ISO_8859_1);
        String asciiString = Arrays.toString(ascii);
        System.out.println(asciiString); // print [74, 97, 118, 97]
        System.out.println("------------------------ PRVI DIO");

        String i = "Rašinlić";
        byte[] b = i.getBytes();
        System.out.println(Arrays.toString(b));

        int ir = 353;   //353
        char ch = (char) ir;
        System.out.println(ch);

        char ch2 = 'š';

        int x = ch2;

        String[] str = new String[2];

        for (String sr : str) {
            System.out.println(sr);
        }

        int asce = 63;

        char cer = (char) asce;

        System.out.println(cer);

        String nm = "Rašinlić";

        char[] asc = nm.toCharArray();

        for (char crh : asc) {
            System.out.print((int) crh + " ");
        }

        System.out.println(x);
        try {
            String surname = "Rašinlić";

            byte[] bits = surname.getBytes("US-ASCII");
            System.out.println(Arrays.toString(bits).toString());

        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }

    }
    public int x = 5;

    public int getX() {
        return x;
    }

    public void looper() {
        int x = 0;
        while ((x = getX()) != 0) {
            for (int m = 10; m >= 0; m--) {
                x = m;
                System.out.println(x);
            }
        }
    }

}

/*
    public int value =0;

    public static void counter(int start, RecursionControl stop) {
        System.out.println("HEy I am called" + stop.value);
        if (stop.value >=start) {
            return;
        }
        stop.value++;
        counter(start--, stop);
    }

    public static void main(String[] args) {
        RecursionControl stop = new RecursionControl();
        stop.value = 3; //3,4,5,6,7,8,9,10,11,12,  | 

        int start = 12;//12,11,10,9,8,7,6,5,4,3,   |
        counter(start, stop);
    }
}

 */

  class AnotharClaz{
    
    public static void main(String[] args) {
        
        A a = new A();
        
        a.valbroski=3;
        
        a.value= 242;
        
        a.setVal(25);
       
        a.getVal();
    }
   
}
