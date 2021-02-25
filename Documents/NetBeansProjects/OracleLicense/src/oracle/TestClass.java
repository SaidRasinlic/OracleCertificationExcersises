package oracle;

import java.util.Objects;

public class TestClass {  //extends A

    public TestClass(String name) {
        System.out.println(name);
    }

    void hello() {
        System.out.println("HELLO FROM TESTCLASSS");
        name.hashCode();

    }
    String name;
    int age = 20;
    char c;

    public void m1() {
        char[] cA = {'a', 'b'};
        m2(c, cA);
        System.out.println(((int) c) + "," + cA[1] + " UNUTAR M1");
    }

    public void m2(char c, char cAr[]) {
        c = 'b';
        cAr = new char[(int) c];
        cAr[1] = cAr[0] = 'm';
        System.out.println(((int) c) + "," + cAr[1] + "," + cAr[(int) 0] + " UNUTAR M2");
    }

    void print() {
        String[] array = {"Said", "CEO"};
        changeArr(10, array);
        System.out.println(age + "," + array[1]);
    }

    void changeArr(int age, String[] array) {
        age = 99;
        array[0] = array[1] = "Rasinlic";

    }

    static void changeContent(String[] arr) {

        arr[0] = "Rasinlic";
    }                                  // mijenja u MAINU  

    static void changeReference(String[] arr) {

        arr = new String[2];
        arr[1] = "Said"; // NE MIJENJA U MAINU 

    }

    public void method1() throws Throwable {
        throw new Throwable("IM THROWABLE");
    }

    //https://javarevisited.blogspot.com/2011/10/override-hashcode-in-java-example.html
    public static void main(String[] args) throws Throwable {

        /*   String blue = "blue";
        String red = "blue";
        System.out.println(blue.equals(red));
        System.out.println(blue == red);
         */
        TestClass t1 = new TestClass("t5551");

        TestClass t2 = new TestClass("t2");

        System.out.println(t1.equals(t2));

        System.out.println(t1 == t2);

        System.out.println(t1.hashCode());

        System.out.println(t2.hashCode());

        String s1 = new String("Said");
        String s2 = new String("Said");

        System.out.println(s1.hashCode());

        System.out.println(s2.hashCode());

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        /*
        System.out.print(t1 == t2);
        System.out.println(" [==]");
        System.out.println(t1.equals(t2) + " [EQUALS]");
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t1.hashCode() == t2.hashCode());
        System.out.println("II Dio -------------------------------------------------------------------- II DIO ");
        new TestClass("m1 method void: ").m1();
        new TestClass("print method aka void").print();
        String array[] = new String[2];
        array[0] = "Messi";
        array[1] = "Ronaldo";

        System.out.println(array[0] + " prije poziva changeContent");
        changeContent(array);
        System.out.println(array[0] + " poslije poziva changeContent");
        System.out.println(array[1] + " changeReference PRIJE");
        changeReference(array);
        System.out.println(array[1] + " changeReference POSLIJE");

        int t = 0;
        switch (t) {
            case 0:
                boolean b = false;
                System.out.println("CASE 0 " + b);
                break;
            case 1:
                b = true;
                System.out.println("CASE 1 " + b);
                break;
            default:
                System.out.println("NISTA OD OVOGA PROMJENI BROJ..");
        }
        /*
         */
        
        int x = 10;
        
       
        
        new TestClass("Said").printThem();

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TestClass other = (TestClass) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    int k = 5;

    public boolean checkIt(int k) {
        return this.k-- > 0 ? true : false;
    }

    public void printThem() {
        while (checkIt(k)) {
            System.out.print(k);
        }
    }
}
