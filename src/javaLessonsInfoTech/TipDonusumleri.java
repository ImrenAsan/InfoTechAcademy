package javaLessonsInfoTech;

public class TipDonusumleri {
    public static void main(String[] args) {
        //Tip dönüsümleri (casting)
        // modülüs örneklerinden 3 tane yaz!!
        //int sayi = 5;
        //int sonuc = sayi++ + 10;
        // System.out.println(sonuc);
        // ++ islemi sag tarafta olunca önce mat.islem gerceklestirilir.
        // sonrasinda artirma islemi yapilir.
        // ++ islemi sol tarafta olunca önce sayinin artirilma islemi yapilir, sonrasinda mat.islem
        // gerceklestirilir.

        //int sayi2= 10;
        //int sonuc2= ++sayi2 + 10;
        //System.out.println(sonuc2);

        // Relational Operators
        // == -> isaretin sag ve sol tarafi karsilastirlir. esittir.
        // e.g.
        boolean sonuc1 = 5+2 == 7;      // sonuc boolean tipinde konsolda gösterilir.
        System.out.println(sonuc1);

        // != -> esit degildir.
        // boolean sonuc2 = 5*2 != 7;
        // System.out.println(sonuc2);

        // boolean sonuc3= 5+2 != 7;
        // System.out.println(sonuc3); // konsolda false verir.

        // 4th Operator
        // < and <= -> "equal with and smaller than"
        // boolean sonuc5= 5+2 <= 7;
        // System.out.println(sonuc5);

        // boolean sonuc6 = 5+2< 7;
        // System.out.println(sonuc6);

        // 3th Operator
        // > and >= -> "equal with and bigger than"
        // boolean sonuc5= 5+2 >= 7;
        // System.out.println(sonuc5);

        // boolean sonuc6 = 5+2> 7;
        // System.out.println(sonuc6);

        // Conditional Operators
        // Attention: & -> && dan farki daha hizli calismasi, ilk stepten itibaren sonuca ulasir.
        // && -> it means AND -> all the assignments should be true, if we show true on console.

        // boolean sonuc9= (5+2 == 7) && (4+3!= 5); // girilen her iki ifadenin de dogru olmasi kosulunda true verir.

        // OR ?? -> verilen degerlerden herhangi birisinin true olmasi halinde sonuc true verir.


    }
}
