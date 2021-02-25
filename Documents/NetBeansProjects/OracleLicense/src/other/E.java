package other;

public class E extends D {

    public E(String s) {
        this();
        System.out.println("E :" + s);
    }

    public E(int i) {
    } // C3

    public E() {
        super();
    }

}
