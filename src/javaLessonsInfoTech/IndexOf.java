package javaLessonsInfoTech;

public class IndexOf {
    public static void main(String[] args) {
        //IndexOf --> eger sonuc true ise konsolda 1, false ise -1 degerini gösterir.

        String ifade10= "Calistiginizda, Java ögrenmek kolaydir.";
       System.out.println(ifade10.indexOf('a') );
        System.out.println(ifade10.indexOf("Java", 20)); //20.index ten sonraini okumasini istiyoruz.


        // LastIndexOf

        String ifade11 = "Bugun cok guzel bir gundu";
        System.out.println(ifade11.lastIndexOf("u"));
    }
}
