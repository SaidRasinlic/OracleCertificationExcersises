package aljahmer.nothing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.function.Predicate;

public class ShittyExceptions {

}

class MyException extends Exception {
}

class Tc {

    public static void main(String[] args) throws MyException {
        Tc tc = new Tc();
        /*   try {
            tc.m1();
        } catch (MyException e) {
            try {
                tc.m1();
            } catch (MyException ex) {
                ex.printStackTrace();
            }
        } finally {
            tc.m2();
        }
         */
        Short shorty = new Short((short) 10);
        Byte bytey = new Byte((byte) 10);

        System.out.println(shorty instanceof Short);

        short s = 9;
        Boolean b = bytey instanceof Number;

        Object ob = new String("ssa");
        System.out.println(ob);
    }

    public void m1() throws MyException {
        throw new MyException();
    }

    public void m2() throws RuntimeException {
        throw new NullPointerException();
    }
}

class Data {

    int value;

    public Data(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value + " ";
    }
}

class TestData {

    public static void filterData(ArrayList<Data> dataList, Predicate<Data> test) {
        Iterator<Data> i = dataList.iterator();
        System.out.println(dataList);
        while (i.hasNext()) {
            if (test.equals(i.next())) {
                i.remove();
            }
        }
        System.out.println(dataList);
    }

    public static void main(String[] args) {

        ArrayList<Data> dataList = new ArrayList<>();
        Data d = new Data(1);
        dataList.add(d);
        d = new Data(2);
        dataList.add(d);
        d = new Data(3);
        dataList.add(d);
        d = new Data(3);
        dataList.add(d);
        filterData(dataList, (Predicate<Data>) x -> (x.value) == 0);

    }
}

class T implements Runnable {

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class Z extends T implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {

        T t = new T();
        Z z = new Z();

        Object o = t;
        Object o2 = z;

        Runnable r = (Runnable) o;

        Runnable r2 = (Runnable) o2;

        Clazz3 clazz3 = new Clazz3();

        Clazz2 clazz2 = new Clazz2();

        Clazz1 clazz1 = new Clazz1();

        clazz2 = (Clazz2) (NonLifer) (Clazz2) (Clazz1) clazz2;

        clazz1 = (Clazz2) (NonLifer) clazz3;
        clazz1.yo();

        NonLifer nl = clazz3;

        int[] arr = {1, 2, 3, 4, 5, 6};
        int counter = 0;
        for (int value : arr) {
            if (counter >= 5) {
                break;
            } else {
              
            }
            if (value > 4) {
                arr[counter] = value + 1;
            }
            counter++;
        }
        System.out.println(arr[counter]);
        
        int xxx = 43;
        
        long lll = xxx;
        
        
        int ewe = (int) lll;
        
       
    }

}





interface NonLifer {

    void yo();
}

class Clazz1 implements NonLifer {

    @Override
    public void yo() {
        System.out.println("CLAZZ 1");
    }

}

class Clazz2 extends Clazz1 {

    @Override
    public void yo() {
        System.out.println("CLAZZ 2");
    }

}

class Clazz3 extends Clazz2 {

    
    public double methodX( byte by){
    double d = 10.0;
    return (long) by/d*3;
}
    
    @Override
    public void yo() {
        System.out.println("CLAZZ 3");
    }

}
