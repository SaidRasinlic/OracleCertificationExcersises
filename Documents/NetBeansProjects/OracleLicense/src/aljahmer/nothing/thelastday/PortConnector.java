package aljahmer.nothing.thelastday;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class PortConnector {

    int port;

    public PortConnector(int port) throws IOException {
        this.port = port;
    }

    void m1() throws IOException {
        System.out.println("PortConnector base class method");
    }

    public static void methodX() throws Exception {
        throw new AssertionError();
    }
}

class CleanConnector extends PortConnector {

    static int counter;

    public CleanConnector(int port) throws FileNotFoundException, IOException {
        super(port);
    }

    void gtfo(int i) {
        i = this.counter;

        this.counter = i;
    }

    @Override
    void m1() throws FileNotFoundException {
        System.out.println(this.counter);
    }

    public static void main(String[] args) {

        try {

            methodX();
        } catch (Exception ex) {
            System.out.println("Exception EX");
        } catch (Error ex) {
            System.out.println("Error ex");
        }

        int[] arr = {1, 2};
        int[][] arr2
                = {
                    arr,
                    {1, 222},
                    arr
                };
        int[][][] arr3 = {arr2};
        System.out.println(arr2[2][1]);
        float xf = 0b011_1111111;
        System.out.println(xf);
        int oct = 110;
        System.out.println(oct);
        Suzuki suzy = new Suzuki();
        Motor m = new Suzuki();

        suzy.saveObject((Suzuki) m);
        System.out.println(suzy.i);
        suzy.saveObject((Suzuki) m);
        System.out.println(suzy.i);

    }
}

class Motor {

    char c = 10;

    public static int doIt() throws Exception {
        throw new Exception("Forget It");
    }

    void noisyKillar() {
        System.out.println("WROOOOOOOOOOOOOOM!");
    }
}

class Suzuki extends Motor {

    int i = 0;
    Object prevObj;

    @Override
    void noisyKillar() {
        super.noisyKillar();
    }

    public void saveObject(Suzuki suz) {
        prevObj = suz;
        i++;
    }
}
