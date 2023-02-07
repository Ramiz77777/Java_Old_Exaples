package lesson5;
//sozdayem class so skanerem ctobi celovek vvodil i vozvrashayem ego

import java.util.Scanner;

public class UserInput {
    String userInputText(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    int userInputInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
    boolean userInputBoolean(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextBoolean();
    }

}

