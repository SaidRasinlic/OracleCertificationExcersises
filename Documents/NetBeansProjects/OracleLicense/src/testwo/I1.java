package testwo;

public interface I1 {

   final int VALUE = 1;

    void m1();
    
    default void m2(){
        System.out.println("ja sam m1 broski");
    }
    
    
}
