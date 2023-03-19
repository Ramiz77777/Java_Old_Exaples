package JavaHomeworkAgain1.calculat;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        System.out.println("choose the operation" + "+");
        System.out.println("choose the operation" + "-");
        System.out.println("choose the operation" + "*");
        System.out.println("choose the operation" + "/");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        switch (userInput){
            case "+":
                Calculator calculator = new Calculator();
                calculator.resultofplus();
                break;
            case "-":
                Calculator calculato2 = new Calculator();
                calculato2.resultofminus();
                break;
            case "*":
                Calculator calculato3 = new Calculator();
                calculato3.umnojeniye();
                break;
            case "/":
                Calculator calculato4 = new Calculator();
                calculato4.deleniye();
                break;
        }

        Calculator calculator = new Calculator();
        calculator.resultofplus();
    }

}
