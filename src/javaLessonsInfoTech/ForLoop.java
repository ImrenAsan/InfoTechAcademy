package javaLessonsInfoTech;

public class ForLoop {
    public static void main(String[] args) {
        //ForLoop

        for (int i= 0; i<=10; i++){
            System.out.println(i);
        }

        // 2'ser yada 3'er artirmak icin i++ yerine i=i+2 ya da i= i+3

        // 10 ile 20 arasindaki sayilari aralarindaki sayilari virgül ile ayirarak ayni satirda yazdirin.

        for (int i = 10; i<=30; i++){
            if (i<30){
                System.out.println(i + ",");
            }
            else {
                System.out.println(i);
            }
        }


    }
}
