package JavaHomeworkAgain1.calculat;

import java.util.Scanner;

//Реализовать программу, выводящую на экран результаты сложения, вычитания,
//умножения и деления двух чисел. Каждая из арифметических операций должна быть реализована как отдельный метод.
public class Calculator {
        Scanner scanner = new Scanner(System.in);
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
        public double resultofplus(){
            System.out.println("enter first number");
            double a = scanner.nextDouble();
            System.out.println("enter second number");
            double b = scanner.nextDouble();
            double c = a + b ;
            System.out.println("resul is " + c);
            return resultofplus();
        }
    public double resultofminus() {
        System.out.println("enter first number");
        double a = scanner.nextDouble();
        System.out.println("enter second number");
        double b = scanner.nextDouble();
        double c = a - b;
        System.out.println("resul is " + c);
        return resultofminus();
    }
    public double deleniye() {
        System.out.println("enter first number");
        double a = scanner.nextDouble();
        System.out.println("enter second number");
        double b = scanner.nextDouble();
        double c = a / b;
        System.out.println("resul is " + c);
        return deleniye();
    }
    public double umnojeniye() {
        System.out.println("enter first number");
        double a = scanner.nextDouble();
        System.out.println("enter second number");
        double b = scanner.nextDouble();
        double c = a * b;
        System.out.println("resul is " + c);
        return umnojeniye();
    }
}