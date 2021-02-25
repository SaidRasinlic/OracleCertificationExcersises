package oracle;

public class BaseClass extends Executor {

    void print() throws Exception {
        System.out.println("Hello from base class!");
    }

    public static void main(String[] args) throws Exception  {

        try {
            m1();

            System.out.println("A");

        } finally {

            //System.exit(0); nista ne pise odnosno ne ispisuje ni error a ni B
            System.out.println("B");

        }

        System.out.println("C");

    }

    public static void m1() throws Exception {

        throw new Exception();
    }

}
