package homework4;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu
        //yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyIsim = scan.nextLine();

        int isimLeng = isim.length(), soyIsimLeng = soyIsim.length();

        if (isimLeng > soyIsimLeng){
            System.out.println("Isminiz, soyisminizden daha uzundur.");
        }
        else if (isimLeng == soyIsimLeng){
            System.out.println("Isminiz soyisminizle esit uzunluktadir");
        }
        else {
            System.out.println("Soyisminiz, isminizden daha uzundur.");
        }



    }
}
