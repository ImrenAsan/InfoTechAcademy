package javaLessonsInfoTech;

public class DoWhileOrnek {
    public static void main(String[] args) {
        // 9 dan 190 a kadar olan 7 nin kati olan tum sayilari ekrana yazdirin.

        int a = 9;
        do {
            if (a % 7 == 0){
                System.out.println(a);
            }
            a++;

        } while (a<=190);
    }
}
