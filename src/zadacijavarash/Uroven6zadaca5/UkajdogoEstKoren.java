package zadacijavarash.Uroven6zadaca5;
/*
Метод printSqrt(int[] array) должен выводить корень квадратный для каждого элемента переданного массива.
Но этого не происходит из-за конфликта имен переменных. Исправь имена переменных так, чтобы код компилировался.
В результате работы программа должна выводить в консоли соответствующую строку для каждого элемента массива.

Пример строки:
Корень квадратный для числа 64 равен 8.0

Требования:
•	Код должен компилироваться.
•	Метод printSqrt(int[] array) для каждого элемента массива должен выводить строку согласно условию.
 */
public class UkajdogoEstKoren {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrt = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double a = Math.sqrt(element);
            System.out.println(elementSqrt  + element + " равен " + a);
        }
    }
    }
    /*
    public static void printSqrt(int[] array) {
        String elementSqrt = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];                                                      bez ispravleniy kod ot javarush
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrt + element + " равен " + elementSqrt);
        }
    }
     */

