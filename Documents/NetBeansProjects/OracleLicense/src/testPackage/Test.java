package testPackage;

public class Test {

    public static void main(String[] args) {

        String hello = "Hello", lo = "lo";
        System.out.print((testPackage.Other.hello == hello) + " ");    //line 1
        System.out.print((other.Other.hello == hello) + " ");   //line 2
        System.out.print((hello == ("Hel" + "lo")) + " ");           //line 3
        System.out.print((hello == ("Hel" + lo)) + " ");              //line 4
        System.out.println(hello == ("Hel" + lo).intern());          //line 5

        String x = "Hel" + lo;

        System.out.println(x == lo);

        int arr[] = {12, 43, 6, 8};

        for (int count = 0; count < arr.length; count++) {
            final int i = arr[count];

            System.out.println(i);
        }

    }
}

class Other {

    static String hello = "Hello";
}
