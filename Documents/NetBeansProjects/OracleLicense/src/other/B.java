package other;

public class B extends A {

    public int B(String s) {
        System.out.println("B :" + s);
        return 0;
    } // B1

    public static void main(String[] args) {
        System.out.println(new B().main);

        Object s = "asdf";
        //  StringBuffer sb = (StringBuffer) s; //exception at runtime because s is referring to a String. 
        int[] ia = new int[]{1, 2, 3}; // ia is of length 3.
        //   System.out.println(ia[3]);

        new B().m2();

    }

    int main;

    void smd() {
    }

    ;
    
    Object m1() {
        return new Object();
    }

    void m2() {
        String s = (String) m1();
    }
}
