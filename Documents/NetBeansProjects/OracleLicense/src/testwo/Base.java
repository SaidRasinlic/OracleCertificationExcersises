package testwo;

import java.io.IOException;

public class Base {

    protected int value = 10;

    public void printr() {
        System.out.println("hi base");
    }

    private int id;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "tostring broski";
    }

    void method1() throws java.io.IOException {
        someMethod("Said");

        // some I/O operations 
    }

    int someMethod(String str) {
        if (str == null) {
            throw new NullPointerException();
        } else {
            System.out.println(str + " " + str.length());
            return str.length();
        }
    }

    public static void main(String[] args) throws IOException {

        Base b = new Base();
        
        System.out.println(b.value);

    }
}
