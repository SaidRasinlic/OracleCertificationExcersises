package testwo;

public class Wrapper {

    int w = 10;

    boolean boola;
    Boolean boola1;

    public static void main(String[] args) {
        /*
        int ia[][] = {{1, 2}, {0, 1}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(ia[i][j]);
            }
        }
        System.out.println("----------------");
        int i = 0;
        int j = 1;
       
        if ((i++ == 0) & (j++ == 2)) { // poredi pa inkrementira
            i = 12;
        }
        System.out.println(i + " " + j); // 1 ,2 result
         */

        Wrapper wrapper = new Wrapper();

        System.out.println(wrapper.boola);
        Wrapper.crazyLoopFull();
        boolean bool;
        Boolean bool1;
        int key = 2;

        switch (key) {
            case 1: {
                int value = 1;
                break;
            }
            case 2:
                int value = 2;
                System.out.println(value + "=case2");
                break;
            default:
                break;
        }
        
        wrapper.crazyLoop();
    }

    public static void crazyLoopFull() {
        int c = 0;
        JACK:

        while (c < 8) {
            JILL:
            System.out.println("c = " + c);
            for (int k = 0; k < c; k++) {
                System.out.println(" k = " + k + " c = " + c);

                if (c > 3) {
                    break JACK;
                }
            }
            c++;
        }
    }

    void crazyLoop() {
        int c = 0;
        JACK:
        while (c < 8) {
            JILL:

            System.out.println(c);

            if (c > 3) {
                break JACK;
            } else {
                c++;
            }
        }
    }
}
