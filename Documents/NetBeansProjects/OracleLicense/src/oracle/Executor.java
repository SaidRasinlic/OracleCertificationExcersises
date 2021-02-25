package oracle;

/*
 *
 * @author said_rasinlic  // 23.09.2020 Pocetak rada
 *
 */
public class Executor {

    @Override
    public String toString() {
        return "YOOOOOOO";
    }
    
   

    String s=this.toString();
    private double dobNum = 0;

    public static void main(String[] args) throws Exception {

        Executor x = new Executor();
        

        
        BaseClass bc = new BaseClass();
        bc.print();
        DerivedClass dc = new DerivedClass();
        dc.print(2);

        byte byt = -128;
        ++byt;
        System.out.println(++byt);

        A[] a, a1;
        B[] b;
        a = new A[10];
        a1 = a;
        b = new B[20];
        a = b;

        System.out.println(a.length + " length");
        b =  (B[]) a;
        System.out.println(b.length + " LEENNENGGHTHH");
  
        b = (B[]) a1;

        System.out.println(b.length + " ovo je length b");

    }
}
