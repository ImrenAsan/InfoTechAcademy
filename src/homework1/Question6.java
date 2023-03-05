package homework1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        //Dikdörtgenler Prizmasi Hacim Hesaplanmasi

        Scanner scan  = new Scanner (System.in);

        System.out.println("Prizmanin uzun kenarini giriniz: ");
        int length = scan.nextInt();

        System.out.println("Prizmanin kisa kenarini giriniz: ");
        int width  = scan.nextInt();

        System.out.println("Prizmanin yüksekligini giriniz: ");
        int height = scan.nextInt ();

        System.out.println("Dikdörtgenler prizmasinin hacmi: " + (length * width * height) + " birim küptür. ");

    }
}
