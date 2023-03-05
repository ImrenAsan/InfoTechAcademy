package javaLessonsInfoTech;

public class Methodlar {
    public static void main(String[] args) {
        //myFirstMethod();

        int mainSonuc = method2(2,3);
        System.out.println(mainSonuc);


        System.out.println(method2("hava", "guzel"));


    }
    // access Modifier = public / protected/default / private
    public static void myFirstMethod (){
        System.out.println("First method calisti");
    }

    public static int method2 (int sayi1, int sayi2){
        int sonuc = sayi1 + sayi2;
        return sonuc;
    }

    public static String method2 (String str1, String str2){
        String kelimeBirlestirme = str1.concat(str2);
        return kelimeBirlestirme;
    }

}
