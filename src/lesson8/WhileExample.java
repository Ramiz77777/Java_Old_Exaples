package lesson8;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        boolean usloviye = true;
        while (usloviye){
            System.out.println("enter first number");
            x = scanner.nextInt();
            System.out.println("Enter second number");
            y = scanner.nextInt();
            System.out.println("result is " +  (x +y));
            if (x == 0){
                usloviye = false;
                System.out.println("end operation");
            } else if (y == 0) {
                usloviye = false;
                System.out.println("end operation");
            }
        }
    }
}
