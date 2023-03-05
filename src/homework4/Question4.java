package homework4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        //yazdirin.
        //isim-soyisim : O*** K*****
        //kart no : **** **** **** 1234
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: " );
        String isim = scan.nextLine ();

        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyIsim = scan.nextLine();

        Scanner scan1= new Scanner (System.in);

        System.out.println("Kart numaranizi giriniz: ");
        String kartNo= scan1.nextLine();

        char isimIlk = isim.toUpperCase().charAt(0);
        char soyIsimIlk = soyIsim.toUpperCase().charAt(0);

        String isimSon =isimIlk + isim.substring(1).replaceAll(".","*");
        String soyIsimSon = soyIsimIlk + soyIsim.substring(1).replaceAll(".", "*");
        String kartNo1= kartNo.substring(0,4).replaceAll(".","*").concat(" ").concat(kartNo.substring(5,9).replaceAll(".","*")).concat(" ")
                + kartNo.substring(10,14).replaceAll(".","*").concat(" ");

        String kartSon = kartNo.substring(kartNo.length() -4);

        System.out.println("Isminiz - Soyisminiz : " + isimSon + " " +  soyIsimSon);
        System.out.println("Kart Numaraniz: " + kartNo1 + kartSon);

    }
}
