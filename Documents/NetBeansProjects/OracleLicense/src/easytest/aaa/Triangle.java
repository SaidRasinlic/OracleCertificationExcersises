package easytest.aaa;

public class Triangle {

    public int base;
    public int height;
    public double area;

    @Override
    public String toString() {

        return area + "";

    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
        updateArea();
    }

    void updateArea() {
        area = base * height / 2;
    }

    public void setBase(int b) {
        base = b;
        updateArea();
    }

    public void setHeight(int h) {
        height = h;
        updateArea();
    }

    public static void main(String[] args) {

      /*  final short shorty = -40;

        byte byty = shorty;

        byte i = -40;
        // No casting needed for below conversion
        short j = i;
        int k = j;
        long l = k;
        float m = l;
        double n = m;
        System.out.println("byte value : " + i);
        System.out.println("short value : " + j);
        System.out.println("int value : " + k);
        System.out.println("long value : " + l);
        System.out.println("float value : " + m);
        System.out.println("double value : " + n);*/

  
      double d = 30.0;
      // Explicit casting is needed for below conversion
      float f = (float) d;
      long l = (long) f;
      int i = (int) l;
      short s = (short) i;
      byte b = (byte) s;
      System.out.println("double value : "+d);
      System.out.println("float value : "+f);
      System.out.println("long value : "+l);
      System.out.println("int value : "+i);
      System.out.println("short value : "+s);
      System.out.println("byte value : "+b);
   
        System.out.println("--------------------");

        Float ff = null;

        try {
            ff = Float.valueOf("12");
            String ss = ff.toString();

            int integ = Integer.parseInt(ss);
            System.out.println("" + integ);
        } catch (Exception e) {
            System.out.println("trouble : " + ff);
        }
    }
}

interface Inty {

    String NAME = "Said";

}

class Some implements Inty {

    int age = 22;

    public static void m1() {
        System.out.println("some");
    }
    void print(){
        System.out.println("SOMEEEEE");
    }

}

class Anotha extends Some implements Inty {

    
    void print(){
        System.out.println("ANOTHAAAAA");
    }
    int age = 23;
    int som = 232;

    public static void m1() {
        System.out.println("anotha");

    }

    public static void main(String[] args) {

        Some som = new Anotha();
        System.out.println(som.age);

        String s = som.NAME;
        System.out.println(s);
        Anotha a = (Anotha) som;

        System.out.println(a.age);

        String s2 = a.NAME;
        System.out.println(s2);
        a.m1();

        Some someBro = new Some();

        Anotha anotha = new Anotha();
        
        someBro = anotha;
        System.out.println("DRUGI DIO");
        someBro.print();
        
        
    }
}
