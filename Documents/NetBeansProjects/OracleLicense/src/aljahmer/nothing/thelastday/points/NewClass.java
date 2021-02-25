package aljahmer.nothing.thelastday.points;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class NewClass {

    static int newClassVar = 99;
    static int newClassVarStatic = 88;
    protected int newClassVarProt = 77;
    public int newClassPublic = 55;

    public static void main(String[] args) {

        int x = -1;
        assert x >= 0;

        int[] arr = {1, 2};
        int[][] arr2 = {arr, {1, 2, 879878}, arr};
        int[][][] arr3 = {arr2};

        int[][][] threeDim = {{{3, 54, 36}, {555, 4254, 444, 333}}, {{3, 45}, {00, 6445446}}, {arr}, arr2};

        System.out.println(arr2[0][1]);
        System.out.println("-------------");
        System.out.println(Arrays.toString(threeDim[3][1]));
        System.out.println("/////////////");
        System.out.println(Arrays.toString(threeDim[1][1]));
        System.out.println("|||||||||||||");
        System.out.println(Arrays.toString(threeDim[0][1]));

        int bin = 0b10011;
        float lol = 0x1p3f;
        float f = 1.4f;
        double ole = 1e44;
        int gtfo = 0x1f;
        float f3 = 0xffff_ffff_ffff_ffffL; // Ditto
        System.out.println(f3);
        System.out.println(bin);
        System.out.println(lol);
        System.out.println("LOL--->");
        System.out.println(f);
        System.out.println(ole);
        System.out.println(gtfo);

        Collection c = new ArrayList<>();

        ArrayList arr23 = new ArrayList();

        int xwr = 5 / 0;
        System.out.println(xwr);

    }
}

/*
public class ArgsPrinter{  
public static void main(String args){   
for(int i=0; i<3; i++){     
System.out.print(args+" ");      
}    
} 
} 
What will be printed when the above class is run using the following command line: 
java ArgsPrinter 1 2 3 4
 */
interface Flyer {
}

class Bird implements Flyer {
}

class Eagle extends Bird {
}

class Bat {
}

class Run {

    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();

        if (f instanceof Flyer) {
            System.out.println("f is a Flyer");
        }
        if (e instanceof Bird) {
            System.out.println("e is a Bird");
        }
        if (b instanceof Flyer) {
            System.out.println("b is a Bird");
        }

        Flyer fly = (Flyer) new Bat();
        Flyer flybrd = new Bird();
        Flyer flyegl = new Eagle();

    }
}

class Animal {

    int weight;

}

class Lion extends Animal {

    int maxSpeed;

    public static void main(String args[]) {
        Animal a1 = new Lion();
        // Line 1
        System.out.println(((Lion) a1).maxSpeed);
        String str = "Said";
        StringBuilder sb = new StringBuilder("Said");
        StringBuilder sb2 = new StringBuilder(2);
        sb2.append("Said");
        System.out.println(sb == sb2);
        Lion lion = new Lion();
        Wolf wolf = new Wolf();
        
        System.out.println(wolf==lion);
    }
}
class Wolf extends Lion {}
