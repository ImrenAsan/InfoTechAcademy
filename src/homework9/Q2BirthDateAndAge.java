package homework9;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Q2BirthDateAndAge {
    //Question2:
    //Kullanicidan dogum tarihini isteyin ve yasini;
    //a) Gun, ay, yil olarak yasHesapla() static void metodu’ nda,
    //b) Sade ay olarak ay() non-static void metodu’ nda,
    //c) Sadece gun olarak gun() non-static String donuslu method’ unda,
    //hesaplayiniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);


    }
    static void yasHesapla (int year, int month, int dayOfMonth){
        LocalDate curDate= LocalDate.now();
        LocalDate birthDate= LocalDate.of(year, month, dayOfMonth);

        Period period = Period.between(birthDate, curDate);
        System.out.println("Your age is %d years %d months and % days." +  period.getYears() + period.getMonths() +  period.getDays());
    }

    void ay (int year, int month, int dayOfMonth){
        LocalDate today = LocalDate.now();
        LocalDate bDate = LocalDate.of(year, month, dayOfMonth);
        Period age = Period.between(today, bDate);
        System.out.println("Your age is %d months. " + age.getMonths());
    }

    String day (int year, int month, int dayOfMonth){

        LocalDate jetzt = LocalDate.now();
        LocalDate input = LocalDate.of(year, month, dayOfMonth);

        Period alt = Period.between(jetzt, input);
        System.out.println("Your age is %d days. " + alt.getDays());

        return alt.toString();

    }



}
