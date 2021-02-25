package testwo;

public class Bike extends Vehicle{

    @Override
    void move() {
        System.out.println("Move from the subclass aka Bike");
    }

    public Bike() {

        System.out.println("Bike constructor");
    }

    
}
