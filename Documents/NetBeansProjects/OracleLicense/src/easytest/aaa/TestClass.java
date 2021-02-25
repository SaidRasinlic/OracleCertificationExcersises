package easytest.aaa;

public class TestClass {

    public static void main(String args[]) {
      C c = new C();
        
      boolean b = new Boolean("true") == Boolean.parseBoolean("true");
        
        System.out.println(new Boolean("false") == Boolean.valueOf(Boolean.FALSE));
      
        System.out.println(c.max(10, 20));
    }
}

class A {
    
    static void hello(){
        System.out.println("AA");
    }
    String name = "Said";
    int age =44;

    int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}

class B extends A {
    
    static void hello (){System.out.println("hello");}

    int age = 55;
    
    int max(int x, int y) {
        return 2 * super.max(x, y);
    }
}

class C extends B {

    
    int c = 353;
    int max(int x, int y) {
        return super.max(2 * x, 2 * y);
    }
}
