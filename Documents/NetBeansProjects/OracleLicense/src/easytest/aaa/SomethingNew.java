package easytest.aaa;

public class SomethingNew {

}

class MyException extends Throwable {
}

class MyException1 extends MyException {
}

class MyException2 extends MyException {
}

class MyException3 extends MyException2 {
}

class ExceptionTest {

    void myMethod() throws MyException {
        throw new MyException3();
    }

    public static int getSwitch(int x) {
        return x - 20 / x + x * x;
    }

    public static void main(String[] args) {
        switch (getSwitch(10)) {
            case 1:
            case 2:
            case 3:
            default:
                break;
        }

        System.out.println(getSwitch(20));

        ExceptionTest et = new ExceptionTest();
        try {
            et.myMethod();
        } catch (MyException3 me) {
            System.out.println("MyException3 thrown");
        } catch (MyException me3) {
            System.out.println("MyException thrown");
        } finally {
            System.out.println("Done");
        }

        int x = 0;
        labelA:
        for (int i = 10; i < 0; i--) {
            int j = 0;
            labelB:
            while (j < 10) {
                if (j > i) {
                    break labelB;
                }
                if (i == j) {
                    x++;
                    continue labelA;
                }
                j++;
            }
            x--;
        }
        System.out.println(x);

        int[] a = {1, 2, 3, 4};
        int[] b = {533, 3, 1, 0};

        System.out.println("---------------");
        System.out.println(a[(a = b)[3]]);
        System.out.println("---------------");
        System.out.println(a[b[2]]);

        /*    for (int i = 0; i < 10; System.out.println(i), System.out.println("aaa"), System.out.println("asasa"), methodX((byte) 2)) {

        } */
    }

    public static double methodX(byte by) {
        double d = 10.0;
        return (float) by / d * 3;
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
        ((Wow) f).wow();
        f.wow();
        Cr cr = new Cr();
        cr.m1();
    }
}

class Ar {

    public void m1() {
        System.out.println("AR ARUDAAAA");
    }
}

class Br extends Ar {

    public void m1() {
        System.out.println("BR BRUDA");
    }
}

class Cr extends Br {

    public void m1() {
        super.m1();
        System.out.println("CR CRUDAAA");

        /*  //1
      ... lot of code.
         */
    }
}