package aljahmer.nothing.thelastday.points;

import java.util.ArrayList;
import java.util.List;

public class DateClazz {

    private final int years;
    private final int months;
    private final int days;

    private static final DateClazz ZERO = new DateClazz(0, 0, 0);

    private static DateClazz create(int years, int months, int days) {
        if ((years | months | days) == 0) {
            System.out.println("ZEROOO");
            return ZERO;
        }
        return new DateClazz(years, months, days);
    }

    private DateClazz(int years, int months, int days) {
        this.years = years;
        this.months = months;
        this.days = days;
    }

    @Override
    public String toString(DateClazz this) {
        if (this == ZERO) {
            return "P0D";
        } else {
            StringBuilder buf = new StringBuilder();
            buf.append('P');
            if (years != 0) {
                buf.append(years).append('Y');
            }
            if (months != 0) {
                buf.append(months).append('M');
            }
            if (days != 0) {
                buf.append(days).append('D');
            }
            return buf.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(DateClazz.create(0, 0, 10));
    }
}

interface DontKnow {
    public void doTheShit(DontKnow this);
}

class MaybeIKnow {

    public static int returnInteger() {
        System.out.println("returning integer broski");
        return 20;
    }

    public static void returnVoid() {
        System.out.println("returning void broski!");
    }

    public static void main(String[] args) {
        DontKnow dk = () -> {
        };
        DontKnow dk2 = () -> {
            System.out.println("void DontKnow interface with no params");
            return;
        };

        dk2.doTheShit();
        List<String> arr = new ArrayList<>();
    }
}

@FunctionalInterface
interface Ull {
    String yoStr(String string);
}

class UllCLazz {

    public String add(Ull ull, String str) {
        return ull.yoStr(str);
    }

    public static void main(String[] args) {

        Ull ull = (str) -> {
            return str + "Long version of lambda";
        };
        Ull ully = _s -> _s + "as";
        Ull ull2 = pr -> "" + pr + "Short version of lambda ";
        System.out.println(ull2.yoStr("9035032u584572045240834 "));

        Ull ull4 = (String d) -> {
            return d + " ---> ttt";
        };

        Ull ull5 = s -> {
            return s + " ooh booy one param interface";
        };
        System.out.println(ull4.yoStr("laslalsa"));
        System.out.println("----------");
        UllCLazz ullClazz = new UllCLazz();
        System.out.println(ullClazz.add(ull, "klaskjsjs"));
        String clcllc = ullClazz.add((String s) -> {
            return "_____" + s + " BROO -------------><>>><><<><><><><><><><><><><><>";
        }, "21212121 " + "hohoho marry x-mass broski");
        ullClazz.add(ull, "we");
        System.out.println(clcllc);
        System.out.println(ullClazz.add((String s) -> s + "33", "hoho5345345345435345345435ho marry x-mass broski"));
        System.out.println(ullClazz.add(ssa -> " " + ssa, "MARRY XMASSS --------------------------"));
        ullClazz.add((String str) -> "" + str, "w");

        Ull ull7 = new Ull() {
            @Override
            public String yoStr(String string) {
                return "" + string + " bro this is overriden anonymous class aka lambda anonymous clazz ahaha";
            }
        };
        /*
         Ull ull7 = (String string) -> string + " bro this is overriden anonymous class aka lambda anonymous clazz ahaha";
         */
        System.out.println(ull7.yoStr("xaaxaxaxaxaxa"));
        System.out.println(new UllCLazz().add(ull7, "lol bro this is param ------>"));

        Ull ull3 = (String string) -> {
            return string + ", explicit full params,the longest version of lambda";
        };
        System.out.println(ull3.yoStr("the last i swear"));

        UllCLazz uz = new UllCLazz();

        System.out.println(uz.add(new Ull() {
            @Override
            public String yoStr(String string) {
                return string;
            }
        }, "new Interface anonymous parameter"));

        System.out.println(ull3.yoStr("23"));

        ull3.yoStr("eew");
        uz.add(ull3, "awa");

    }
}
/*
   public String add(Ull ull, String str) {
        return ull.yoStr(str);
    }
@FunctionalInterface
interface Ull {
    String yoStr(String string);
}
 */
