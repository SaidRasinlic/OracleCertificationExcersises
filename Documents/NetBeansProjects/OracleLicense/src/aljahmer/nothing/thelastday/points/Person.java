package aljahmer.nothing.thelastday.points;

import java.util.Objects;

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    /* @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        return hash;
    } */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Said");
        Person p2 = new Person("Said");
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}

class Player {

    protected double hits = 25;
}

class Catcher extends Player {

    private double atbats = 75;

    private double battingAverage( 
        Catcher this) {
        // return hits / this.atbats;
        //  return super.hits / atbats;
          return this.hits / this.atbats;
        //  return super.hits / this.atbats;
    }

    public static void main(String[] args) {

        System.out.println(new Catcher().battingAverage());
        String s1 = "abcdefghi";
        System.out.println(s1.toCharArray());
        System.out.println(s1.substring(s1.indexOf("c"), s1.indexOf("i")).concat("f"));
        System.out.println(s1.substring(2, 8).concat("f"));
        System.out.println(s1.subSequence(4, 8));
        //System.out.println(s1.subSequence(4, 4));
    }
}
//OCA-1Z0808-SM-01-60, OCA-1Z0808-SM-01-28,OCA-1Z0808-SM-01-33,OCA-1Z0808-SM-01-44,OCA-1Z0808-SM-01-65,OCA-1Z0808-SM-01-12 GARBAGE,OCA-1Z0808-SM-01-38, OCA-1Z0808-SM-01-59

class Polymorphism {

    public static void main(String[] args) {
        Aoh ref1 = new Coh();
        Boh ref2 = (Boh) ref1;
        Boh ref3 = (((Boh) ref1));
        System.out.println(ref2.f());
        System.out.println(ref3.f());
        System.out.println(((Boh) ref1).f());
        System.out.println(((Boh) ref2).f());
        System.out.println("-------------------------------------");
        short s = 300;
        Integer i = new Integer(500);
        Long longe = new Long(i);
        Double dabl = new Double(longe);
        Double debl = longe + dabl;
        Float floaty = (float) longe + s;
        Long l = s + (long) i;
        Long.parseLong("22");
        long primitiveL = 232;
        System.out.println(l.getClass());
        //Long el = s + i;
        long leng = 2;
        Long langy = 2l;
        double d = 22;
        float f = 22;
        long lew = 22;
        short se = 2;
        Byte byty = 22;
        double derf = 3;
        Short shorty = 232;
        Integer inty = 292;
        Double doubly = 242d;
        Long longy = 24l;
        int lofle = 2;
        float flot = (lofle + (float) derf);
        System.out.println(byty + shorty);
        System.out.println(l);
        //Runtime.getRuntime().gc();
        int counter = 100;
        System.out.println(counter++ + ++counter + ++counter);

    }
}

class Aoh {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called");
        System.out.println("Okay the shitty object is fuckin deleted!Trust me bro! The id is: " + this);
    }

    int f() {
        return 0;
    }
}

class Boh extends Aoh {

    @Override
    int f() {
        return 1;
    }
}

class Coh extends Boh {

    @Override
    int f() {
        return 2;
    }
}

//String stringG = new String("You know my methods, Watson.");
