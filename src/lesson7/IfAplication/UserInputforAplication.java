package lesson7.IfAplication;

import java.util.Scanner;

public class UserInputforAplication {

    public String usersnumber(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

        }



    }
