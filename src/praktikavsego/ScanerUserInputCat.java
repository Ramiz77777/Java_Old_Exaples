package praktikavsego;

import java.util.Scanner;

public class ScanerUserInputCat {
    String userinputteext(String message) {
        Scanner scaner = new Scanner(System.in);
        System.out.println(message);
        return scaner.nextLine();
    }

    int userinputint(String message) {
        Scanner scaner = new Scanner(System.in);
        System.out.println(message);
        return scaner.nextInt();
    }
        boolean userinputboolean (String message){
            Scanner scaner = new Scanner(System.in);
            System.out.println(message);
            return scaner.nextBoolean();

        }
    }
