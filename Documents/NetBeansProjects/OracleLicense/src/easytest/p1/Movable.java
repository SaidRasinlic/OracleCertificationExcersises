package easytest.p1;

public interface Movable {

    int location = 0;

    void move(int by);

    public void moveBack(int by);
}

class CorbaComponent {

    String ior;

    CorbaComponent() {
        startUp("IOR");
      
    }

    void startUp(String s) {
        ior = s;
    }

    void print() {
        System.out.println(ior);
    }
}

class OrderManager extends CorbaComponent {

    OrderManager() {
     
    }

    void startUp(String s) {
        ior = getIORFromURL(s);
    }

    String getIORFromURL(String s) {
        return "URL://" + s;
    }
}

class Application {

    public static void main(String args[]) {
        start(new OrderManager());
    }

    static void start(CorbaComponent cc) {
        cc.print();
    }
}

