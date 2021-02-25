package testwo;

public class TestClass implements I1, I2 {

    @Override
    public void m2() {
        I2.super.m2(); //To change body of generated methods, choose Tools | Templates.
    }

    static Wrapper changeWrapper(Wrapper w) {
        w = new Wrapper();
        w.w += 9;
        return w;
    }

    public static void main(String[] args) {

        Wrapper w = new Wrapper();
        w.w = 20;
        changeWrapper(w);
        w.w += 30;
        System.out.println(w.w);
        w = changeWrapper(w);
        // Wrapper x = changeWrapper(w);
        System.out.println(w.w);
        // System.out.println(x.w);

        TestClass tc = new TestClass();

        ((I1) tc).m2();
        ((I1) tc).m2();
        System.out.println(((I2) tc).VALUE);

        // tc.m1();
        ((I1) tc).m1();

        //  System.out.println(((I1) tc).VALUE);
        /*      if (args.length != 0) {
           
            System.out.println(args[args.length - 1]);
        }
        
       int x = Integer.valueOf(args.length);  // 0
      
   

        int i = args.length;
        if (i != 0) {
            System.out.println(args[i - 1]);
        }
         

        int i = args.length - 1;
        if (i > 0) {
            System.out.println(args[i]);
        }     
        // Runtime.getRuntime().gc();
        //System.gc();
        try {
            System.out.println(args[args.length - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
        }
         */
        Base[] base, base1;

        Derived[] derived;

        base = new Base[10];
        base1 = base;
        derived = new Derived[20];
        System.out.println(base.length + " BASE LENGTH");

        base = derived;
        
        System.out.println(base.length);

        derived = (Derived[]) base;
        
        // derived = (Derived[]) (Base[]) base;

        System.out.println(derived.length);

        // derived = (Derived[]) base1;
    }

    @Override
    public void m1() {
        System.out.println("Hello!");
    }
}
