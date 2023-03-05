package javaLessonsInfoTech.Overloading;

public class Overloading {
    public static void main(String[] args) {
        topla(10, 20);
        topla(10,20,30);
        // metodlarin ayni ama icerisindeki parametre sayisi farkli (javaLessonsInfoTech.Overloading.Overloading)
        topla(10,20,30,50,70,80,90); // birden fazla ayi girisi alip (varargs ile) sonuc verdik
    }

    static void topla (int sayi, int sayi2){
        System.out.println(sayi + sayi2);
    }

    static void topla(int sayi, int sayi2, int sayi3){
        System.out.println(sayi + sayi2 + sayi3);
    }

    static void topla (int ... sayilar) {
        int toplam =0;
        for (int i = 0; i< sayilar.length; i++){ // for döngüsü ile aldigimiz sayilari topladik.
            toplam+= sayilar[i];
        }
        System.out.println(toplam);
    }
}
