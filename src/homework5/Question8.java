package homework5;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        //Kullanicidan toplamak icin sayi isteyin ve sayilarin toplami 500’e
        //ulasincaya kadar sayi istemeye devam edin. Toplam 500’e ulastiginda
        //veya gectiginde sayilarin toplami ve kac sayi girildigini yazdirin.(do while
        //dongusu ile)

        Scanner scan = new Scanner(System.in);
        int input;
        int sumUp= 0;
        int counter= 0;

        do {
            System.out.println("Bir sayi giriniz:  " );
            input = scan.nextInt();
                sumUp += input;
                counter++;


        }while(sumUp<=500);

        System.out.println("Girilen sayilar toplami : " + sumUp);
        System.out.println("Girilen sayi: " + counter + " adettir.");




    }
}
