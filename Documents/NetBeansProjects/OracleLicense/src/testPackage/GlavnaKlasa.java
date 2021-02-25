package testPackage;

public class GlavnaKlasa {

    {
        if (1 < 10) {
            throw new Exception();
        }
    }

    String name;
    String surname;

    public GlavnaKlasa() throws Exception {
    }

    void pisiNesto() {
        System.out.println("glavna klasa");
    }

    public static void main(String[] args) {

        int[] hh = new int[]{2};

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");

//1
        }
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");  //2
        }
        int i = 20;                  //3
        System.out.print(i + " "); //4

    }

    static int heh243;
    int hrer43;

    static void f() {

        heh243 = 34;

    }

    void f2() {
        hrer43 = 43;
        heh243 = 24535;
    }

}
