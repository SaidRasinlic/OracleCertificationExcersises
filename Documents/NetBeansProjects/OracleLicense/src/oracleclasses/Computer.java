package oracleclasses;

public abstract class Computer {

    abstract void turnOn();

    void honk() {
    };

    void turnOff() {
        System.out.println("Turning OFF broski see u!");
    }

    public static void main(String[] args) {

        OrderTest test = new OrderTest();

        int a, b, c;
        a = b = c = 9;

        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        int count = 0, sum = 0;
        do {
            if (count % 3 == 0) {
                continue;
            }
            sum += count;
        } while (count++ < 11);
        
        System.out.println(sum);
        System.out.println(19 % 20);

        boolean be = false;
        if (be = true) {
            System.out.println("TRUE");
            System.out.println(be);
        }
        System.out.println(be);
    }
}