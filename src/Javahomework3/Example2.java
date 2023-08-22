package Javahomework3;

import java.util.Arrays;
import java.util.Scanner;

//2) Создайте массив из 5 случайных целых чисел из интервала [10;99]
//        Выведите его на экран в строку.
//        Определите и выведите на экран сообщение о том,
//        является ли массив строго возрастающей последовательностью. (отредактировано)
public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++){
            array[i]= scanner.nextInt();
        }
//        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

//        Arrays.sort(array);
//        System.out.println(array);




//        int[] arrays = {555,22,3,44,66};
//        Arrays.sort(arrays);
//        System.out.println(Arrays.toString(arrays));

        /**
        Scanner scanner = new Scanner(System.in);
        int[] array = new int [3];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i <array.length ; i++) {
            int min = array[0];
            if(array[i] >  min){
                System.out.println("massiv vozrastayushiy");
            }else {
                System.out.println("Massiv ne vozrastayushiy");
            }
        }
         */


        }
    }
    


