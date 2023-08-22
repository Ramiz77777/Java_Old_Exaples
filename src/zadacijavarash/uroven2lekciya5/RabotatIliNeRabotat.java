package zadacijavarash.uroven2lekciya5;

//Напишем программу, которая будет считывать с клавиатуры возраст. Если возраст от 20 до 60 (включительно),
// то выводить ничего не нужно, иначе - вывести фразу "можно не работать".
// Сделать это можно (и нужно!) с помощью только одного оператора if без else.
//
//        Подсказка: используй логический оператор "||" (или).

import java.util.Scanner;

/*
Программа должна считывать одно число c клавиатуры.
Если возраст меньше 20 или больше 60, то нужно вывести фразу "можно не работать".
Если возраст в диапазоне от 20 до 60 (включительно), то выводить ничего не нужно.
В программе должен использоваться один оператор if без else и логический оператор ||.

 */
public class RabotatIliNeRabotat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 20 || age > 60){
            System.out.println("можно не работать");
        }

















//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        if(age < 20 || age > 60)  {
//            System.out.println("можно не работать");
//        }if(age > 20 && age <= 60 ) {
//            System.out.println();
//        }
    }


}
