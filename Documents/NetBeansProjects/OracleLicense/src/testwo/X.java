package testwo;

public class X {
  
    transient int x;
    volatile int y;
    
    
  

    protected int value = 10;
}

class A {

    public static void sM1() {
        System.out.println("In base STATIC");

        final int i = 66;

        byte b = i;

        int c = 0;
        JACK:
    
        while (c < 8) {
            JILL:
           
            if (c > 3) {
                break JILL;
            } else {
                c++;
            }

        }
    }
}
    class B extends A {
        
        public  static String changeStr(String name){
            name = "Rasinlic";
            return name;
            
        }
        public static void main(String[] args) {
            
          String s = "Said";
          
         
            System.out.println(changeStr(s));
            
        }

    }



