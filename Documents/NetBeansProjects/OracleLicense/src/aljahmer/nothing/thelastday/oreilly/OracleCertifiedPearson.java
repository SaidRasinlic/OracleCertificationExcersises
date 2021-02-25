package aljahmer.nothing.thelastday.oreilly;

import static aljahmer.nothing.thelastday.oreilly.Clss.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class OracleCertifiedPearson {

    public static void main(String[] args) {

        Integer inty = 3; // == Integer.valueOf(); string i int.. 
        inty.valueOf(inty.intValue() + 1);
        Byte byty = 127;
        short s = 300; // Line 1
        Integer i = 500;
        int hh = 33;//Line 2
        Long l = Long.valueOf(hh);
        Long lengg = inty.longValue();
        Long.valueOf(i);
        Long leng = new Long(33);
        Short shorty = new Short((short) 2);
        Short.valueOf((short) 22);
        
        Short sh = Short.valueOf((short)20);
        Long len = new Long(i);
        for (int ix = 0, j = 100; ix < j; ix++, --j) {;
        }
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length());
        StringBuilder sb3 = new StringBuilder("Said");
        System.out.println(sb3.length());
        System.out.println("--------------");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("01234567890123433567");
        System.out.println(sb2);
        System.out.println(sb1);
        OracleCertifiedPearson obj = new OracleCertifiedPearson();
        String name2 = "Said";
        System.out.println(name == name2);
        System.out.println(name2.compareTo(name.toString())); // -32
        StringBuilder sbuilder = new StringBuilder();
        System.out.println(sbuilder.capacity());
        sbuilder.append("Saidolehancic");
        System.out.println(sbuilder.capacity());
        sbuilder.ensureCapacity(32);
        System.out.println(sbuilder.capacity());
        System.out.println(".................................");
        StringBuilder build = new StringBuilder("Tuts point");
        System.out.println(build);
        System.out.println(build.capacity());
        System.out.println(build.length());
        System.out.println("............................");
        System.out.println(build.indexOf(" "));
        System.out.println("---------------------------------");
        StringBuilder bald = new StringBuilder(5);
        System.out.println(bald.capacity());
        bald.append("123456");
        System.out.println(bald.capacity());
        bald.append("78901234562343677736");
        System.out.println(bald.length());
        System.out.println(bald.capacity());
        bald.append("s");
        System.out.println(bald.capacity());
        build.insert(0, "ja sam umetnueeet ovdje");
        System.out.println(build);
        System.out.println(build.capacity());
        System.out.println(build.length());
        LocalDate date = LocalDate.of(2015, 11, 1);
        System.out.println(date);
        System.out.println("---------------");
        System.out.println(date.withYear(2021).withDayOfYear(64).withDayOfMonth(31));
        System.out.println(date.withYear(2021).withDayOfMonth(30).withDayOfYear(30));
        System.out.println("....................");
        System.out.println(date.withYear(2021).withDayOfYear(32));
        System.out.println(date.withYear(2021).withDayOfMonth(30));
        System.out.println(date.plusDays(2).plusMonths(1).plusYears(2));
        System.out.println("-------------------");
        LocalTime noon = LocalTime.NOON;
        LocalTime midnight = LocalTime.MIDNIGHT;
        System.out.println(noon);
        noon = noon.withHour(10).plusMinutes(120);
        System.out.println(noon);
        System.out.println(".......................");
        System.out.println(midnight);
        midnight = midnight.withHour(10).plusMinutes(120);
        System.out.println(midnight);
        //System.out.println(time.plusMinutes(60));
        // System.out.println(time.plusHours(11));
        System.out.println("-------------------");
        noon = LocalTime.MAX;
        System.out.println(noon);
        
     
    }
}
// 42,47

class Clss {

    static CharSequence name = "said";
}
