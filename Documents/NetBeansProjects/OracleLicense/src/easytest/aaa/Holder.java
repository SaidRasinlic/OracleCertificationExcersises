package easytest.aaa;

class Holder {

    static void sayYo() {

    }

    int value = 1;
    Holder link;

    public Holder(int val) {
        this.value = val;
    }

    public static void main(String[] args) {
        final Holder a = new Holder(5);
        Holder b = new Holder(10);
        final Holder c = new Holder(24);

        a.link = b;
        b.link = c;

        System.out.println(a.link.value + " " + b.link.value + " " + "LINK  MAIN");
        b.link = setIt(a, b);
        System.out.println(a.link.value + " " + b.link.value);
    }

    public static Holder setIt(final Holder x, final Holder y) {

        System.out.println(x.link + " " + y.link);
        x.link = y.link;
        return x;
    }
}

interface Bar {

    public static final int AGE = 23;

    void bar();
}

abstract class FooBase {

    public static final int AGE = 232;

    public void bar() {
    }
}

class Foo extends FooBase implements Bar {

    String s1 = "green mile";   // 0  

    public void generateReport(int n) {
        String local;   // 1       
        if (n > 0) {
            local = "good";   //2
        } else {
            local = "smd";
        }
        System.out.println(s1 + " = " + local);   //3 
    }

    public static String hidePhone(String fullPhoneNumber) {
        //  return new StringBuilder(fullPhoneNumber).append("xxxx", 0, 4).toString();

        return new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 8).toString();
        
     
    }

    public static double getSwitch(String str) {
        System.out.println(str.length());
        return Double.parseDouble(str.substring(1, str.length() - 2));
    }

    public static void main(String[] args) {

     
        
        System.out.println(getSwitch("-0.50"));

        System.out.println(Double.valueOf(-0));

        Long l = new Long(-129);

        System.out.println(l.byteValue());

        String mStr = "12";

        Long.valueOf(mStr).longValue();

        System.out.println(hidePhone("061-022-5867"));

        StringBuilder manutd = new StringBuilder("Manchester United");

        String ins = "City ";

        manutd.insert(11,ins, 0, 4);

        manutd.substring(0, 11);

        System.out.println(manutd);

        System.out.println(Boolean.parseBoolean("true") == true);

        String s = null;

        s = s + "asfs";

        System.out.println(s);

        String some = "";

        String some2 = "gtfo";

        some += "gtfo";
        System.out.println(some == some2);
        System.out.println("---------------------------------");

        String n1 = "Said";
        String n2 = "Said";

        System.out.println(n1 == n2);
        System.out.println(n2.equals(n1));

        /*    Bar foo = new Foo();

        foo.bar();
        
         */
    }

    @Override
    public void bar() {
        super.bar();
    }

}

class Base2 {

    static void hello() {
        System.out.println("base2 hello");
    }
    int age = 55;

    static void methodB() {
        System.out.println("BASE BITCHHHHHHHH - MethodB");
    }

    void methodA() {
        System.out.println("BASEE - MethodA");
    }
}

class Sub2 extends Base2 {

    static void hello() {
        System.out.println("sub2 hello");
    }

    void smd() {
    }

    int age = 22;

    public void methodA() {
        System.out.println("subbbbbbbb - MethodA");
    }

    static void methodB() {
        System.out.println("sub - MethodB");
    }

    public static void main(String args[]) {
        Base2 b = new Sub2(); //1

        b.hello();
        System.out.println(b.age);

        b.methodA(); //2
        b.methodB();
    }
}

/*
Always remember: Instance methods are overridden and variables (and static methods) are hidden. Which instance method 
is invoked depends on the class of the actual object, while which field (and static method) is accessed depends on the class of the variable.
Here, b refers to an object of class Beta so b.getH() will always call the overridden (subclass's method). 
However, the type of reference of b is Baap. so b.h will always refer to Baap's h.  Further, inside Beta's getH(),
Beta's h will be accessed instead of Baap's h because you are accessing this.h ('this' is implicit) and the type of this is Beta.
 */
