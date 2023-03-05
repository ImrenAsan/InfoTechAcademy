package javaLessonsInfoTech;

// Soru:
// - verilen bir fiyat icin %10 indirim yapan bir method olusturun.
// Methodta indirim uygulanan fiyati yazdirin.
// Method call sonrasi orijinal fiyati yazdirin ve method da yapilan degisikligin
// orijinal degeri degistirip degistirmedigini kontrol edin.

public class CreatMethod {
    public static void main(String[] args) {
        int fiyat = 100;

        System.out.println("metod icindeki fiyat: " + indirim(fiyat)); //90
        System.out.println("method call sonrasi fiyat: " + fiyat);  // 100, fiyatin ilk degeri duruyor.

    }

    public static int indirim (int fiyat){
        fiyat *= 0.90;
        return fiyat;

    }

}
