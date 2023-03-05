package homework3;

import java.util.Scanner;

public class SwitchCaseHomework02 {
    public static void main(String[] args) {

         // Kullanicidan bir gun alin eger gun “Cuma” ise ekrana
        //“Muslumanlar icin kutsal
        //gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun”
        //yazdirin. “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun”
        //yazdirin. (switch case default ile yapalim)

        Scanner scan = new Scanner(System.in);
        System.out.println("Gün ismini giriniz: ");
        String gun = scan.nextLine();

        switch (gun){

            case "cuma" :
                System.out.println("Müslümanlar icin kutsal gündür.");
                break;
            case "cumartesi" :
                System.out.println("Yahudiler icin kutsal gündür.");
                break;
            case "pazar" :
                System.out.println("Hristiyanlar icin kutal gündür.");
                break;
            default:
                System.out.println("Herhangi bir din icin kutsal gün olarak kabul edilmemektedir.");
        }

    }
}
