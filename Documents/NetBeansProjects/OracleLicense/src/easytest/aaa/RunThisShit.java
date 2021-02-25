package easytest.aaa;

public class RunThisShit {

    public static void main(String[] args) {
        System.out.println("Hello");		// Prints out: Hello

        // byte short int long float double boolean char 
        // 8 bit- long double
        float f = (float) 23e5;

        System.out.println(f);

        System.out.println(hidePhone("456-789-1234"));
        System.out.println(hidePhone2("456-786-1234"));
        
       Rasinlic r = new Rasinlic(2);
       
        
    }

    public static String hidePhone(String fullPhoneNumber) {   //1 Insert code here }

        return "xxx-xxx-" + fullPhoneNumber.substring(8, 12);
    }

    public static String hidePhone2(String fullPhoneNumber) {   //1 Insert code here }

        return new StringBuilder(fullPhoneNumber).replace(0, 8, "xxx-xxx-").toString();  // included // excluded // aka inclusive & exclusive
    }
}

// insert and append nauciti stringbuilder
class Said {

    protected Said(int age) {
    }

    protected void hello() {
    }

}

class Rasinlic extends Said {

    private Rasinlic(int x, int y) {
        super(x);
    }

    Rasinlic(int age) {
        this(age, age);
        
      

    }

    @Override
    public void hello() {
        super.hello();
    }

}
