package homework8part2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
       //Q1
        //Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.

        List<String> karakter = new ArrayList<>();
        karakter.add("A");
        karakter.add("C");
        karakter.add("E");
        karakter.add("F");

        System.out.println("String ArrayList: ");
        System.out.println(karakter);



        //Q2
        //indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
        //index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.

        karakter.add("B");
        karakter.add((1), "L");

        System.out.println("String ArrayList is updated: ");
        System.out.println(karakter);


        //Q3
        //  set() methodu kullanarak, E’yi D yapiniz.
        //  ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.

        karakter.set(3, "D");
        System.out.println("String ArrayList is updated again: ");
        System.out.println(karakter);
        // E nin hangi idex te oldugu bilmedigimz duuemda nasil buluruz??

        System.out.println(karakter.indexOf('E'));

        //Q4
        //remove() methodu kullanarak, F’yi siliniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.

        karakter.remove("F");
        System.out.println("String ArrayList without 'F': ");
        System.out.println(karakter);


        //Q5
        //sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
        System.out.println("- - - - - - - - - - - -");
        Collections.sort(karakter);
        for (String i : karakter) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("- - - - -  - - - - - - -  - - - -");


        //Q6
        //contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var olmadigini dogrulayiniz.

        if (karakter.contains("L") && !karakter.contains("M")){
            System.out.println("String ArrayList contains the letter 'L', but not the letter 'M' ! ");
        }

        //Q7
        //size() methodu kullanarak, list’in kac eleman oldugunu ekrana yazdiriniz.

        karakter.size();
        System.out.println(karakter.size());


        //Q8
        //clear() methodu kullanarak, list’deki tum elemanlari siliniz.
        karakter.clear();
        System.out.println("String ArrayList is clear!: ");
        System.out.println(karakter);
        System.out.println("- - - - - - - - - - - - - - - -");


        //Q9
        //isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz.
        System.out.println("Is the String ArrayList empty?: " + karakter.isEmpty());








    }
}
