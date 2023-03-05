package javaLessonsInfoTech;

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        // ToLowerCase and ToUpperCase

        String isim = "InfoTech Academy";
        String buyukIsim = isim.toUpperCase();
        System.out.println(buyukIsim);
        // yeniden isleme koyarken, yeniden string bir ifade atamaya gerek olmayabilir.

        //Exercises:
        /*String name = "sinem";
        System.out.println(name.toUpperCase());
        String name1= "OZDEMIR";
        System.out.println(name1.toLowerCase());
        System.out.println((name.toUpperCase()).concat((name1.toLowerCase())));
        */
        Scanner scan = new Scanner(System.in);
        String str3 = scan.next().toLowerCase();
        System.out.println(str3);







    }
}
