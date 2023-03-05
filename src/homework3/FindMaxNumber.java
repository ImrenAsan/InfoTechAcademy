package homework3;

import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {

        // Kullanıcıdan uc tane tam sayı alalım ve maksimum sayıyı bulan
        //java kodunu yazalım.

        Scanner scan =new Scanner(System.in);

        System.out.println("Birinci tam sayiyi giriniz: ");
        int sayi1 = scan.nextInt();

        System.out.println("Ikinci tam sayiyi giriniz: ");
        int sayi2 = scan.nextInt();

        System.out.println("Ucuncu tam sayiyi giriniz: ");
        int sayi3 = scan.nextInt();

        if (sayi1 >= sayi2 && sayi1 >= sayi3) {

            System.out.println( "1.sayi en büyük tam sayidir.");
        }

        else if (sayi2 >= sayi1 && sayi2 >= sayi3) {

            System.out.println( "2.sayi en büyük tam sayidir.");
        }

        else {
            System.out.println("3.sayi en büyük tam sayidir.");
        }
            // bir enBuyuk sayi atayip digerleri ile kiyaslanmasi en kolayi olur.

    }
}
