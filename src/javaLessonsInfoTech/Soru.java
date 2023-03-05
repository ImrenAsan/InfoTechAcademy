package javaLessonsInfoTech;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve metin girmesini isteyin. Cümlenin icindeki metne gore
        // 1.Cumle metni icermiyor
        // 2.Cumle de metin 1 kez varsa 1 kez iceriyor yazsin.
        // 3. fazla varsa birden fazla iceriyor.

        Scanner scan = new Scanner (System.in);
        System.out.println("Cumleyi giriniz: ");
        String cumle = scan.nextLine();

        System.out.println("Metni giriniz: ");
        String metin = scan.next ();

        if (!cumle.contains(metin)) {
            System.out.println("Cumle girilen metni icermiyor");
        }
        else {
            int ilkIndex = cumle.indexOf(metin);
            int ikinciIndex = cumle.indexOf(metin, ilkIndex+1);
            if (ikinciIndex == (-1)) {
                System.out.println("Metin cumlede sadece 1 defa geciyor");
            }
            else {
                System.out.println("Cumlede birden cok gecmektedir.");
            }

        }



    }
}
