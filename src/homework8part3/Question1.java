package homework8part3;

public class Question1 {
    public static void main(String[] args) {
        //Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini
        // For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sonuc=1;


        for (int number : numbers ){
            sonuc *= number;
        }
        System.out.println(sonuc);

    }
}
