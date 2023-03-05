package homework3;

import java.util.Scanner;

public class SwitchCaseHomework01 {

    public static void main(String[] args) {

        // Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
        //baslayan gun isimlerini yazdirin.
        //              Ornek ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        //              ilkHarf=S output = “Sali”  (switch case default ile yapalim)

        Scanner scan = new Scanner(System.in);
        System.out.println("Gün isimlerinden birinin ILK harfini giriniz: ");
        char ilkHarf= scan.next().toLowerCase().charAt(0);

        switch (ilkHarf){

            case 'p':
                System.out.println("Pazartesi, Persembe ve Pazar");
                break;
            case 's':
                System.out.println("Sali ");
                break;
            case 'c':
                System.out.println("Carsamba, Cuma ve Cumartesi");
                break;
            default:
                System.out.println("Türk dilinde bu harf ile baslayan bir gün yok!");

        }
    }
}
