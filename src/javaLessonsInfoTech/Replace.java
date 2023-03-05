package javaLessonsInfoTech;

public class Replace {
    public static void main(String[] args) {
        String str = "Java ogrenmek cok kolay";
        System.out.println(str.replace("a", "*"));

        /*
        s bosluk (
        \\S bosluk dizisindeki tüm karakterle
        \\w harfler ver rakamlar (a z A Z, 0 9
        \\W harfler ve rakamlar izisindeki tüm karakterler
        \\d rakamlar 0 9
        \\D rakamlar dizisindeki tum karakterler

         */

        String ifade = "J8av5a og54renmek c8ok kol23ay";
        System.out.println(ifade.replaceAll("\\d", ""));

    }
}
