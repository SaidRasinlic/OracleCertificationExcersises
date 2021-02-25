package aljahmer.nothing.thelastday.oreilly;

public class HandleException {

    public static void main(String[] args) throws InterruptedException {

        Thread loop = new Thread(() -> {
                    while (true) {
                        System.out.println("im looping wohooo!");
                        if (Thread.interrupted()) {
                            break;
                        }
                    }
                });

        loop.start();
        loop.interrupt();
        System.out.println(loop.getName());
        System.out.println("in the middle of the fire");
        System.out.println(Thread.currentThread().getName());

    }
}

class Interrupted {

    final static int xoxo() {
        return 0;
    }
}

class SubbyBubby extends Interrupted {

    static int count = 0;

    {
        System.out.println("SubbyBubby je pozvan na fiksni broj telefona... = " + ++count);
    }

    static int staticint = 23;
    int nonstaticint = 92;

    public static void staticMethod() {
        System.out.println("static method called");
    }

    public void nonStatic() {
        System.out.println("non-static method called");
    }

    public static void main(String[] args) {
        // System.out.println(new SubbyBubby().nonstaticint);
        // System.out.println(new SubbyBubby().staticint);

        SubbyBubby bubby = new SubbyBubby();

        bubby.staticMethod();
        bubby.nonStatic();
        System.out.println(bubby.staticint);
        System.out.println(bubby.nonstaticint);
    }
}

class Clone implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String name = "Said";
    String surname = "Rasinlic";

    public static void main(String[] args) throws CloneNotSupportedException {

        Clone clone = new Clone();
        System.out.println(clone.name + " " + clone.surname);
        Clone clone2 = (Clone) clone.clone();
        System.out.println(clone2.name + " " + clone2.surname);

    }
}
// kako Class.forName(); preko refleksije koja nije public 
