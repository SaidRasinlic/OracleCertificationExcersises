package aljahmer;

public class GimmeDatShit {

}


 class C1 {

     static int age = 42;
    static public void M1() {
        System.out.println("C1.M1().");
    }

    static public void main(String ... Args) {
        M1();
    }
}

 class C2 extends C1 {

    static public void M1() {
        System.out.println("C2.M1().");
    }

    static public void main(String ... Args) {
        
      int x =  new C2().age;
        M1();
       C1.main(Args);
    }
}

