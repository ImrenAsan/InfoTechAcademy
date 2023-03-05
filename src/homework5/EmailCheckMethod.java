package homework5;

import java.util.Scanner;

public class EmailCheckMethod {

    public static void emailCheck(String email){

        if (!email.contains("@")) {
            System.out.println("Gecersiz bir email adresi girdiniz");
        }
        else if (!email.contains("@gmail")) {
            System.out.println("Lutfen gmail adresinizi giriniz: ");
        }
        else if (!email.endsWith("@gmail.com")) {
            System.out.println("Yazimda bir hata var, mailinizi kontrol ediniz!");
        }
        else {
            System.out.println("E-mail adresiniz basari ile tamamlandi: " + email);

        }

    }

    public static void main(String[] args) {
        //Kullanicidan e mail hesabini girmesini isteyiniz. Bu e mail’ i
        //olusturacaginiz method' a arguman olarak gonderip asagidaki kurallara
        //gore e mail kontrolu yapiniz.

        //@ isareti icermiyorsa “gecersiz email” yazdirin
        //-@gmail icermiyorsa “lutfen gmail adresinizi girin” yazdirin
        //-@gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
        //yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen e-mail adresinizi giriniz: ");
        String email = scan.nextLine();

        emailCheck(email);

    }
}
