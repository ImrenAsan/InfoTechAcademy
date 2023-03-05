package homework5;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin
        //0’a basmasini soyleyin.
        //Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif
        //sayilarin toplaminin kac oldugunu yazdirin.(do while dongusu ile)
        Scanner scan = new Scanner(System.in);
        int input=0;
        int sumUp= 0;
        int counter= 0;

        do {
            System.out.println("Lütfen bir sayi giriniz: ");
            input = scan.nextInt();
            sumUp += input;
            counter ++;

        }while (input> 0);
        System.out.println("Girilen sayilar toplami: " + sumUp);
        System.out.println("Girilen sayi adedi: " + counter);
    }
}
