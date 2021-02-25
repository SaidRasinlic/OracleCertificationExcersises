package easytest.px;

import easytest.p1.Movable;
import easytest.p2.Donkey;

public class TestClass {

    public static void main(String[] args) throws NoSuchMethodException {

        Movable m = new Donkey();

        m.move(10);
        m.moveBack(20);

        // System.out.println(m.location);
        TestClass t = new TestClass();

        //   System.out.println(t.parseFloat("2"));
        double daaa[][][] = new double[3][2][2];
        double d = 100.0;
        double[][] daa = new double[1][1];

        daaa[0] = daa;
//       daaa[0][0] = daa[0];
        System.out.println(daaa[0][0][0]);

        daa = daaa[0];

        double[][][] test = {
            {
                {1, -2, 3},
                {2, 3, 4}
            },
            {
                {-4, -5, 6, 9},
                {1},
                {2, 3}
            }
        };

        int[][] ezz = {
            {1, 3523, 233, 143}, {45, 346, 234, 9}

        };

    }

    public float parseFloat(String s) {
        float f = 0.0f;      // 1
        try {
            f = Float.valueOf(s).floatValue();    // 2
            //    return f;      // 3
        } catch (NumberFormatException nfe) {
            f = Float.NaN;    // 4
            return f;     // 5
        } finally {
            // return f;     // 6
        }

        return f; // 7
    }
}
