package easytest;

public class Executor {

    public static void main(String[] args) {

        /*   A[] a, a1;
        B[] b;
        a = new A[10];
        a1 = a;

        b = new B[20];

        a = b;  // 1 
        b = (B[]) a;  // 2   
        b = (B[]) a1; // 3
         */
        Box box = new Box(5, 5, 5);

        System.out.println(box.getVolume());

        String n = "Said" + 123;

        System.out.println(box.parseFloat("0x.1"));

        Double x = new Double(-2.0 / 0.0);
        Double y = new Double(0.0 / 0.0);

        System.out.println(x);

        System.out.println(y);

        System.out.println(box.getLoad(2.0, 2.0));

    }

}

final class Box {

    private int volume;

    Box(int length, int width, int height) {
        this.volume = length * width * height;
    }

    public int getVolume() {
        return volume;
    }

    public float parseFloat(String s) {
        float f = 0.0f;
        try {
            f = Float.valueOf(s).floatValue();
            return f;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input " + s);
            f = Float.NaN;
            return f;
        } finally {
            System.out.println("finally");
            return f;
        }
    }

    public int getLoad(int x, int y) {
        return 1;
    }

    public double getLoad(double x, double y) {
        return 3.0;
    }
}
