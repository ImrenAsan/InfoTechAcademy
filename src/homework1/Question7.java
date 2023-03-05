package homework1;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        // Kullanici ismi ve soyismi isteme ve konsola yazdirma

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz: ");
        String name = scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz: ");
        String surname = scan.nextLine();

        System.out.println("Isminiz :    " + name);
        System.out.println("Soyisminiz:  " + surname);
        System.out.println("Kursumuza katilim talebiniz alinmistir, tesekkür ederiz. ");

        // System.out.println("Sayin " + name + " "+ surname + ", " + "katilim talebiniz alinmistir. Tesekkür ederiz!");

    }
}
