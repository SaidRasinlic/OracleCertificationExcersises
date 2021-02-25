package oracle;

public class Recursion2020 {

    public int value = 0;

    public static void counter(int start, Recursion2020 stop) {
        System.out.println("HEy I am called" + stop.value);
        if (stop.value >= start) {
            return;
        }
        stop.value++;
        counter(start--, stop);
    }

    public static void main(String[] args) {
        Recursion2020 stop = new Recursion2020();
        stop.value = 3; //3,4,5,6,7,8,9,10,11,12,  | 

        int start = 12;//12,11,10,9,8,7,6,5,4,3,   |
        counter(start, stop);
    }
}