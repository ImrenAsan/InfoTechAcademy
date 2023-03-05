package javaLessonsInfoTech;

import java.util.Scanner;

public class ForOrnek {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        /*int sayi = scan.nextInt();

        for (int i= 1; i<=sayi; i++){

            if (i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
            }

        }
        */

        //OrnekSoru
        //*
        //**
        //***
        //****

        for (int i=1; i<=4; i++){
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
