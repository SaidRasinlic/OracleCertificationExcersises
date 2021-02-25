package aljahmer.nothing.thelastday.points;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class FunctionalBroski {

    int age;

    public FunctionalBroski(int age) {
        this.age = age;
    }

    public FunctionalBroski() {
    }

    public static void functionalBroski(ArrayList<FunctionalBroski> arrList, Predicate<FunctionalBroski> t) {
        Iterator<FunctionalBroski> it = arrList.iterator();
        while (it.hasNext()) {
            if (t.test(it.next())) {
                it.remove();
            }
        }
    }

    @Override
    public String toString() {
        return "" + age;
    }

    public static void main(String[] args) {

        ArrayList arrList = new ArrayList();
        arrList.ensureCapacity(3);
        arrList.add(0, new FunctionalBroski(1));
        arrList.add(1, new FunctionalBroski(2));
        arrList.add(2, new FunctionalBroski(3));
        arrList.add(3, new FunctionalBroski(4));
        arrList.add(new FunctionalBroski(35));

        functionalBroski(arrList, (FunctionalBroski t) -> {
            return t.age < 0;
        });

        //functionalBroski(arrList, (FunctionalBroski t) -> t.age < 0);
        System.out.println(arrList);
    }
}
//https://coderanch.com/t/668480/certification/lambda-Chapter-pg-Java-OCA

@FunctionalInterface
interface Climb {

    boolean isTooHigh(int height, int limit);
}

class Climber {

    public static void main(String[] args) {

        Climb clll = new Climb() {
            @Override
            public boolean isTooHigh(int height, int limit) {
                return height > limit;

            }
        };

        Climb climb = (int height, int limit) -> {
            return height > limit;
        };
        System.out.println(climb.isTooHigh(10, 5));
        System.out.println("-------------SSSSSSSSSSSSSSSSS---------");
        Climb climb2 = (height, limit) -> {
            return height > limit;
        };

        check(climb, 91);
        System.out.println("--------");

        check((int h, int l) -> {
            return h > l;
        }, 5);
        System.out.println("ˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇˇ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        //check((h, l) -> h > l, 5);
        check((h, l) -> h >= l, 10);
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10)) {
            System.out.println("too high");
        } else {
            System.out.println("ok");
        }
    }
}
