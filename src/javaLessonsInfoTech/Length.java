package javaLessonsInfoTech;

public class Length {
    public static void main(String[] args) {
        // Length --> String bir ifade icindeki karakter sayilarini sayma da kullanilir.

        String ifade = "The weather is so lovely today";
        System.out.println(ifade.length());
        System.out.println(ifade.charAt(19) );
        System.out.println(ifade.charAt(ifade.length()-1));
        System.out.println(ifade.charAt(ifade.length()-8));

    }
}
