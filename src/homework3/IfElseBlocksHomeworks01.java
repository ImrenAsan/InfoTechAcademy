package homework3;

import java.util.Scanner;

public class IfElseBlocksHomeworks01 {
    public static void main(String[] args) {

        //Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine
        //cevirip yazdirin.  50’den kucukse “D”, 50-60 arasi “C”, 60-80
        //arasi “B”, 80’nin uzerinde ise “A”.(If, else if, else kullanalim)

        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen notunuzu giriniz: ");
        short not = scan.nextShort();

        if ( not > 80 && not <=100){
            System.out.println("Notunuz 'A' dir. ");
        }
            else if (80>= not && not > 60){
            System.out.println("Notunuz 'B' ");
        }
            else if (60>= not && not >= 50) {
            System.out.println("Notunuz 'C' ");
        }
            else if (0 <= not && not < 50) {
            System.out.println("Notunuz 'D' ");
        }
        else {
            System.out.println("100'e kadar olan bir tam sayi giriniz!");
        }
    }
}
