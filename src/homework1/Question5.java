package homework1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        // Karenin alan ve cevresi hesaplama

        Scanner scan = new Scanner(System.in);

        System.out.println("Karenin 1 kenar uzunlugunu giriniz: ");

        int kenar = scan.nextInt();
        int cevre = kenar * 4 ;
        int alan = kenar * kenar;

        System.out.println("Karenin cevre uzunlugu,  " + cevre + " birimdir.");
        System.out.println("Karenin alani, " + alan + " birimdir.");

    }

}
