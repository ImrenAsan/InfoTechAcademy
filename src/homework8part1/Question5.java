package homework8part1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.

        Scanner scan = new Scanner(System.in);
        int sayac = 1;

        System.out.print("Cumle giriniz: ");
        String cumle = scan.nextLine();

        for(int i = 0; i < cumle.length(); i++)
        {
            if(cumle.charAt(i) == ' ') {
                sayac++;
            }
        }
        System.out.println("Girilen cumlede " + sayac + " tane kelime vardir.");


    }
}
