package Primerivsego.massivi;

import java.util.Arrays;

//1) Создайте массив из 8 случайных целых чисел из интервала [1;50]
//        Выведите массив на экран в строку
//        Замените каждый элемент с нечётным индексом на ноль
//        Снова выведете массив на экран на отдельной строке
public class MassiviPrimeri {
    public static void main(String[] args) {
        int[] massiv = {5, 20, 25, 33, 36, 42, 45, 48};
        System.out.println(Arrays.toString(massiv));
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(i);
            if(i%2 == 1){
                massiv[i] = 0;

            }

        }
            System.out.println(Arrays.toString(massiv));

    }
}