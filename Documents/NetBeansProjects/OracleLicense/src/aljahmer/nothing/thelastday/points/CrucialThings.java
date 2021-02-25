package aljahmer.nothing.thelastday.points;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Outerclass {

    // instance method of the outer class 
    void my_Method() {
        int num = 23;
        // method-local inner class
        class MethodInner_Demo {

            public void print() {
                System.out.println("This is method inner class " + num);
            }
        } // end of inner class

        // Accessing the inner class
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();

    }

    public static void main(String args[]) {
        Outerclass outer = new Outerclass();
        outer.my_Method();
      
    }
}

@FunctionalInterface
interface Procedure {

    void run();

    default Procedure andThen(Procedure after) {
        return () -> {
            run();
            after.run();
        };
    }

    default Procedure compose(Procedure before) {
        return () -> {
            before.run();
            this.run();
        };
    }

    public static void main(String[] args) throws Exception {
        Procedure procedure1 = () -> System.out.print("Hello ");
        Procedure procedure2 = () -> System.out.print("World ");
        procedure1.andThen(procedure2).run();
        System.out.println("\n------------");
        System.out.println("THE NEWEST EDITION SHIT BROSKI LOL");
        procedure1.compose(procedure2).run();
        System.out.println("");
        System.out.println("THE NEWW SHITT ESKETITIITTITI");
        procedure2.andThen(procedure1).run();
        System.out.println("");
        procedure2.compose(procedure1).run();
        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100); // autoboxing int to Integer
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(1, 9999);
        for (Integer i : arrayList) {
            System.out.println(i);
        }

        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.TRUE;
        System.out.println(bool.hashCode());
        System.out.println(bool2.hashCode());
        System.out.println(bool == bool2);
        System.out.println(bool.equals(bool2));
        System.out.println("--------");
        String str = String.valueOf("\u007f");
        System.out.println(str);
        System.out.println("------------------");
        Integer obj = new Integer(2222);
        Integer obj2 = 127;
        System.out.println(obj == obj2);
        System.out.println(obj.intValue());

        Integer intag = 127;
        Integer intagg = 127;
        System.out.println("HASHCODOVI IDU BURAZ PAZI SE---------->");
        System.out.println(intag.hashCode());
        System.out.println(intagg.hashCode());
        System.out.println(intag == intagg);

        Boolean boollski1 = true;
        Boolean boollski2 = true;
        Boolean boollski3 = Boolean.TRUE;
        System.out.println(boollski3.hashCode());
        System.out.println(boollski1.hashCode());
        System.out.println(boollski2.hashCode());
        System.out.println(boollski1 == boollski2);

        Class<?> clazz = Class.forName(
                "java.lang.Integer$IntegerCache");
        Field field = clazz.getDeclaredField("cache");
        field.setAccessible(true);
        Integer[] cache = (Integer[]) field.get(clazz);

        // System.out.println(Arrays.asList(cache));
        System.out.println(cache.length + " =this is length");
        // Rewrite the Integer cache
        for (int i = 0; i < cache.length; i++) {
            cache[i] = new Integer(
                    new Random().nextInt(cache.length));
        }

        System.out.println("---------------------------->");

        // Prove randomness
        for (int i = 0; i < 10; i++) {
            System.out.println((Integer) i);
        }

        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            for (double j = 0; j < 5; j++) {
                map.put(i, j);
            }
        }

        System.out.println("<----------------------------------------------->");
        Integer ger = 127;
        Integer ker = 127;
        Integer her = new Integer(127);
        System.out.println(ger.hashCode());
        System.out.println(ger == ker);
        System.out.println(her == ker);
    }

    class SaidTheMachine {

        public void someMethod(String id) {
            someOtherMethod(Integer.valueOf(id));
        }

        public void someOtherMethod(int id) {
            // do something with id
        }

        void m1() throws Exception {
            try {
                // line1 
                someMethod();
            } catch (IOException e) {
                throw new SQLException();
            } catch (SQLException e) {
                throw new InstantiationException();
            } finally {
                throw new CloneNotSupportedException();   // this is not a RuntimeException.
            }
        }

        void someMethod() throws IOException, SQLException {
        }

        void testException() {

            try {
                methodSaid();
                //   throw new SubSaidException();

            } catch (SuperSaidException ex) {
                try {
                    System.out.println("inner try block");
                    methodSaid();
                    System.out.println("after inner try block");
                } catch (SubSaidException ex2) {

                }
            } catch (Exception ex) {
                System.out.println("caaacaaatctccctc");
            } finally {
                System.out.println("finally bro xD");
            }
        }

        void methodSaid() throws SubSaidException {

        }

        public static void main(String[] args) throws Exception {
            new SaidTheMachine().m1();
        }
    }

    class SuperSaidException extends Throwable {

    }

    class SubSaidException extends SuperSaidException {

    }

    class SubSaidExceptionSecond {

    }

    class SubSaidExceptionII {

    }
}
