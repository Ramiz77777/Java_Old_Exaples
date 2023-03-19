package Primerivsego.massivi;


import java.util.Arrays;

public class massiviprimitivniye {
    public static void main(String[] args) {
        Catt[] array = new Catt[2];                                 //esli 3 masssiva pocemu null ne pokazivayet takje i 1
        Catt cat1 = new Catt(1,"bobik");
        Catt cat2 = new Catt(2,"tuzik");
//        System.out.println(cat1.id + cat1.name);
        array[0] = cat1;                            //vse cto tut est on kopiruyet v array[0] pocemu obrasheniye ne cerez array.to string ?
        array[1] = cat2;
        for (int i = 0; i <array.length ; i++) {              //i++ = i+1 oshibka ?
            System.out.println(array[i].id + " " + array[i].id);         //pocemu pri array id + array id on plusuyet
        }

        }
    }
            



//        System.out.println(Arrays.toString(massiv));//    double[] massiv = new double[2];
//        massiv[0] = 44444444;
//                massiv[1] = 3444444444;
//                double summamassiva = 0;
//                for (double i = 0; i <massiv.length; i++) {
//        summamassiva = summamassiva + massiv[i];
//        }
//        System.out.println(Arrays.toString(massiv));


//    }


//    int[] arrays = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(Arrays.toString(arrays));
//        for (int i = 0; i < arrays.length; i++) {
//            if(i % 2 == 0){
//                arrays[i] = arrays[i] * 2;
//            }
////            System.out.println(Arrays.toString(arrays));
//        }
//        System.out.println(Arrays.toString(arrays));


//
//public static void main(String[] args) {
//        int[] massivint = new int[3];
//        massivint[0] = 50;
//        massivint[1] = 20;
//        massivint[2] = -10;
//        int min = massivint[0];
//        for (int i = 0; i < massivint.length; i++) {
//        if (massivint[i] < min) {
//        min = massivint[i];
//        }
//
//        }
//        System.out.println(min);
//
//        int max = massivint[0];
//        for (int i = 0; i < massivint.length; i++) {
//        if (massivint[i] > max) {
//        max = massivint[i];
//        }
//        }
//        System.out.println(max);



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