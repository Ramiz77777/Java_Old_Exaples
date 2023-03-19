package zadacijavarash.luroven2lekciya5;

import java.util.Scanner;

/*
Эта программа написана с использованием тернарного оператора, но не совсем понятно,
 что она делает. Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
Перепиши программу без использования тернарного оператора

Требования:
•	Программа должна считывать число c клавиатуры.
•	Вместо тернарного оператора в программе должен быть использован оператор if.
•	Функционал программы не должен измениться.
 */
public class Ternatiyoperator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        if (number < 5){
//            System.out.println("число меньше 5");
//        } else if (number > 5 ) {
//            System.out.println("число больше 5");
//        }else {
//            System.out.println("число равно 5");
//        }
        String teroperat = number < 5 ? "cislo menshe 5 " : number > 5 ? "number bolshe 5 " : "cislo ravno 5 ";

        System.out.println(teroperat);
    }
}
