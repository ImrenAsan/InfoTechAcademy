package homework1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        // Converting hours to seconds

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter hours: ");
        int hours, seconds;
        hours = scan.nextInt();
        seconds = hours * 60 * 60;

        System.out.println(hours + " hours: " + seconds + " seconds. " );
    }
}
