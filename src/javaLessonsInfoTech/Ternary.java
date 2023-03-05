package javaLessonsInfoTech;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        // Ternary
        // Condition ? Code 1 (true) : Code 2 (false)
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        long sayi = scan.nextLong();

        String sonuc = sayi % 2 == 0 ? "Sayi CIFTTIR" : "Sayi TEKTIR";
        System.out.println(sonuc);

        int sonuc2 = (int) sayi % 2 == 0 ? (int) sayi + 10 : (int) sayi -10;
        System.out.println("int sonucumuz:" + sonuc2);

        // Nested- Ternary
        System.out.println("Cinsiyet giriniz e/k: ");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("Yasinizi giriniz: ");
        short yas = scan.nextShort();

        String durum = cinsiyet == 'k' ? (yas >= 60 ? "Kadin emekli olabilir" : "Kadin emekli OLAMAZ")
                                        : (yas >= 65 ? "Erkek emekli olabilir" : "Erkek emekli olamaz");
        System.out.println("Sonucumuz :" + durum);


    }
}
