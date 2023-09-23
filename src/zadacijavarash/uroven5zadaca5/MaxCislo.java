package zadacijavarash.uroven5zadaca5;

import java.util.Scanner;

/*
В этой задаче тебе нужно:

Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив array.
Найти максимальное число среди элементов массива.
Требования:
•	В методе main(String[]) считай с клавиатуры число N,
 потом проинициализируй массив array размером N элементов, и заполни числами с клавиатуры.
•	В методе main(String[]) выведи в консоль максимальное число среди элементов массива.
 */
public class MaxCislo {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
//        array = new int[3];
//        Scanner scanner = new Scanner(System.in);
//
//
//        for (int i = 0; i < 3; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            int num = array[i];
//            if (num > max) {
//                max = num;
//            }
//            System.out.println(max);
//        }



//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//
//        array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = Integer.parseInt(scanner.nextLine());
//        }
//
//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            int number = array[i];
//            if (number > max) {
//                max = number;
//            }
//        }
//
//        System.out.println(max);
    }

}