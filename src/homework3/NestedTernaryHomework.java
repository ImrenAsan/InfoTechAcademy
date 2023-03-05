package homework3;

import java.util.Scanner;

public class NestedTernaryHomework {
    public static void main(String[] args) {
        // Kullanıcıdan bir gün girmesini isteyelim.
        //a.  Eger girilen gun hafta sonu ise tekrar kontrol edelim
        //Cumartesi ise Cumartesi ve hafta sonu, Pazar ise Pazar ve
        //hafta sonu yazdıralım.
        //b. Degil ise gün hafta ici yazdıralım.
        //1. Note: equals ile karsilastiralim
        //2. Nested ternary kullanalım..

        Scanner scan = new Scanner(System.in);
        System.out.println("Gün ismini giriniz: ");
        String gun = scan.nextLine();

        String sonuc = gun.equals ("cumartesi")? "Bugun haftasonu ve cumartesi gunu" : gun.equals("pazar") ? "Bugun haftasonu ve pazar gunu" : "Bugun hafta ici";
        System.out.println("sonuc = " + sonuc);
    
         }
}
