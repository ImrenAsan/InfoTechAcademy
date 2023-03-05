package javaLessonsInfoTech.tryAndCatchSample;

import java.util.Scanner;

public class TryAndCatchIsCool {

    public static void main(String[] args) {
       // int [] a = {4,5,6};
        //System.out.println(a[3]); -> At the beginning it throws an exception "IndexOut Of Bounds"

        /*
        try{ int []  a = {4,5,6};
            System.out.println(a[3]);
        }catch(Exception e){
            System.out.println("an exception happened");
        }
        */

        Scanner scan = new Scanner (System.in);
        System.out.println("What is your fav number?");
//
//        int n = scan.nextInt();
//        System.out.println(n); -> it throws an RTE(RunTimeException)

        try {
            int n = scan.nextInt();
            System.out.println(n);
        }catch(Exception e){
            System.out.println("Sorry, please a number!");
        }

    }
}
