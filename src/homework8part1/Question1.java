package homework8part1;

public class Question1 {
    public static void main(String[] args) {
        //Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
        // { {1,2,3}, {4,5,6} }

        //Matrix Multiplication
        int [][] multiArray = {{1,2,3}, {4,5,6}};

        int carpim =1;
        for (int i=0; i < multiArray.length; i++){
            for (int j=0; j< multiArray[i].length; j++){
                carpim *= multiArray [i][j];
                System.out.println("Sayilarin carpimi : " + carpim);
            }
        }




    }
}
