package aljahmer.nothing.thelastday.points;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import aljahmer.nothing.thelastday.oreilly.*;

class Data {


    transient int hoho;
    volatile int lol;
    int value;

    native void lol();

    synchronized void xd() {
    }

    public Data(int x) {
        this.value = x;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}

/*class MyFilter {

    public boolean test(Data d) {
        return d.value == 0;
    }
}
 */
class TestClass extends ComputerLaptopConstructor {

    public static void filterData(ArrayList<Data> dataList, Predicate<Data> f) {
        Iterator<Data> i = dataList.iterator();
        while (i.hasNext()) {
            if (f.test(i.next())) {
                i.remove();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Data> al = new ArrayList<>();
        Data d = new Data(1);
        al.add(d);
        d = new Data(2);
        al.add(d);
        d = new Data(0);
        al.add(d);
        //filterData(al, new MyFilter());  //1     
        filterData(al, x -> x.value > 0);
        System.out.println(al);

        ComputerLaptopConstructor obj = new TestClass();
        //ComputerLaptopConstructor obj2 = new ComputerLaptopConstructor();
        TestClass tc = new TestClass();
        // System.out.println(obj.omg);

        System.out.println(tc.omg);

    }
}
