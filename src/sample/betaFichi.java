package sample;

import java.util.*;

public class betaFichi {

//    public void replace(String str, char oldEl, char newEl){
//        int i = str.length();
//        str.
//
//    }
//
    public static String remove(String str){
//        int sizeString = str.indexOf('+');
        String h = "";
        char y =' ';
        String p = "";
        for (int sizeString = str.indexOf('+'); sizeString >= 0; sizeString--) {
            h =  str.replace(str.charAt(sizeString), '$');
//            y = str.charAt(sizeString);

        }

        return h;
    }

    public static void main(String[] args) {

        double a = 2.2, b = 1.7;
        int s = 54356753;
        System.out.println("2%2 = " + a % 1);
        System.out.println("1.7%2 = " + b % 1);
        System.out.println("5%2 = " + s % 1);

//        String a = "123+456";
//
//        System.out.println("do " + a);
//
//        System.out.println("po " + "");
//        for(int i = 0; i < 0; i++);
//        Math.random();
//        Scanner a = new Scanner(System.in);
//        String b = a.nextLine();
//        System.out.println(b.getBytes().toString());

//          String aa =  a.replace('+', ' ');
//        System.out.println("po " + aa);
//        double q = Double.parseDouble(aa);
//        System.out.println(q + 1);

    }
}