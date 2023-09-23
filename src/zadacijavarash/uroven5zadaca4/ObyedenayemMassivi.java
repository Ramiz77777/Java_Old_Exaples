package zadacijavarash.uroven5zadaca4;

import java.util.Arrays;

/*
Реализовать метод main(String[]),
в котором нужно скопировать содержимое массивов firstArray и secondArray в один массив resultArray.
Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
Программа должна правильно обрабатывать массивы любой длины.

Требования:
•	В классе Solution должна быть публичная статическая переменная firstArray типа int[], проинициализированная массивом с 10-ю значениями.
•	В классе Solution должна быть публичная статическая переменная secondArray типа int[], проинициализированная массивом с 10-ю значениями.
•	В классе Solution должна быть публичная статическая переменная resultArray типа int[].
•	Реализуй метод main(String[]) согласно условию.
 */
public class ObyedenayemMassivi {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;


    public static void main(String[] args) {

        resultArray = new int[firstArray.length+secondArray.length];
        for (int i = 0; i < firstArray.length ; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            resultArray[firstArray.length+i] = secondArray[i];
        }
        System.out.println(Arrays.toString(resultArray));

//        resultArray[0] = firstArray;
//        resultArray[1] = secondArray;                                       // sam sdelal cerez dvoyniye massivi
//        System.out.println(Arrays.deepToString(resultArray));
//        }


//        resultArray = new int[firstArray.length + secondArray.length]; //// plusuyesh dlinu
//        for (int i = 0; i < firstArray.length; i++) { //// poka i menshe dlini firstarray idi s plusom
//            resultArray[i] = firstArray[i]; //// i resultarray[i] prisvoy znaceniye firstarray[i]
//        }
//        for (int i = 0; i < secondArray.length; i++) { //// poka i menshe dlinu secondarray
//            resultArray[i + firstArray.length] = secondArray[i]; ////resultarray [i neponal
//        }
//
//        for (int i = 0; i < resultArray.length; i++) {
//            System.out.print(resultArray[i] + ", ");
//        }


    }
}



