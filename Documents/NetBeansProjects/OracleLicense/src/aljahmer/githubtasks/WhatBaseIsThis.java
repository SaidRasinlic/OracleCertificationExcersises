package aljahmer.githubtasks;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class WhatBaseIsThis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            break;
        }

        System.out.println(LocalDateTime.now());
        String date = LocalDateTime.parse("2021-02-15T21:09:52.931").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
        int xe = 34;
        Short s1 = 200;
        Integer s2 = 300;
        Integer s4 = Integer.valueOf(300);

        Scanner input = new Scanner(System.in);
        loop1:
        while (input.hasNext()) {
            String x = input.next();
            String y = input.next();
            boolean found = false;
            loop2:
            for (int i = 2; i < 37 && !found; i++) {
                BigInteger xConvertedToBase;
                try {
                    xConvertedToBase = new BigInteger(x, i);
                } catch (Exception e) {
                    continue;
                }
                for (int j = 2; j < 37; j++) {
                    BigInteger yConvertedToBase;
                    try {
                        yConvertedToBase = new BigInteger(y, j);
                    } catch (Exception e) {
                        continue;
                    }
                    if (xConvertedToBase.equals(yConvertedToBase)) {
                        System.out.println(x + " (base " + i + ") = " + y
                                + " (base " + j + ")");
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println(x + " is not equal to " + y
                        + " in any base 2..36");
            }
        }
    }
}

//https://www.examtopics.com/exams/oracle/1z0-808/view/
//https://github.com/kdn251/interviews/tree/master/uva
/*
int x = 2; 
{
   int y = 2;
   while (y > 0)
   {
      System.out.println(x + " "+ y + " ");
      x++;
      y--; // or --y;
   }
}
------------------------------------------------------------------------------------
int x = 2;
    for (int y =2; y>0;y--){
        System.out.println(x + " "+ y + " ");
        x++;
    }
 */
