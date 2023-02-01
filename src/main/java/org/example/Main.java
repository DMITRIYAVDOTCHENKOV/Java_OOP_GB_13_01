package org.example;

import scala.runtime.Char;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main (String[] args) {






        System.out.println(isContain("1c"));
        System.out.println(isContain("13"));
        System.out.println(isContain("12bc"));
        System.out.println(isContain("123abc,.;"));
        System.out.println(isContain(",.;"));
        System.out.println(isContain("r5"));
        System.out.println(isContain("R5"));
    }

    private static boolean isContain (String s) {
        if (s.length() ==2) {
            Pattern p = Pattern.compile("(\\d[a-z, A-Z]|[a-z, A-Z]\\d)");
            Matcher m = p.matcher(s);
            return m.find();
        }
        return false;
    }
}

//        Pattern p = Pattern.compile("(([A-Z].*[a-z].*[0-9])|([0-9].*[A-Z].*[a-z]))");
//        Matcher m1 = p.matcher("r8");
//        Matcher m2 = p.matcher("44");
//        Matcher m3 = p.matcher("4f");
//        Matcher m4 = p.matcher("E4");
//        Matcher m5 = p.matcher("4T");
//
//        boolean b1 = m1.find();
//        boolean b2 = m2.find();
//        boolean b3 = m3.find();
//        boolean b4 = m4.find();
//        boolean b5 = m5.find();
//
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);
//        System.out.println(b4);
//        System.out.println(b5);

//    }











//        System.out.println("Hello world!");
//
//
//        int a = 10;
//        int b = 5;
//        if (a > 1 || a < b) {
//            a = a - 5;
//        }
////        if (a > 1 && (a = b) {
////            a = a - 5;
////        }
//        System.out.println(a);
//    }

