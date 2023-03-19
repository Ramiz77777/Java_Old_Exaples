package lesson9.student.random;

import java.util.Scanner;

public class UserInput {
    public int userinput(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int usersinputnumber = scanner.nextInt();
        return usersinputnumber;
    }
}
