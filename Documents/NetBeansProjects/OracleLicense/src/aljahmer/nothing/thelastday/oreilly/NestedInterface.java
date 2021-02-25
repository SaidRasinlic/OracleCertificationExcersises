package aljahmer.nothing.thelastday.oreilly;

public interface NestedInterface {

    static void saySomething(){
        System.out.println("im saying man im the outer one");
    }
    
     static interface TheSoul {

        default void hi() {
            System.out.println("hi");
        }
    }
     
     public static void main (String [] args){
         
        NestedInterface.TheSoul soul = new NestedInterface.TheSoul() {
     
        };
        
         soul.hi();
     }
}
