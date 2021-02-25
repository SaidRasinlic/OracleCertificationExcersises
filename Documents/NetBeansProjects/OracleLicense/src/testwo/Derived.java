package testwo;

import java.io.IOException;

public class Derived extends Base {

    @Override
    void method1() {
        someMethod("R");
    }

    public static void main(String[] args) throws IOException  {

        Base b = new Base();

        Base b2 = new Derived();

        b2.method1();

        Derived d21 = (Derived) b2;

        d21.method1();

        b.method1();

        Derived d = new Derived();

        d.method1();

        System.out.println(b.getId() + "=id");

        int sum = 0;

        for (int i = 0, j = 10; sum < 20; ++i, --j) { //1   | 
            sum = sum + i + j;  // 0 + 1 + 9 = 10; 10+ 2 + 8 = 10;
            System.out.println(i + " ovo je i");
            System.out.println(j + " ovo je j");
            System.out.println(sum + " ovo je sum");
        }
        System.out.println("Sum = " + sum);
    }
}
