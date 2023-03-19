package lesson7.IfAplication;


import java.util.Scanner;

//Написать программу, которая:
//        1) запрашивает у пользователя два целых числа из заданного диапазона
//        2) генерирует случайное целое число из заданного диапазона
//        3) сравнивает эти два числа и
//        а) если есть равные значения то выводит соответсвующее уведомление
//        б) если все три разные то также сообщает об этом
//        в) выводи эти числа в виде возрастающей последовательности
// 1) запросить у пользователя первое число из заданного диапазона
//         2) запросить у пользователя первое число из заданного диапазона
//         3) генерация случайного числа из заданного диапазона
//         4) проверка на равенство между числами
//         5) вывод информации "равно" или "не равно"
//         6) вывод в виде возрастающей последовательности
//         */
public class IfAplication {
    public static void main(String[] args) {
        UserInputforAplication ui = new UserInputforAplication();
        int hisfirstnumber = Integer.parseInt(ui.usersnumber("Enter your number between 0 and 2"));
//        int hissecondnumber = Integer.parseInt(ui.usersnumber("Enter your second number between 0 and 2"));



        double a = Math.random();
        if (a == hisfirstnumber){
            System.out.println( "the numbers are equal");
        } else {
            System.out.println("try again");
        }
    }

}
