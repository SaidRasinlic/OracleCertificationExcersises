package aljahmer.nothing.thelastday.points;

public class OracleOfficial {

}

class Pointer {

    @Override
    public String toString() {
        return "troll";
    }

    String pt = this.toString();
    int x, y;

    Pointer(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {

        System.out.println(new Pointer(5, 5).pt);
    }
}

class ColoredPoint extends Pointer {

    static final int WHITE = 0, BLACK = 1;
    int color = 243;

    /* ColoredPoint(int x, int y) {
        this(x, y, color);  // Changed to color from WHITE
    } */
    ColoredPoint(int x, int y, int color) {
        super(x, y);
        this.color = color;
    }
    //https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#d5e14278

    @Override
    public String toString() {
        return x + " " + y + " " + color;
    }

public static void main(String[] args) {

    // System.out.println(new ColoredPoint(10, 20));
    }
}
