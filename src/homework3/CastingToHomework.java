package homework3;

import java.util.Scanner;

public class CastingToHomework {
    public static void main(String[] args) {

        //Kullanicidan bir karakter girmesini isteyin ve girilen karakterin
        //harf olup olmadigini yazdirin. (D, d, 3, ~, @, !, ...) (ip ucu: ascii
        //tablosu

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz: ");
        char karakter = scan.next().charAt(0);
        int karakter2 = (int) karakter;

        if (karakter2 >= 65 && karakter <= 90){
            System.out.println("Girilen karakter bir büyük harf");
        }
            else if (karakter2 >=97 && karakter2 <=122){
            System.out.println("Girilen karakter kücük bir harf");
        }

        else {
            System.out.println("Girilen karakter bir harf degil!");
        }


    }
}
