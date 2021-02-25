package other;

public class Triangle {

    public int base;
    public int height;
    public double area;

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

    public double getArea() {
        return area;
    }
    
    static int x;

    static String y ="Said";
    public static void main(String[] args) {

        Triangle tr = new Triangle(10, 5);

        System.out.println(Triangle.x);
        
        String s = Triangle.y;
        
        System.out.println(new Boolean("trUE"));
        
        System.out.println(Boolean.parseBoolean("TRUe"));
        System.out.println(Boolean.valueOf(Boolean.FALSE));
        
        tr.setBase(6);
        tr.setHeight(2);
        System.out.println(tr.getArea());
    }
}
