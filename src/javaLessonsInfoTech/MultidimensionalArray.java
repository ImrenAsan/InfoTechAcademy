package javaLessonsInfoTech;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int [][] multiDimensional1 = {{11,12,13} , {21,22,23}, {31,32,33}};

        int [][] multiDimensional2 = new int [][] {{11,12,12}, {21,22,23}, {31,32,33}};

        System.out.println(multiDimensional1.length);

        System.out.println(multiDimensional1[0][0]); // multidimensional array icindeki bir arrayin icindeki elemani
                                                        // görüntülemek istedigimizde bu türden kullaniyoruz.

        System.out.println(multiDimensional1[1][1]); // 1. index deki arrayin 1.indexi.

        for (int i = 0; i < multiDimensional1.length; i++){ //Dizinin satir sayisi
            for (int j=0; j< multiDimensional1[0].length; j++){ //Dizinin sütun sayisi
                System.out.println(multiDimensional1[i][j]);
            }
            System.out.println("");
        }


    }
}
