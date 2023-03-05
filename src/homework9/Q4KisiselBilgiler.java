package homework9;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Q4KisiselBilgiler {

    //Question4:
    //Kullanicidan adini, soy adini isteyin ve onu “Hosgeldin Ad Soyad”
    //seklinde selamlayin. Tc kimlik numarasini talep edin ve kullaniciya
    //tc’ sinin 1. , 4. ve 9. rakamlarini gosterip onaylatin.
    //16 haneli kredi kardi numarasini isteyip ekranda son dort hanesi
    //gorunecek sekilde yazdirin(**** ****  **** 5434) .Tum islemleri
    //StringBuilder kullanarak yapiniz. Bu programin en basinda zamani
    //alin ve islemler tamamlaninca tekrar zaman alin ve arada gecen
    //sureyi ekrana “Islemler ..... surede tamamlandi.” Ibaresini gosterip
    //programi tamamlayin.

    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        System.out.println("Start: " + start);

        Scanner scan = new Scanner(System.in);

       StringBuilder nameSurname= new StringBuilder();                                        //yeni bir StringBuilder nesnemizi olusturuyoruz.
       System.out.println("Lutfen isminizi ve soyisminizi bir bosluk birakarak yaziniz: ");   // kullanicidan istedimiz komut
       nameSurname.append(scan.nextLine());                                                   // alacagimiz input icin calistirilacak kod
       System.out.println("Hosgeldiniz "+ nameSurname.toString() + " !");                     // konsolda "Hosgeldiniz sayin ...!" ciktisi.

       StringBuilder personalId = new StringBuilder();
        System.out.println(" 11 Haneli Kimlik numaranizi yaziniz: "); //Burada bir döngü kurulup devam edilebilir. (While döngüsü)
        personalId.append(scan.nextLong());
        System.out.println("ID numaranizin 1.,4. ve 9.hanesindeki numaralar: " + personalId.substring(0,1).toString()
                + " , " + personalId.substring(3,4).toString() + " , " + personalId.substring(8,9).toString());



        System.out.println("16 Heneli kart numaranizi giriniz: ");
        StringBuilder cardNumber = new StringBuilder();//!!
        cardNumber.append(scan.nextLong());
        cardNumber.replace(0,12, "**** **** **** ");
        String str = cardNumber.toString();
        System.out.println(str); //Burada hata veriyor!!



        LocalTime end = LocalTime.now();
        System.out.println("End : "+ end);
        System.out.println("Duration: " + Duration.between(start, end).getSeconds() + " seconds"); // saniye cinsinden aldim
                                                                                                    // saate ya da dakika ya cevrilebilir.


        // Instant start1= Instant.parse ();
        // Instant end1 = Instant.parse ();
        // Duration duration = Duration.between(start, end);
        //What does "Parse" mean?

    }

}
