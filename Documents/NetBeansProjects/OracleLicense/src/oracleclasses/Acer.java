package oracleclasses;

import oracle.A;

public abstract class Acer extends Computer {

    transient int x = 22;
    volatile int y = 23;

    native void print();

    abstract void acerMethod();

    private static boolean testMe(int num) {
        return (num > 10) ? true : false;
    }

    @Override
    void turnOn() {
        System.out.println("PC turns ON ACER-WAY!");
    }

    public void m() {
        int d;
        int e = 0;

        // Line 1
    }

    public static void main(String[] args) {

       
 
        Acer ac = new Acer() {
            @Override
            void acerMethod() {
                System.out.println("ACER METHOD ANONYMOUS");
            }
        };

        int num = 10;
        boolean b;

        if (b = false) {
        }

        if (num == 10 ? true : false) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        String[] arr = new String[2];

        arr[0] = "asa";
        System.out.println(arr[0]);

    }
}

//String name = case.equals("uppercase") ? "JOHN" : "john";
