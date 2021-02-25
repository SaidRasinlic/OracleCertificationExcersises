package aljahmer.nothing.thelastday.points;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class InterfaceNumberTwo {

    public static void main(String[] args) {

        Buyer.ticketBuyer((x, y) -> x >= y, 18);
        AgeValidity av = (age, ageLimit) -> {
            return age > ageLimit;
        };

        AgeValidity av2 = (a, l) -> a >= l;
        System.out.println(av.ageCheck(10, 20));
        System.out.println("--------");
        Buyer.ticketBuyer(av2, 18);
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.plus(Period.ofMonths(1).ofDays(1).ofYears(51).ofYears(1)));  // <---------- Period
        String name = "Saidovski";
        System.out.println(name.indexOf("v"));
        System.out.println(name.charAt(5));
        java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01").minusMonths(1);
        System.out.println(dt);
        java.time.LocalDate dt2 = java.time.LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1);
        System.out.println(dt2);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(LocalDateTime.parse("2020-12-18T15:05:03", DateTimeFormatter.ISO_DATE_TIME));
        
        System.out.println("OVOOOOO IZNADADJAKHDAIUDHAUIDAGHUIHFIAFH");

        System.out.println(LocalDateTime.of(2020, Month.NOVEMBER, 30, 21, 50));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30, 43);
        String formattedDateTime = dateTime.format(DateTimeFormatter.ISO_TIME); // "1986-04-08 12:30"
        String formattedDateTime2 = dateTime.format(formatter);
        System.out.println(formattedDateTime);
        System.out.println(formattedDateTime2);

        List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5);
        Integer[] targetArray = sourceList.toArray(new Integer[0]);
        System.out.println(targetArray[5]);

        LocalDate ladldl = LocalDate.now();

        Period pr = Period.between(ladldl, dt2);
        System.out.println(pr);

        try {
            String myName = "Said";
            System.out.println(myName.charAt(4));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

//https://www.flashcardmachine.com/java-certocajse8chapter3corejavaapis.html
//https://javajee.com/quiz-category/java-programmer-i?page=27
    }
}

@FunctionalInterface
interface AgeValidity {

    public boolean ageCheck(int age, int ageLimit);
}

class Buyer {

    private final int x;

    public Buyer(int x) {
        this.x = x;
    }

    public static void ticketBuyer(AgeValidity ageValidity, int age) {
        if (ageValidity.ageCheck(age, 18)) {
            System.out.println("Legal");
        } else {
            System.out.println("Illegal");
        }
    }

    static Buyer m1(int x) {
        return create(x);
    }

    static Buyer m2(int x) {
        return create(x);
    }

    static Buyer m3(int x) {
        return create(x);
    }

    public static void main(String[] args) {

        System.out.println(Buyer.m1(10).m2(20).m3(30).nonStatic());
        System.out.println(Buyer.lol());
    }

    private static Buyer create(int x) {
        if (x == 0) {
            return null;
        } else {
            return new Buyer(x);
        }
    }

    @Override
    public String toString() {
        if (this.x == 0) {
            System.out.println("It's fucking zero or 0!");
        }
        return this.x + "";
    }

    public static int lol() {
        return 242;
    }

    public String nonStatic() {
        System.out.println("non static broski");
        return "";
    }
}
