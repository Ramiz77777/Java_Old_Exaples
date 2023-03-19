package praktikavsego;

import lesson6.UserInput;

import java.util.Scanner;

public class IfELse2 {
    public static void main(String[] args) {
        System.out.println("+ for making plus operation");
        System.out.println("- for making minus operation");
        System.out.println("* for making umnojeniye operation");
        System.out.println("/ for making deleniye operation");
        Scanner scanner = new Scanner(System.in);
        String ui = scanner.nextLine();

        switch (ui){
            case "+":
                System.out.println("Enter first number");
            int userinputplus = scanner.nextInt();
                System.out.println("Enter second number");
            int userinputseondplus = scanner.nextInt();
            int resultofplus = userinputplus + userinputseondplus;
                System.out.println("Result of plus is " + resultofplus);
            break;
            case "-":
                System.out.println("Enter first number");
                int userinputminus = scanner.nextInt();
                System.out.println("Enter second number");
                int userinputminus2 = scanner.nextInt();
                System.out.println("Result of minus is " + (userinputminus - userinputminus2));
                break;
            case "*":
                System.out.println("Enter first number");
                int userinputumnojeniye1 = scanner.nextInt();
                System.out.println("Enter second number");
                int userinputumnojeniye2 = scanner.nextInt();
                System.out.println("Result of umnojeniye is " + userinputumnojeniye1 * userinputumnojeniye2);
                break;
            case "/":
                System.out.println("Enter first number");
                double userinputdeleniye = scanner.nextInt();
                System.out.println("Enter second number");
                double userinputdeleniye2 = scanner.nextInt();
                System.out.println("Result of deleniye is " + userinputdeleniye / userinputdeleniye2);
            default:
                System.out.println("Please enter correct symbol");
        }
    }
}
