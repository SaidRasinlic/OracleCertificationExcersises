package aljahmer.nothing.thelastday.oreilly;

public class StaticAgain {

    static int min(int[] x) {
        int min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }

    public float parseFloat(String s) {
        float f = 0.0f;
        try {

            int x = 43;
            f = Float.valueOf(s).floatValue();
            return f;
        } catch (NumberFormatException nfe) {

            System.out.println("Invalid input " + s);
            f = Float.NaN;
            return f;
        } finally {

            System.out.println("finally");

        }

    }

    public static void main(String[] args) {

    }
}


//https://www.javamockexams.com/java8/1Z0-808/free-test.html?mail=saidrasinlic@outlook.com#