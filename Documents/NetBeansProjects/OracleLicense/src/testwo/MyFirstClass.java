package testwo;

public class MyFirstClass {

    public void printBroski() {
    };

    
    
    public static void main(String[] args) {

        int k = 2;
        do {
            System.out.println(k);
        } while (k-- > 0);

        Object obj1 = new Object();
        Object obj2 = obj1;
        if (obj1.equals(obj2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(obj1 == obj2);
        Object obj3 = new Object();

        Object obj4 = obj3;
        System.out.println(obj4.equals(obj3));

        System.out.println("--------------------------------");

        int i = 0;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool = false;
        boolean bool3 = true;

        bool = (bool2 & method1(i++));
        bool = (bool2 && method1(i++));
        bool = (bool1 | method1(i++));
        bool = (bool1 || method1(i++));
        System.out.println(i);
        System.out.println(".....................................");
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println(b1 & b3);  // vraca true ako su oba true
        System.out.println(b4 | b3); // vraca true ako je jedan od dva operanda true
        System.out.println(b3 && b2); // vraca false ako je lijeva strana false
        System.out.println(b3 || b1); // vraca true ako je lijeva strana true

        Vehicle vehicle = new Vehicle();
        
      
        
        Bike bike = new Bike();
        
        bike = (Bike) vehicle;
        
        bike.move();
        
        Motor motor = new Motor();

        //     motor= (Motor) vehicle; --> Exception in thread "main" java.lang.ClassCastException: testwo.Vehicle cannot be cast to testwo.Motor
      //  vehicle = (Motor) (Vehicle) motor; // isto sto i vehicle= motor
        //vehicle.move();

        System.out.println("-------------------------------");
     
        
      
        
        vehicle = motor;
        
        
        vehicle.move();
        
        System.out.println("------------------ II PART");

        vehicle = bike;

        bike = (Bike) vehicle;
        bike.move();

        /*  Bike bike = new Bike();

        Motor motor = new Motor();

        motor = (Motor) (Vehicle) motor;

        System.out.println(motor);

        bike = (Bike) (Vehicle) bike;

        bike.move();

        vehicle = bike;

        bike.move();
         */
 /*
             Bike bike = (Bike) new Vehicle();
        
      bike.move();
      
        bike = (Bike) vehicle;

        bike.move();
  
         */
 /*    int ia[][] = {{1, 2}, null};
        for (int ii = 0; ii < 2; ii++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(ia[ii][j]);
            }
        }
         */
    }

    public static boolean method1(int i) {
        return i > 0 ? true : false;
    }
}
