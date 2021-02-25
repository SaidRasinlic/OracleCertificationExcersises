package other;

import java.util.ArrayList;

public class A {

    public A() {
    } // A1

    public A(String s) {
        this();
        System.out.println("A :" + s);
    }  // A2

    public static void main(String[] args) {
        double rate = 10;
        int t = 5;
        double amount = 1000.0;
        for (int i = 0; i < t; i++) {
            amount = amount * (1 - rate / 100);
            System.out.println(amount);
        }

        int z = (int) (1 - rate / 100);
        double h = 1 - (double) rate / 100;

        System.out.println("----");
        System.out.println(z);
        System.out.println(h);

    }
    String surname;
}

class Ba extends A {
    

}

class Ca extends Ba {

}

class X {

    Ba getBa() {
        return new Ca();
    }
}

class Y extends X {
    //method declaration here }

    @Override
    Ca getBa() {
        return (Ca) new Ba();
        
        
    }

    
    
    public static void main(String[] args) {

        Y y = new Y();

    }
}
