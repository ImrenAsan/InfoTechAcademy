package javaLessonsInfoTech;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {


    // IF Statements
    // blok seklinde calisir.
    // kod blogunun calismasi icin if (ICERIK- SART TRUE OLMASI GEREKIR)!


        //int number1= 10;
        //if (number1 == 10 ) {

        //System.out.println("Number: " + number1);
         // }

        // IF - ELSE Statements
        // if (){ if blogu}
        // else { else kod blogu/ if blogunun calismadigi durumlarda sonuc verir}

        // int a= 2, b= 3;
        /*if (a>=b) {
            System.out.println("a degeri b'den buyuk veya esittir.");
        }
        else {
            System.out.println("a degeri b'den kücüktür.");
        }
        */
        // Exercise 1:

        Scanner scan = new Scanner(System.in);

        System.out.println("Yasinizi giriniz: ");
        int yas = scan.nextInt();

            if (yas>=18) {
                System.out.println("Sigara ve alkol satisi serbest");
            }
            else {
                System.out.println("Sigara ve alkol satisi yasaktir");
            }
            // Exercise 2:
        System.out.println("1.Kenar uzunlugunu giriniz: ");
        int kenar1= scan.nextInt();
        System.out.println("2.Kenar uzunlugunu giriniz: ");
        int kenar2= scan.nextInt();
        System.out.println("3.Kenar uzunlugunu giriniz: ");
        int kenar3= scan.nextInt();

            if ((kenar1 == kenar2) && (kenar2 == kenar3)) {
            System.out.println("Ücgenimiz eskenardir");
            }
            else {
                System.out.println("Ücgen eskenar bir ücgen degildir");
            }

            // IF - ELSE IF - ELSE -> coklu sart durumlarinda kullanilir.

        // Ex. 1 : soru:Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini
        //		yazdirin, sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi
        //		farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        //		sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir”
        //		yazdirin.

        // cond.1 -> both + + -> summen
        // cond.2 -> both - - -> carpim
        // cond.3 -> + -      -> "farli isaretlerde islem gerceklestirilimiyor.
        // cond.4 -> sayilardan biri sifir ise "sifir carpmaya göre yutan elemandir.
        System.out.println("Birinci sayiyi giriniz: ");
        int firstNumber = scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        int secNumber = scan.nextInt();

            if ( firstNumber >0 && secNumber >0){

                System.out.println("Sayilar toplami= " + (firstNumber+secNumber));
            }
            else if (firstNumber<0 && secNumber<0){
                System.out.println("sayilarin carpimi = " + (firstNumber * secNumber));
            }
            else if ( firstNumber * secNumber < 0 ){
                System.out.println("Farkli isaretlerde islem gerceklestirilemiyor");

            }
            else {
                System.out.println("sifir carpmaya göre yutan elemandir");
            }

            // NESTED-IF-ELSE (ic ice if - else statements )
         // Kadin emeklilik yasi -> if -> if / else
            // Erkek emeklilik yasi -> else -> if / else

        System.out.println("Cinsiyet giriniz: ");
            char cinsiyet = scan.next().charAt(0);
        System.out.println("Yasinizi giriniz: ");
        short yas1 = scan.nextShort();



            if ( cinsiyet == 'k'){
                if (yas1 >= 60){System.out.println("Kadin emekli olabilir");}
                else {System.out.println("Kadin emekli olamaz");}
            }
            else {
                if (yas1 >= 65) {System.out.println("Erkek emekli olabilir");}
                else {System.out.println("Erkek emekli olamaz");}
            }






    }
}
