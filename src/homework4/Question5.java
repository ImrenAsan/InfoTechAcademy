package homework4;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

/* Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin.
- Ilk harf buyuk harf olmali
- Son harf kucuk harf olmali
- Sifre bosluk icermemeli
- Sifre uzunlugu en az 8 karakter olmali
*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen sifrenizi giriniz: ");
        String sifre = scan.nextLine ();


        if (! sifre.contains(" ") && sifre.length ()>= 8 && Character.isUpperCase(sifre.charAt(0)) && Character.isLowerCase(sifre.charAt(sifre.length() -1)) ){
            System.out.println("Sifre basari ile tamamlandi");
        }
        else {
            System.out.println("Islem basarisiz! Lutfen Yeni bir sifre tanimlayiniz.");
        }
    }
}
