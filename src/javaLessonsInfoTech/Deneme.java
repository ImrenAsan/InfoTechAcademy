package javaLessonsInfoTech;

public class Deneme {
    public static void main(String[] args) {

        // copy of value

        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
        System.out.println("Returned String: " + myStr2);
    }
}