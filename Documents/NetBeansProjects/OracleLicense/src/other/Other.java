package other;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Other {

    static String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

    public static String hello = "Hello";

    public static void main() throws Exception {
    }

    {

        Object o = null;
        Collection c = null;
        int[][] ia = {{}, {}};

        for (int i : ia[0]) {
            System.out.println(i);
        }

        Collection<String> col = new ArrayList<>();

        col.add("said");
        col.add("senad");
        col.add("lamija");

        Iterator it = col.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /*int index = 0;
        for (String day : days) {
            if (index == 3) {
                break;
            } else {
                continue;
            }
            index++;   unreachable statement pogledaj gore breaka ako je index 3 a on je neizbjezan jer iterira kroz ove sve dane
            if (days[index].length() > 3) {
                days[index] = day.substring(0, 3);
            }
        }
        System.out.println(days[index]);
    } */
        int i = 0;
        for (i = 1;i < 5; i++) {
            continue;  //(1)
        }
        for (i = 0;i < 10; i++) {
            System.out.println(i);
            break;       //(2)
        }
        for (; i < 5 ? false : true;);     //(3

        B b1 = new B();

        System.out.println(b1.B("SAID"));

    }
}
