package thirdchance.classes.p1;

public class AccessModifier {

    protected void protectedMethod() {
        System.out.println("Protected method bro!");
    }

    private void privateMethod() {
        System.out.println("Private method bro!");
    }

    public void publicMethod() {
        System.out.println("Public method bro!");
    }

    void packagePrivateMethod() {
        System.out.println("Package private method bro!");
    }

    public static void main(String[] args) {

    }
}

class SubAccess extends AccessModifier {

    public static void main(String[] args) {

        SubAccess sub = new SubAccess();


    }
}
