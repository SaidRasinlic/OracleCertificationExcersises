package testwo;

public class Vehicle {

    void move() {
        System.out.println("move method from the superclass aka Vehicle");
    }
    
    Vehicle(){
        System.out.println("VEHICLE constructor!");
    }

    static void main(String[] args) {

        int ia[][] = {{1, 2}, {1, 2}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(ia[i][j]);
            }
        }

        System.out.println(new JustTest("new test"));

        int a[][] = new int[5][4];

        System.out.println(a[0][1]);
        System.out.println(a[0][1]);
        System.out.println(a[4][3]);

        int a1[][][][] = new int[4][][][];

        int sia[], ba;
        int[] acc[] = new int[5][4];
    }
}

class JustTest extends Vehicle {

    String value = "test";

    JustTest(String val) {
        this.value = val;
    }

    @Override
    public String toString() {
        return this.value;
    }

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
