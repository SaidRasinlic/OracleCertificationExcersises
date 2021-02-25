package other;

public class BasketClub extends FootballClub {

    String namex;

    public BasketClub(String name, String namex) {
        super(name);
        this.namex = namex;
    }

    public static void main(String[] args) {

        String[][][] arr = {{{"a", "b", "c"}, {"d", "e", null}}, {{"x"}, null}, {{"y"}}, {{"z", "p"}, {}}};
        System.out.println(arr[3][1][0]);

    }

    public String toString() {
        return this.name + " " + this.namex;
    }
}
