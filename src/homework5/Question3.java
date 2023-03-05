package homework5;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        //Kullanicidan uslu sayi hesabi icin iki adet integer sayi isteyin. integer
        //donus tipli, iki argumanli bir uslu sayi hesaplama methodu olusturun.
        //Argumanlardan birini taban sayisi icin digerini ise ussu icin kullanin.
        //Islemin sonucunu main method’ dan verilen komutla yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Kök sayiyi giriniz: ");
        int kokSayi = scan.nextInt();
        System.out.println("Us sayiyi giriniz: ");
        int usSayi = scan.nextInt();


        System.out.println(pow(6,2));

    }

    public static int pow (int kokSayi, int usSayi){
        int result =1;
        for (int i = 0; i< usSayi; i++){
            result = result * kokSayi;
        }
        return result;
    }
}
