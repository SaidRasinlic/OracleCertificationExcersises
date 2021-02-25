package oracle;

import java.io.Console;

public class B extends A {

    public B() {
    }

 
    public A message() {
        System.out.println("public A message(); referira na A");
        return this;
    }

    public Object print() {
        int[] arr = new int[]{1, 2, 3, 4};
        return arr;
    }

    public static void main(String[] args) {

        B obj = new B();

        obj.message();

        int[] arr = (int[]) obj.print();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " " + "\n");
        }
        System.out.println("--------------------");

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j] + " ");
            }
        }
        System.out.println("NIZOVI");

        int[] ar = new int[5];

        int[] array = {0, 1, 2, 3, 4};

        System.out.println(array[4]);

        A[] objs = new A[10];

        objs[0] = new A();

        objs[1] = new A();

        objs[2] = new B();

        objs[2].nextLine();

        objs[1].nextLine();
        System.out.println("------------------------------------------------------------");
        System.out.println("loop");
        obj.loopTest(1);

    }

    public void loopTest(int x) {
        loop:
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println(i);
                if (x == 0) {
                    continue loop;
                }
                System.out.println(j);
            }
        }
    }
}
