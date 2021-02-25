package aljahmer;

import java.util.Objects;

public class ItzSoClazzy {
    
   protected void yolo (){}

    int age;
}

class ItzSoMessy {

    String name;
}

class ItzReallyFu {

    String surname;
}

class RunThisShit extends ItzSoClazzy {

    public static void main(String[] args) {

    }
}

class X {

    int wtf = 121;

    int val = 10;

    void yo() {
        System.out.println("Super clazz yo");
    }

}

class Y extends X {

    @Override
    void yo() {
        super.yo();
        System.out.println("sub clazz yo");
    }

    public static String hidePhone(String fullPhoneNumber) {   //1 Insert code here

//return new StringBuilder(fullPhoneNumber).substring(0, 8)+"xxxx";
        return new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 8).toString();

//return new StringBuilder("xxxx").insert(2, fullPhoneNumber, 0, 8).toString();
    }

    String name = "Said";
    Y val = null; //1 
}

class TestClass extends X {

    static Object getString() {
        return null;
    }

    public static void main(String[] args) {
       
        System.out.println(System.getProperty("java.classpath")); 
        System.out.println("////////////////////////");
        System.out.println((String) null);
        System.out.println((String) getString() + true);

        boolean b1 = false;
        boolean b2 = false;
        if (b2 != b1 != !b2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        System.out.println("--------------- || ---------------");
        String s = new Boolean("true").toString();
        System.out.println(s + null);
        String strLonVal = "7826";

        if (!true != true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("--------------- II DIO");
        Long l = new Long(242);
        Integer n1 = 5;
        Integer n2 = 5;
        System.out.println(new StringBuilder("world").append("7826", 0, 2));
        System.out.println(Long.getLong(strLonVal));
        System.out.println("----------------------");
        System.out.println(Long.valueOf(strLonVal));
        System.out.println(Objects.equals(n1, n2));
        System.out.println(n1.equals(n2));
        System.out.println("--------------");

        Y y2 = new Y();
        y2.yo();
        System.out.println(((X) y2).val);
        System.out.println(Y.hidePhone("061-022-5678"));

        Y y = new Y();
        X k = (X) y.val; //2 
        System.out.println(k);
    }
}

