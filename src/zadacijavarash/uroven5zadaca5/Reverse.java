package zadacijavarash.uroven5zadaca5;

import java.util.Arrays;
import java.util.Scanner;

/*
Тебе нужно написать программу, которая:

1-Считывает с консоли целое число N.
2-Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
3- Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.

Каждое число выводить с новой строки. Число N выводить не нужно.
Требования:
•	Программа должна считывать число N и за ним еще N чисел.
•	В классе должен быть метод public static void main(String[]).
•	Нельзя добавлять новые методы в класс Solution.
•	Программа должна выводить введенные N чисел в обратном порядке, если N чётное.
•	Программа должна выводить введенные N чисел в том же порядке, если N нечётное.
 */
public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }if(n % 2 == 0){
            for (int i = array.length - 1 ; i >=  0 ; i--) {
                System.out.println(array[i]);
            }
        }else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }


                }
            }


//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] array = new int[n];
//        for( int i = 0; i < array.length; i++){
//            array[i] = scanner.nextInt();
//        }
//        if (n % 2 == 0) {
//            for (int i = array.length - 1; i >= 0; i--) {
//                System.out.println(array[i]);
//            }
//        } else {
//            for (int i = 0; i < array.length; i++) {
//                System.out.println(array[i]);
//            }
//        }



