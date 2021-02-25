package aljahmer.nothing.thelastday.points;
//https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#d5e14278

import java.util.ArrayList;
import java.util.List;
import static aljahmer.nothing.thelastday.points.NewClass.newClassVar;
import java.io.IOException;
import java.util.function.Predicate;

public class Functionalize {

    public static void main(String[] args) {

        // int newClassVar = 000;
        System.out.println(newClassVar);

        System.out.println("NEWWWW CLASSS VARRR");

        List<String> strList = new ArrayList<>();
        ArrayList<String> arrList = new ArrayList<>();

        System.out.println(strList.getClass());
        System.out.println(arrList.getClass());

        strList.add("Said I");
        strList.add("Said II");
        strList.add("Said III");
        strList.forEach((x) -> {
            System.out.println(x);
        });

        strList.forEach((a) -> System.out.println(a));
        //String clcllc = ullClazz.add((String s) -> s, "hohoho marry x-mass broski");
    }
}

interface Runner {

    public void run();
}

interface Runner2 {

    public int run();
}

class Cd {

    static char ch;

    public static void main(String[] args) {

        char cwr = 97;

        System.out.println(cwr);
        System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>>");
        float x = 0f;
        float y = 0.0f;
        System.out.println(x == y);
        System.out.println("--------nexttt roundddd");

        double d = 3;
        Float xr = new Float(20);
        Float yr = new Float(20);

        System.out.println(xr == yr); //prints false
        System.out.println(xr.equals(yr)); //prints true
        System.out.println("----------");
        Integer inta1 = new Integer(24);
        Integer inta2 = new Integer(24);

        System.out.println(inta1 == inta2);

        System.out.println("<------------floating point numbers precision------------->");
        float f1 = 2f;
        float f2 = 2f;
        double d1 = 4d;
        double d2 = 4d;
        Double dd1 = 4d;
        Double dd2 = 4d;
        Double dd3 = dd2;
        System.out.println(f1 == f2);
        System.out.println(d1 == d2);
        System.out.println(dd1 == dd2);
        System.out.println(dd3 == dd2);

        System.out.println(Integer.parseInt("22", 16));
        System.out.println("------------");
        String xt = "apple";
        System.out.println(xt.substring(4));
        String name = "Said";
        String name2 = name;

        System.out.println(name == name2);
        run(() -> voidMethod()); //will invoke run(Runner ) method.        
        run(() -> intMethod()); //will not invoke run(Runner ) method.
        System.out.println(ch);

        Predicate<Object> p;

        p = lock -> {
            if (args.length > 0) {
                return lock.equals(args[0]);
            }

            return false;
        };

        p = (Object lock) -> {
            lock = lock.toString();

            return lock.equals("TRIO");
        }; // Line 1I

        p = (Object lock4) -> {
            return lock4.equals("Chubb");
        }; // Line 6

        //         https://learning.oreilly.com/certifications/9780136808848/
    }

    public static void run(Runner x) {
        System.out.println("In runner");
        x.run();
    }

    public static void run(Runner2 x) {
        System.out.println("In runner2");
        x.run();
    }

    public static void voidMethod() {
        System.out.println("voidMethod");
    }

    public static int intMethod() {
        System.out.println("intMethod");
        return 0;
    }
}

//https://www.examsnet.com/exams/ocjp-certification-practice-online --> JAVA TEST 
//https://learn.oracle.com/education/downloads/Exam808_SampleQuestion.pdf?intcmp=WWOUCERTBLOGBBTYJK050219

/*
1 --> d tacno 
2 --> c,d tacno
3 --> c netacno | A
4 -->  b tacno ----
5 -->  c tacno
6 --> b tacno
7 -->  c netacno | D zbog compile time errora subclass nmz ispred superclasse
8 --> d  netacno | C
 */
abstract class Writer {

    public static void write() {
        System.out.println("Writing...");
    }
}

class Author extends Writer {

    public static void write() {
        System.out.println("Writing book");
    }
}

class Programmer extends Writer {

    public static void write() {
        System.out.println("Writing code");
    }

    public static void main(String[] args) {
        Writer w = new Programmer();
        w.write();
    }
}

class SuperSaid extends Exception {

    @Override
    public String getLocalizedMessage() {
        return "SuperSaid class exception";
    }
}

class SubSaid extends SuperSaid {

    @Override
    public String getMessage() {
        return "SubSaid class exception";
    }
}

class Test {

    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        try {
            for (int z = 2; z >= 0; z--) {
                int ans = x / z;
                System.out.print(ans + " ");
            }
            throw new SubSaid();
        } catch (SubSaid e1) {
            System.out.println("E1");
        } catch (SuperSaid e1) {
            System.out.println("E2");
        }
    }
}

/*
int i, j; for (j = 100; i < j; j--) { i += 2; }
 */
class Program {

    static Double i;
    static Float f;

    public static void main(String[] args) {

        String lol = "Said";

        try {
            int k = 2;
            Float fl = Float.valueOf(k);
            Integer result = Integer.valueOf(-1);
            int primInt = result.intValue();
            Float floatenzi = (float) k;
            Float fff = (float) k; // ekvivalentno Float fff = Float.valueOf(); ne moze Float fff = Integer.valueOf();

            Integer inty = Integer.valueOf(k);

            // error Float ff = k;
            int x = 127;
            int y = 127;

            System.out.println("BOOLEAN");
            System.out.println(x == y);
            Float.valueOf(k);
            System.out.println(lol.compareTo("Aaid"));
            int numCompare = "Baid".compareTo("Caid");
            System.out.println(numCompare);
            System.out.println("----------------------------------");
            System.out.println(i.compareTo(0.0));
            System.out.println(f.compareTo(42f));
        } catch (ArithmeticException | NullPointerException ex) {
            System.out.println("Exception!");
        }

        int $_8_ = 34;
        int _ = 24;
        int $ = 4;
        System.out.println(_);
    }
}
