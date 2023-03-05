package javaLessonsInfoTech;

import java.util.Scanner;

public class MultidimensionalArraySample {
    public static void main(String[] args) {

        int [][] sayilar = {
                {1,2,3,4,5,6,7,8,9,10},
                {11,12,13,14,15,16,17,18,19,20},
                {21,22,23,24,25,26,27,28,29,30},
                {31,32,33,34,35,36,37,38,39,40},
                {41,42,43,44,45,46,47,48,49,50},
                {51,52,53,54,55,56,57,58,59,60},
                {61,62,63,64,65,66,67,68,69,70},
                {71,72,73,74,75,76,77,78,79,80},
                {81,82,83,84,85,86,87,88,89,90},
                {91,92,93,94,95,96,97,98,99,100}
        };

        for (int i=0; i< sayilar.length; i++){
            for (int j=0; j< sayilar[0].length; j++) // ic arrayin de 0.indexini yazdirma
                System.out.print(sayilar[i][j] + "\t");
        }
        System.out.println("");

        //A.Satir toplami


        //b. her bir sütunu toplama
        int toplamA;

        for (int i = 0; i < sayilar.length; i++){
            toplamA = 0;
            for (int j=0; j< sayilar[0].length; j++){
                toplamA += sayilar[j][i];
            }
            System.out.println(" .sütunun toplami : " + toplamA);
        }
        //c. dizi elemanlarindan degeri klavyeden girilecek bir sayisal degerden büyük olanlari 0 yapiniz.

        int value;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir deger giriniz: ");
        value = scan.nextInt();

        for (int i = 0; i< sayilar.length; i++){
            for (int j=0; j< sayilar[0].length; j++){
                if (sayilar [i][j]< value){
                    sayilar[i][j] = 99;
                }
            }
        }

        for (int i=0; i < sayilar.length; i++){
            for (int j= 0; j< sayilar[0].length; j++) {
                System.out.println(sayilar [i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
