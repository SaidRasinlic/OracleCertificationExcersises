package oracle;

public class DerivedClass extends BaseClass {

    public void print(int n) {
        System.out.println("derived class");
    }

    final public static void main(String[] args) {

        int[] values = {10, 30, 50};
        System.out.println(values.length + " VALUES LENGTH");
        for (int val : values) {
            int x = 0;
            while (x < values.length) {
                System.out.println(x + " " + val);
                x++;
            }
        }
        final Object[] objArr = {null};
        System.out.println(objArr[0]);
    }
}
