package javaLessonsInfoTech.Overriding;

import javaLessonsInfoTech.Overriding.Hayvanlar;
import javaLessonsInfoTech.Overriding.KumesHayvanlari;
import javaLessonsInfoTech.Overriding.Kuslar;

public class Main {
    public static void main(String[] args) {
    KumesHayvanlari kms1 = new KumesHayvanlari();
    kms1.hareket();
        System.out.println(kms1.gagasiVarMi);
        System.out.println(kms1.gorurMu); // burada boolean tipinde bir deger oldugu icin
        kms1.beslenme(); // metod call ettigimiz icin direk yazabildik


        Kuslar kus1 = new Kuslar();
        System.out.println(kus1.gagasiVarMi);
        kus1.beslenme();
        kus1.ureme(); // Kuslar sinfini refere ederek nesne olusturdugumuz icin, oradaki metodu cagirir.


        Kuslar kms2 = new KumesHayvanlari();
        kms2.hareket(); //KumesHayvanlarindan alir.
        kms2.beslenme(); //Hayvanlardan alir.
        kms2.ureme(); //kuslardan alir.
        kms2.solunum(); //kuslardan alir.
        System.out.println(kms2.gagasiVarMi); // Variable larda hiding process  var.
        // Ilk gordugunu alir.
        System.out.println(kms2.gorurMu);

        Hayvanlar kms3 = new KumesHayvanlari();
        kms3.beslenme(); //hayvanlardan alir.
        kms3.hareket(); // kumeshayvanlardan alir.
        kms3.solunum(); // kuslardan alir.
        kms3.ureme(); // kuslardan alir.


        Hayvanlar kus2 = new Kuslar();
        System.out.println(kus2.gorurMu);





    }
}
