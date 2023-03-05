package homework5;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Kullanıcıdan aldıgınız 5 basamaklı sayının rakamlarının toplamını
        //yazdıran programi for döngüsü ile yazınız.

        //Kullanicidan 5 basamakli bis sayi al.
        // 5 basamakli sayinin rakamlarini topla

        Scanner scan = new Scanner (System.in);

        System.out.println("Lutfen 5 basamakli bir tam sayi giriniz: ");
        int sayi = scan.nextInt();
        int toplam= 0;

        for (int i = 1; i<=5; i++){

            int sonuc = sayi % 10;
            sayi /=10;

            toplam += sonuc;
        }

        System.out.println("Sayinin rakamlar toplami = " + toplam + " dir.");

    }
}
