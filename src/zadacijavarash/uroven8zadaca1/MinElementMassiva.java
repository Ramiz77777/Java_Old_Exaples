package zadacijavarash.uroven8zadaca1;

import java.util.Arrays;
import java.util.Scanner;

/*
В этой задаче тебе нужно:

Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
В методе min(int[]) обязательно используй метод Math.min(int, int).
Требования:
•	Программа должна считывать числа с клавиатуры.
•	Класс Solution должен содержать только три метода.
•	Метод getArrayOfTenElements() должен считать с клавиатуры 10 чисел, потом вернуть массив размером 10 элементов,
заполненный считанными числами.
Метод min(int[]) должен вернуть минимальный элемент массива, используя метод min(int, int) класса Math.
•	Метод main() должен вызывать метод getArrayOfTenElements().
•	Метод main() должен вызывать метод min(int[]).
 */
public class MinElementMassiva {

        public static void main(String[] args) {
            int[] intArray = getArrayOfTenElements();
            System.out.println(min(intArray));
        }

        public static int min(int[] ints) {
            //напишите тут ваш код
            return 0;
        }

        public static int[] getArrayOfTenElements() {
            //напишите тут ваш код
            return new int[10];
        }
    }
//        int[] intArray = getArrayOfTenElements();
//        System.out.println(Arrays.toString(intArray));
//        System.out.println(min(intArray));
//    }
//
//    public static int min(int[] ints) {
//        int min = ints[0];
//        for(int number : ints){
//            min = Math.min(min,number);
//
//            }
//        return min;
//        }
//
//
//
//    public static int[] getArrayOfTenElements() {
//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[3];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }



