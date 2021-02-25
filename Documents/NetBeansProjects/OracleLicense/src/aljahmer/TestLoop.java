package aljahmer;

import java.util.function.Predicate;
import jdk.nashorn.internal.ir.ContinueNode;

public class TestLoop {

    static int i = 0;

    int age = 99;

    public static void main(String[] args) {

        if (true) ; else ;

        if (true) {
            if (false);
        }

        for (; !isDone();) {
            System.out.println("FOR LOOP BRUH");
        }

        do {
            System.out.println("DO WHILE BROSKI");

        } while (!isDone());
    }

    static boolean isDone() {
        i++;
        if (i == 2) {
            return false;
        } else {
            return true;
        }
    }
}

interface J {

    default void aww() {
    }

    int age = 242;

    int getJ(int a, int b, int c);
}

class A {

 
}

class AA extends A {

     void m1(int x){
        System.out.println("m1 int");
    }
    
    void m1(double x){
        System.out.println("m1 double");
    }
    
    void m1(String x){
        System.out.println("m1 String");
    }


}

class TestMe {

    public static void main(String[] args) throws Exception {
        A a = new A();
        AA aa = new AA();

        a = aa;
        System.out.println("a = " + a.getClass());
        System.out.println("aa = " + aa.getClass());

        
     
    }
}
