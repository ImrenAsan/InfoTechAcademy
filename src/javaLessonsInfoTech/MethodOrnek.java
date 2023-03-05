package javaLessonsInfoTech;

import java.util.Scanner;

public class MethodOrnek {
    public static int soru2(int sayi) {
        Scanner scan = new Scanner(System.in);
        int sonuc = 0;

        switch (sayi) {


            case 2:
                System.out.println("Birinci sayiyi giriniz: ");
                int birinciSayi = scan.nextInt();
                System.out.println("Ikinci sayiyi giriniz: ");
                int ikinciSayi = scan.nextInt();
                sonuc = birinciSayi + ikinciSayi;

                break;

            case 3:
                System.out.println("Birinci sayiyi giriniz: ");
                int birinciSayi1 = scan.nextInt();
                System.out.println("Ikinci sayiyi giriniz: ");
                int ikinciSayi1 = scan.nextInt();
                System.out.println("Ucuncu sayiyi giriniz: ");
                int ucuncuSayi = scan.nextInt();
                sonuc = birinciSayi1 + ikinciSayi1 + ucuncuSayi;

                break;

            default:
                System.out.println("Cok sayi, toplama islemi gerceklestirilemez.");
        }
        return sonuc ;

    }


    public static void main(String[] args) {
        //Soru: videodan!

        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();


    }

}
