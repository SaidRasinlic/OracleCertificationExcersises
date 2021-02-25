package aljahmer.nothing.thelastday.points;

public class RecursionBruh {

    public static int happening(int num) {
        if (num == 1) {
            return 1;
        } else {
            return happening(num - 1) + num;  
        }
    }

    public static void main(String[] args) {
        System.out.println(happening(8)); // (8-1) + 8                      3-1+3  

        // System.out.println(happening(7));  (7-1) + 7                     2-1+2
        // System.out.println(happening(6)); (6-1) + 6                       1-1+1
        // System.out.println(happening(5)); (5-1) + 5  
// System.out.println(happening(4)); (4-1) + 4
//   System.out.println(happening(3)); (3-1) + 3
// System.out.println(happening(2)); (2-1) + 2
//  System.out.println(happening(1)); (1-1) + 1 = ovdje vraca 1 jer je 1==1 u if statementu!
    }
}