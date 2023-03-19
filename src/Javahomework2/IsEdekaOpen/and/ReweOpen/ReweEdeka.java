package Javahomework2.IsEdekaOpen.and.ReweOpen;

import java.util.Scanner;

public class ReweEdeka {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("I think you can walk,Can you wall?");
        boolean pokupka = scaner.nextBoolean();
        System.out.println("is Edeka open?");
        boolean isedekaopen = scaner.nextBoolean();
        System.out.println("is Rewe open?");
        boolean isreweopen = scaner.nextBoolean();

        if(isedekaopen && isreweopen){
            System.out.println("you can go in edeka and rewe market");
        } else if (isedekaopen && !isreweopen) {
            System.out.println("you can go only in edeka");
        } else if (isreweopen && !isedekaopen) {
            System.out.println("you can go only in rewe");
        }else {
            System.out.println("seat at home today is sunday");
        }


//        if (true != pokupka) {
//            System.out.println("im so sorry i can not help you you cant walk ");
//
//        }else if(isedekaopen && isreweopen){
//            System.out.println("Rewe and Edeka is open you can choose");
//        }else{
//            System.out.println("You can go in one open markt");
//        }


    }



    }


//    String isreweopen;
//    String isedekaopen;
//    boolean canbuy = true;

//        if(isedekaopen && isreweopen){
//            System.out.println("you can go in market");