package Primerivsego.massivi;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class massiviprimitivniye {
    public static void main(String[] args) {
            int[] massiv = new int[3];
            massiv[0] = 5;
            massiv[1] = 2;
            massiv[2] = 3;
        for (int i = 0; i < massiv.length ; i++) {

        }
        System.out.println(Arrays.toString(massiv));
        int min = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if(massiv[i] < min){
                min = massiv[i];
            }
        }
        System.out.println("minimalniy massiv; " + min);
        }


        }







//    //        int number =10;
//    int[] numbers = new int[5];
//        for (int i = 0; i < numbers.length; i++) {
//        numbers[i] = i;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//        System.out.println(numbers[i]);
//
//        }
//
//        }

//        int[] data = new int[2];
//        data[0] = 2020;data[1]=2021;
//        System.out.println(Arrays.toString(data));
//          int[] dati ={2021,2022};
////        System.out.println("dati " + Arrays.toString(dati));

//    int[] cisla = new int[3];
//        cisla[0]= 10;
//                cisla[1]=20;
//                cisla[2]=-10;
//                int min = cisla[0];
//                for (int i = 0; i < cisla.length; i++) {
//        if (cisla[i] < min){
//        min = cisla[i];
//        }
//        }
//        System.out.println(min);