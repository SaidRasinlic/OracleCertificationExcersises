package oracleclasses;

public class OrderTest implements TesterInterface {

    OrderTest OrderTesrt() {
        System.out.println("OrderTest povratni tip");
        return this;
    }
    ;
    
    
   static int rrr = 0;
    private int myValue = 0;

    public void showOne(int myValue) {
        myValue = myValue;
        System.out.println(this.myValue);
    }

    static void haha() {
        System.out.println("ORDER TEST HAHA STATIC ONE");
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void compute() {
        System.out.println("DEFAULT FROM ORDERTEST");
    }

    public void initData(String[] arr) {
        int ind = 0;
        for (String str : arr) {
            str.concat(str + " " + ind);
            ind++;
        }
    }

    public void printData(String[] arr) {
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        OrderTest ot = new OrderTest();
        String[] arr = new String[2];

    
        
        ot.showOne(100);
        TesterInterface.haha();
        haha();
        ot.compute();

        String str = "";
        String abc = "Said ";
        String x = abc.concat("Rasinlic");
        abc.concat("def");
        System.out.println(abc);
        System.out.println("--------------------------------");
        System.out.println(x);

        String name = "Said";
        String name2 = "Said";
        

        String s = (name == name2) ? "TRUE" : "FALSE";
        System.out.println(s);
        System.out.println(name);

        System.out.println("--------------------------------------------");
        String st = "String";
        String st2 = new String("String");
        System.out.println(st == st2);
        String st3 = st2.intern();
        System.out.println(st == st3);

        int bin = 0b1111_0000_1100_1100;
        float f = 9898_7878.9999333_39333999999999999999999993333f;
        System.out.println(bin);
        System.out.println(f);

    }

    @Override
    public void xD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hehe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
//objekti se kreiraju u heap memoriji a reference u stack memoriji
