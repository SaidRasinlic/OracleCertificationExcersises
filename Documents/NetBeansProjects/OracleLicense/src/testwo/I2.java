package testwo;

public interface I2 {

    int VALUE = 2;

    void m1();

    default void m2(){
        System.out.println("ja sam m2 broski!");
    }
   
}
