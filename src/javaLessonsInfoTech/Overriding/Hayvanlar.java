package javaLessonsInfoTech.Overriding;

public class Hayvanlar {
    boolean gorurMu = true;
    void ureme (){
        System.out.println("Tum hayvanlar ureme ile cogalir.");
    }
    void beslenme(){ // kumsehayvanlarindan ojbject olurturuken hata verdi.
        System.out.println("Tüm hayvanlar beslenme ile hayatini devam ettirir.");
    }
    void hareket (){
        System.out.println("Tum hayvanlar hareket etme yetisine sahiptir.");
    }
    void solunum (){
        System.out.println("Tum hayvanlar solunum ile yasamini sürdürür. ");
    }

}
