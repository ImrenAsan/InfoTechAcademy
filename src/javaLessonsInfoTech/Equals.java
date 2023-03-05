package javaLessonsInfoTech;

public class Equals {
    public static void main(String[] args) {
        // Equals (String ifadeleri karsilatirmak icin kullaniriz.) (String leri kontrol ediyor.)
        // " == " hem referans adresine bakiyor, hem de iceriklerin esitligini kontrol ediyor.

        String str1= "Ali";
        String str2 = "ali";
        String str3= new String("Ali"); //
        String str4 = "Ali";

        System.out.println(str1.equals(str3));


    }
}
