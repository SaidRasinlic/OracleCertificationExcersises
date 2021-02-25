package other;

import java.util.ArrayList;

public class C {

    private C() {
        super();
    } // C1

    public C(String s) {
        this();
        System.out.println("C :" + s);
    } // C2

    public C(int i) {
    } // C3

    public static void main(String[] args) {

        Object[] e = new Object[]{"aaa", new Object(), new ArrayList(), 10};

        Object[] o = new Object[]{"aaa", new Object(), new ArrayList(), new String[]{""}};

        Object arr[][] = new Object[][]{new String[5], {}};

        System.out.println(arr[1][0]); // indexOutOfBounds

        String[] sa = {null};

      

    }

    public static void calculate(int x) {
        String val;
        switch (x) {
            case 2:

            default:
                val = "def";
        }
        System.out.println(val);
    }
}
