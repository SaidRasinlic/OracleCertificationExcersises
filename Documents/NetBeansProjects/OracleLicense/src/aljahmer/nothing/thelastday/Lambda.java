package aljahmer.nothing.thelastday;

import static aljahmer.nothing.thelastday.Lambda.*;

public class Lambda {

    public static void lambdyChecker(LambdaInterface lambda, int height) {
        if (lambda.tooHeight(height, 10, 20)) {
            System.out.println("Too high!");
        } else {
            System.out.println("This height will pass without problems!Congratulations!");
        }
    }
}

class Tester {

    public float parseFloat(String s) {
        float f = 0.0f;      // 1
        try {
            f = Float.valueOf(s).floatValue();    // 2
            return f;      // 3
        } catch (NumberFormatException nfe) {
            f = Float.NaN;    // 4
            // 5
        } finally {
            // 6
        }
        return f;    // 7
    }

    public static void main(String[] args) {

        lambdyChecker((int h, int l, int k) -> h > l && h > k, 15);

        int num = 200;

        int[][] arr = new int[3][];
        // nullpointerexception  System.out.println(arr[0].length);
        //  System.out.println(arr[0].length);
        //arr[0][0] = num;

        System.out.println(arr[1]);

        String[][][] trixArr = {
            {{"a", "b", "c"}, {"d", "e", null}},
            {{"x"}, {null}},
            {{"y"}},
            {{"z", "p"}, {}}
        };

        System.out.println(trixArr[3][0][1]);
        System.out.println("" + null);

        // compile error  System.out.println(null);
        int arrTwo[][] = {{1}, null, {135, 325, 246}};
        System.out.println(arrTwo[2][2]);

        LOOP:
        {
            System.out.println("");
            break LOOP;
        }

        JILL:
        {
            System.out.println("HAHHA");
            break JILL;
        }

    }
}

/*
        lambdyChecker((int h, int l) -> {
            return h > l;
        }, 11);
 */
class SmartPhone {

    static int salary;
    String name;
    String color;
    int dateOfRelease;

    public SmartPhone(String name, String color, int dateOfRelease) {
        this.name = name;
        this.color = color;
        this.dateOfRelease = dateOfRelease;
    }

    public void test(int s) {
        this.salary = s;
    }
}

@FunctionalInterface
interface LambdaInterface {

    public boolean tooHeight(int height, int limit, int k);

}
