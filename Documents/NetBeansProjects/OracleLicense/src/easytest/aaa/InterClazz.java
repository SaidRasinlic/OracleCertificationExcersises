package easytest.aaa;

public class InterClazz {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int counter = 0;
        for (int value : arr) {
            if (counter >= 5) {
                break;
            } else {
                //  continue; error sve sto se nalazi u if and elsu 
            }
            if (value > 4) {
                arr[counter] = value + 1;
            }
            counter++;
        }
        System.out.println(arr[counter]);

        First first = new First();

        Second second = new Second();

        System.out.println(
                "BYTES USAGE SECOND EDITION------------------------------------");

        second.addUsage(10);
        second.addUsage(20);
        second.addUsage(10);

        System.out.println("-------------------------------------");

        Third third = new Third();

        System.out.println(
                "BYTES USAGE THIRD EDITION------------------------------------");

        third.addUsage(
                10);
        third.addUsage(
                20);
        third.addUsage(
                10);
        System.out.println(
                "-------------------------------------");

        first = (Second) (I) second;
        // first = (Second) (I) (Second) second; MOZE I OVAKO 

        System.out.println(
                ((Second) first).gtfo);

        first.method();

        first = second;

        first.method();

        first.face();
        First first2 = new First();

        first2 = third;
        I iFace = (Third) first2;

        iFace.face();

    }
}

interface I {

    default void face() {
        System.out.println("INTERFACE");
    }
    int AGE = 21;
}

class First implements I {

    static int gtfo = 22;

    void method() {
        System.out.println("First class");
    }
}

class Second extends First {

    private int totalUsage;
    private double totalBill;
    private final double COST_PER_BYTE = 10;
    static int gtfo = 353;

    @Override
    void method() {
        System.out.println("Second class");
    }

    protected void addUsage(int bytesUsed) {
        if (bytesUsed > 0) {
            totalUsage = totalUsage + bytesUsed;
            totalBill = totalUsage * COST_PER_BYTE;
            System.out.println("Total Usage: " + totalUsage);
            System.out.println("Total Bill: " + totalBill);
        }
    }
}

class Third extends Second {

    private int totalUsage;
    private double totalBill;
    private final double COST_PER_BYTE = 10;

    public void addUsage(int bytesUsed) {
        if (bytesUsed > 0) {
            totalUsage = totalUsage + bytesUsed;
            totalBill = totalBill + bytesUsed * COST_PER_BYTE;
            System.out.println("Total Usage: " + totalUsage);
            System.out.println("Total Bill: " + totalBill);
        }
    }

    int years;
    int result;

    @Override
    void method() {
        System.out.println("Third class");
    }
}

class Four extends Bird implements Flyer {

    public Four(String name) {
        super(name);
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

interface Flyer {

    String getName();
}

class Bird implements Flyer {

    int something = 44;

    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Eagle extends Bird {

    public Eagle(String name) {
        super(name);
    }
}

class Ex {

    public static void main(String[] args) throws Exception {
        Flyer f = new Eagle("American Bald Eagle");         //PRINT NAME HERE    } }

        float fee = 242;
        System.out.println(f.getName());

        System.out.println(((Eagle) f).getName());

        System.out.println(((Bird) f).getName());

        Eagle eagle = new Eagle("American Hairy Eagle");
        eagle.getName();
        int x = eagle.something;
        Bird bird = new Bird("Bird super clazz");

        int y = bird.something;

        Eagle eagle2 = (Eagle) new Bird("sasa");

    }
}
