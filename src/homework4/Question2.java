package homework4;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //Kullanicidan isim isteyin. Eger - isim “a” harfi iceriyorsa “Girdiginiz isim a
        //harfi iceriyor” - isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor” - ikisi de yoksa
        //“Girdiginiz isim a veya Z harfi icermiyor” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz: ");
        String isim = scan.nextLine();
        // String inpt1 = scn.nextLine().trim();

        if (isim.contains("a") || isim.contains("A")){
            System.out.println("Girdiginiz isim 'a' harfi iceriyor");
        }
            else if (isim.contains("z") || isim.contains("Z")){
            System.out.println("Girdiginiz isim " + isim + "'z' harfi icermektedir.");
        }
        else {
            System.out.println("Girdiginiz isim 'a' ve 'z' harfi icermemektedir.");
        }



    }
}
