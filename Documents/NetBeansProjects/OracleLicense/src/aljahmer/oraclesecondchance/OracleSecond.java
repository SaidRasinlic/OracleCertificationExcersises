package aljahmer.oraclesecondchance;

import aljahmer.nothing.thelastday.Employee;
import static aljahmer.nothing.thelastday.Employee.*;
//import aljahmer.nothing.thelastday.Employee;

public class OracleSecond {

    static int num = 222;
    double d1, d2, d3;

    OracleSecond clazz;
    public static int iStatic = 10;
    public int cash = 999999999;

    public void nonStatic() throws Exception {
        System.out.println("can access static variable inside non-static method : " + iStatic);
        main(new String[2]);
    }

    public static void aStatic() throws Exception {
        /*  System.out.println("can access static variable inside static method : " + iStatic);
        main(new String[2]); */
        new OracleSecond().cash++;
        Class cl = Class.forName("aljahmer.oraclesecondchance.OracleSecond");
        OracleSecond or = (OracleSecond) cl.newInstance();
        System.out.println(++or.cash);
        System.out.println(++or.cash);
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Inside main method");
        aStatic();
        char chArr[] = {'J', 'a', 'v', 'a'};

        String string = "Java";
        String newStr = "";

        for (char s : chArr) {
            newStr += s;
        }

        System.out.println(newStr);
        System.out.println(newStr.equals(string));
        System.out.println(newStr == string);

        System.out.println("--------------------------------------EQUALITY");
        String name = "Said";
        String name2 = "";
        name2 += "Said";

        System.out.println(name.equals(name2));
        System.out.println(name == name2);

        Employee em = null;
        System.out.println(AGE);
        System.out.println(em.name);

        staticMethod();

        OracleSecond oracle = new OracleSecond();
        OracleSecond.Inner in2 = new OracleSecond().new Inner();

        System.out.println(OracleSecond.Inner.NAME);
        /* Inner inner = new Inner();

     int yobro = Inner.yobro;
        int wtf = inner.wtf;
         */
    }

    class Inner extends OracleSecond {

        public static final String NAME = "Said";
        int wtf = 2;
        int yobro = 99;
    }
}

class In extends OracleSecond {

    public static void staticMethod() {
    }

    public static void main(String[] args) {
        int num = In.num;
    }
}
