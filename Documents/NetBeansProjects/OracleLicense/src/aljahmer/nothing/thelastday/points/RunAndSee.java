package aljahmer.nothing.thelastday.points;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

/*class anothermain {
    public static void main(String[] args) {
        System.out.println("hello2");
    }
}

class main {

    public final static void main(String[] args) {
        System.out.println("hello");
    }
}
 */
public class RunAndSee {

    public static int lol;

    int x;

    public RunAndSee(int x) {
        this.x = x;
    }

    public RunAndSee() {
    }

    public static void main(String[] args) {

        System.out.println("BROOO ITS FROM RUNANDSEE!");
        String newargs[][] = {{}, {}};
        System.out.println(newargs.length);
        Integer in = new Integer(2);
        Integer in2 = new Integer(2);
        System.out.println(in.equals(in2));
        RunAndSee run = new RunAndSee(2);
        RunAndSee run2 = new RunAndSee(2);
        System.out.println(run.equals(run2));
        System.out.println(run.hashCode());
        System.out.println(run2.hashCode());

        short p = 2;
        byte k = 24;
        int i = p + k;

        System.out.println(i);
        Integer integ = new Integer(10);
        Object obj = 2;

        boolean b = new Boolean(null);
        System.out.println(b);
        String str = null;
        System.out.println(str);
        str += 'd';
        String a = "g";
        final String ch = "g";
        String r = "" + ch; //ch is not a constant
        System.out.println(a == r); //prints false
        String s = null;
        System.out.println("---------------------------");
        String someOtha = null;
        System.out.println(str == someOtha);
        String hello = "Hello";
        final String lo = "lo";
        System.out.println(hello == ("Hel" + "lo"));
        System.out.println(hidePhone("061-022-5867"));
        StringBuilder sb = new StringBuilder(132132);
        sb.ensureCapacity(3232);
        int[] art = {1, 2, 3, 4};
        int[] brt = {2, 3, 1, 0};
        System.out.println(art[(art = brt)[3]]);
        int index = 1;
        try {
            ++getArray()[index = 2];
        } catch (Exception e) {
            //empty catch     
            System.out.println("index = " + index);
        }
        Long lone = new Long(232);
        Integer intgr = new Integer(56);
        Byte byt = new Byte((byte) 232);
        run.wtf();
        System.out.println(run.wtfvar);
        String lol = "Said".replaceFirst("\\w", "HELLO");
        System.out.println(lol);  //helloaid only first letter
        int x = 22;
        int y = 343;
        System.out.println(29 & 2);
        StringBuffer sbr = new StringBuffer("0123456789");
        sbr.replace(3, 7, "said");
        System.out.println(sbr);
        int inmax = Integer.MAX_VALUE;
        int inlow = Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(inmax));
        System.out.println(Integer.toBinaryString(inlow));
        final short shorty = Short.MAX_VALUE;
        char c = shorty;
        System.out.println(c == Short.MAX_VALUE);
        System.out.println((int) Character.MAX_VALUE);
        System.out.println("CHARACTERRR");
        float eli = 9999999999999999999999f;
        double f = eli;
        System.out.println(eli - (float) f);
        double big = 1234567890;
        float approx = (float) big;
        System.out.println(big + " " + approx);
        int xol = 335;
        char col = 22;
        char xx = col *= xol;

        System.out.println((int) xx);
        ArrayList arr1 = new ArrayList();

        arr1.add("Said");
        arr1.add("Said2");
        arr1.add("Said3");
        ArrayList arr2 = new ArrayList(arr1.subList(0, 3));
        arr1.add(1, "Rasinlic");
        System.out.println("-------------------");
        System.out.println(arr2);
        arr1.addAll(arr2);
        System.out.println(arr1);
        System.out.println("LOCALLLLLL TIMEMEEEEE LEZGGOOOOO");
        LocalDate ld = LocalDate.from(LocalDate.now());
        System.out.println(ld);
        LocalDate led = LocalDate.now(ZoneId.systemDefault());
        System.out.println(led);
        LocalDateTime led2 = LocalDateTime.parse("2015-01-14T14:32:22", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(led2);
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = LocalTime.parse("14:40:56", DateTimeFormatter.ISO_TIME);
        System.out.println(lt);
        ZonedDateTime zndt = ZonedDateTime.now(ZoneId.systemDefault());
        System.out.println(zndt);
        ZonedDateTime zndt3 = ZonedDateTime.parse("2020-12-15T14:42:33+01:00[Europe/Belgrade]", DateTimeFormatter.ISO_ZONED_DATE_TIME);
        System.out.println(zndt3);
        System.out.println(Short.MAX_VALUE + " " + Short.MIN_VALUE);
        int itr = 1234567890;
        float frt = itr;
        double ffit = frt;
        System.out.println(itr);
        System.out.println(frt);
        System.out.println(ffit);
        LocalDate newDate = ld.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(newDate);
    }

    static int wtfvar;

    public static int[] getArray() {
        return null;
    }

    static void wtf() {
        System.out.println("Yo dafuq");
    }

    public static String hidePhone(String fullPhoneNumber) {
        return new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 8).toString();
    }
}