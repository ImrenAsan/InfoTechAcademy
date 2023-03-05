package javaLessonsInfoTech.Overriding;

import javaLessonsInfoTech.Overriding.Hayvanlar;

public class Kuslar extends Hayvanlar {
    boolean gagasiVarMi= true;
    boolean kanadiVarMi= true;

    void ureme(){
        System.out.println("Kuslar yumurta ile cogalir..");
    }
    void solunum (){
        System.out.println("Kuslar akciger solunumu yapar. ");
    }
}
