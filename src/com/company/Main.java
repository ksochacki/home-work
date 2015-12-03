package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * program do obicznia rat.
         * oprocentowanie
         * 6-12 2,5%
         * 13-24 5%
         * 25-48 10%
         */
        System.out.println("Witaj w programie do liczenia rat.");
        System.out.println("Podaj cene towaru (zakres do 100 do 10 000 zl). ");
        Scanner wpiszcena = new Scanner(System.in);
        int cena = Integer.parseInt(wpiszcena.nextLine());
        System.out.println("podaj liczbe rat od 6 do 48");
        Scanner scanner1 = new Scanner(System.in);
        int rata = scanner1.nextByte();
        /** oprocentowanie
         */
        double a = 2.5 / 100;
        double b = 5 / 100;
        double c = 10 / 100;
        /**
         * przelicznik oprocentowania + kwota na rate
         */
        double Cena1 = cena + (cena * a);
        double Kwota1 = Cena1 / rata;
        double Cena2 = cena + (cena * b);
        double Kwota2 = Cena2 / rata;
        double Cena3 = cena + (cena * c);
        double Kwota3 = Cena3 / rata;


        if (6 <= rata && rata >= 12) {
            System.out.println("Przy " + rata + " ratach. Calkowita kwota do splaty bedzie wynosic " + Cena1 + " zl,");
            System.out.println("a kwota na rate bedzie wynosic " + Kwota1 + " zl.");
        } else if (13 <= rata && rata <= 24) {
            System.out.println(" Przy " + rata + " ratach. Calkowita kwota do splaty bedzie wynosic " + Cena2 + " zl,");
            System.out.println("a kwota na rate dedzie wynosic " + Kwota2 + " zl.");
        } else if (25 <= rata && rata <= 48) {
            System.out.println("Przy " + rata + " ratach .Calkowita kwota do splaty bedzie wynoscic " + Cena3 + " zl,");
            System.out.println(" a kwota na rate bedzie wynosic " + Kwota3 + " zl.");
        } else
            System.out.println("Nie dotyczy");


    }


}




