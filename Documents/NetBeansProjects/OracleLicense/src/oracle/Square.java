package oracle;

public class Square   {

    private double side = 0;  // LINE 2
    public final static String EMAIL = "saidrasinlic@outlook.com";

    public static void main(String[] args) {   // LINE 4

        Square sq = new Square();  // LINE 5
        sq.side = 10;  // LINE 6

        System.out.println(EMAIL);

        int[] arrayNum = {12, 13, 14, 15};
        for (int num : arrayNum) {
            int x = 0;
            while (x < arrayNum.length) {
                System.out.println(x + " " + num);
                x++;
            }
            System.out.println("HELLO");
        }

        byte b = 127; // -128
    }

   
}
