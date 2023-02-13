package PrimeriIf;

import java.util.Scanner;

public class edekaprimerdemo {
    public static void main(String[] args) {
        edekaprimer fakt = new edekaprimer();
//        fakt.pokupka;
//        fakt.isedekaopen;
//        fakt.isreweopen;
//        fakt.scaner;

        System.out.println("I think you can walk,Can you wall?");
        boolean pokupka = fakt.pokupka;
        System.out.println("is Edeka open?");
        boolean isedekaopen = fakt.isedekaopen;
        System.out.println("is Rewe open?");
        boolean isreweopen = fakt.isreweopen;


    }
}
