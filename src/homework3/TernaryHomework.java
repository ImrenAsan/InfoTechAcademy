package homework3;

import java.util.Scanner;

public class TernaryHomework {
    public static void main(String[] args) {

        //Kullanıcıdan 4 basamakli birsayi girmesini isteyin. Girdiği sayi
        //5’e bölünüyorsa son rakamını control edin. Sonrakamı 0 ise
        //ekrana “5’e bölünen çift sayı” yazdırın. Sonrakamı 0değilise “5’e
        //bölünen tek sayı” yazdırın. Girdiği password 5’e bölünmüyorsa
        //ekrana “Tekrar deneyin” yazdırın. (Nested Ternary kullanalim)

        Scanner scan =new Scanner(System.in);
        System.out.println("4 Basamakli bir tam sayi giriniz: ");
        int tamSayi = scan.nextInt();
        short sinir = 9999;

        String sonuc= (tamSayi % 5 == 0) && (tamSayi <= sinir ) ? ((tamSayi %10 == 0)  ? "5'e bölünebilen Cift bir tam Sayi"
                                                                                    : "5'e bölünebilen Tek bir tam Sayi")
                                        : "Tekrar deneyin!";

        System.out.println("Sonuc  " + sonuc);
    }
}
