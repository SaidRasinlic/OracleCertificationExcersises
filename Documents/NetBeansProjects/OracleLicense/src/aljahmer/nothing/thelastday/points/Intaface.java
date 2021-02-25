package aljahmer.nothing.thelastday.points;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intaface {

    public static void main(String[] args) {

        List arr = new ArrayList();

        /*  try {
            while (true) {
                arr.add("Said");
            }
        } catch (Exception ex) {
           // ex.printStackTrace();
        } */
        Object[] o = new Integer[]{};

        System.out.println(o.length);

        List<String> list
                = Arrays.asList("A", "B", "C", "D",
                        "E", "F", "G", "H", "I", "J");

        switch (4) {
            default:
                if (3 > 5) {
                    break;
                }
        }
    }
}

class DoWhileBug {

    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println(i);
            break;
        } while (i++ < 10);
    }

    void m() {
        int c, d;
        if (true) {
            c = 9;
            d = 9;
        }
        System.out.println(c + " " + d);
    }
}
