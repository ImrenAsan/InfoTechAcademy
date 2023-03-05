package homework1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        // Coverting miles to Km

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miles: ");
        double miles = scan.nextDouble();
        double kilometer = miles * 1.6;

        System.out.println(miles + " miles equal with " + kilometer + " km");

    }

}
