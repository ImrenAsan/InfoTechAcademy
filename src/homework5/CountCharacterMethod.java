package homework5;

public class CountCharacterMethod {
    public static void main(String[] args) {
        //”InfotechAcademy1234...!’^.+” String ifadesinde,
        //a.kac harf
        //b.kac rakam
        //c.kac ozel karakter oldugunu ekrana yazdıran
        //karakterSay() metodunu yazınız.

        karakterSay();

    }

    public static void karakterSay (){

        int i, harf, rakam, ozelKarakter;
        harf=rakam=ozelKarakter=0;
        char karakter;

        String ifade1= "InfotechAcademy1234...!’^.+";

        for (i=0; i<ifade1.length(); i++){
            karakter= ifade1.charAt(i);
            if (karakter>='a' && karakter <= 'z' || karakter>='A' && karakter <= 'Z'){
                harf++;
            }
            else if (karakter>='0' && karakter<= '9'){
                rakam++;
            }
            else {
                ozelKarakter++;
            }
        }
        System.out.println("Ifade : " + ifade1);
        System.out.println("Ifade icindeki harf sayisi: " + harf);
        System.out.println("Ifade icindeki rakam sayisi: " + rakam);
        System.out.println("Ifade icindeki diger karakter sayisi: " + ozelKarakter);

    }

}


