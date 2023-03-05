package homework7;

import java.util.Scanner;

public class Product1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sitemizden 5 urunu hediye secme hakki kazandiniz: ");

        for (int i=1; i<6; i++){
            String product = scan.nextLine();
            System.out.println(i + " . product " + product);

        }
        System.out.println("");




    }
}
