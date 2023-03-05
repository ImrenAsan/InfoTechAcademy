package homework5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis
        //degeri dahil aradalarindaki tum cift tamsayilari while loop kullanarak
        //ekrana yazdiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir baslangic degeri giriniz: ");
        long baslangic = scan.nextLong();
        System.out.println("Bir bitis degeri giriniz: ");
        long bitis = scan.nextLong();

        while (baslangic<= bitis ){
            if (baslangic %2 == 0){
                System.out.print(baslangic + " ");
            }
            baslangic++;
        }
    }
}
