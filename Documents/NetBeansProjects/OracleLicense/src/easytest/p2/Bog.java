package easytest.p2;

public class Bog {

    public static void main(String[] args) {

        double[][][] test = {
            {{1, -2, 3},
            {2, 3, 4}},
            {{-4, -5, 6, 9}, {1}, {2, 3}}
        };

        int[][] nekiNiz = {
            {1, 2, 3, 4, 5},
            {10, 20, 30, 40, 50, 60}
        };

        int[] arr = {100, 2, 3, 4, 5, 6};

        System.out.println("-------------------");

        int counter = 0;
        for (int value : arr) {
            if (counter >= 5) {
                break;
            } else {

            }
            if (value > 4) {
                arr[counter] = value + 1;

            }
            counter++;
        }
        System.out.println(arr[counter]);

        int x = 10, y = 20;
        int dx, dy;
        try {
            dx = x % 5;
            dy = y / dx;
        } catch (ArithmeticException ae) {
            System.out.println("Caught AE");
            dx = 2;
            dy = y / dx;
        }
        x = x / dx;
        y = y / dy;
        System.out.println(dx + " " + dy);
        System.out.println(x + " " + y);

        int num;
        try {
            num = 10;
        } catch (Exception e) {
            num = 20;
        }
        System.out.println(num);

    }

}

class Doll {

    String name;

    Doll(String nm) {
        this.name = nm;
    }
}

class Barbie extends Doll {

  /*  Barbie() {
        this("unknown");  //1 
    }
*/
    Barbie(String nm) {
        super(nm);   //2
    }
}

class TestClass {

    public static void main(String[] args) {
        Barbie b = new Barbie("mydoll");
        System.out.println(b.name);
    }
}
