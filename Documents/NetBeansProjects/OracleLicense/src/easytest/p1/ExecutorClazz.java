package easytest.p1;

import java.util.ArrayList;
import java.util.Arrays;

public class ExecutorClazz {

    private ArrayList<Integer> scores = new ArrayList<>();

    {
        scores.add(9999);
        scores.add(8888);
    }

    private double average;

    private void computeAverage() {
        //valid code to compute average
        // System.out.println(average);
        System.out.println("computAverage();");

    }

    public ArrayList<Integer> getScores() {
        return new ArrayList<>(scores);
    }

    public void setScores(int a) {
        scores.add(a);
    }


    /*  public void setScores(int a) {
        scores.add(a);
    } */
    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    int age;
    String name;

    static int MY_CONS = 21;

    public static void main(String[] args) {

        ExecutorClazz asd = new ExecutorClazz();
        asd.setScores(5);
        asd.setScores(1000);
        ArrayList<Integer> result = asd.getScores();
        System.out.println(result.get(0));

        result.remove(0);

        System.out.println(result.get(0));

        result.remove(0);
        System.out.println(result.get(0));

        result.remove(0);
        System.out.println(result.get(0));

        result.remove(0);
        System.out.println(result.get(0));

      
        /*  Elliptical e = new Elliptical();
        e.setRadius(50);
        e.sum = 300;
        e.setRadius(20);
        e.getRadius();
        System.out.println(""); */
    }

}

/*class BlahBlah extends ExecutorClazz {

    public BlahBlah() {
        this.age = 242;
        MY_CONS = 22;
    }
}

class Ex extends BlahBlah {

    public static void main(String[] args) {

        BlahBlah bla = new BlahBlah();
        bla.age = 242;
    }

    public static void calculate(int x) {
        String val;
        switch (x) {
            case 2:
            default:
                val = "def";
        }
        System.out.println(val);
    }
}
 */
