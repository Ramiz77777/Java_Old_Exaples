package zadacijavarash.uroven5lekciya3;
/*
В методе main(String[]) тебе нужно заполнить массив strings значениями.
Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная), иначе присвоить "Нечётный".
Вывод текста в консоль в тестировании не участвует.

Требования:
•	В классе Solution должна быть публичная статическая переменная strings типа String[], проинициализированная массивом размером 5 элементов.
•	Метод main(String[]) должен заполнять массив согласно условию.
 */
public class Array2Zadaca {


    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            if(i % 2 == 0) {
                System.out.println(EVEN);
            }else {
                System.out.println(ODD);
            }
        }


//        strings[0] = EVEN;
//        strings[1] = ODD;
//        strings[2] = EVEN;
//        strings[3] = ODD;
//        strings[4] = EVEN;
//
//
//        System.out.print("index = 0");
//        System.out.println(" value = " + strings[0]);
//        System.out.print("index = 1");
//        System.out.println(" value = " + strings[1]);
//        System.out.print("index = 2");
//        System.out.println(" value = " + strings[2]);
//        System.out.print("index = 3");
//        System.out.println(" value = " + strings[3]);
//        System.out.print("index = 4");
//        System.out.println(" value = " + strings[4]);













//        strings[0] = ODD;
//        strings[1] = EVEN;
//        strings[2] = ODD;
//        strings[3] = EVEN;
//        strings[4] = ODD;
//
//
//        System.out.print("index = 0");
//        System.out.println(" value = " + strings[0] );
//        System.out.print("index = 1");
//        System.out.println(" value = " + strings[1] );
//        System.out.print("index = 2");
//        System.out.println(" value = " + strings[2] );
//        System.out.print("index = 3");
//        System.out.println(" value = " + strings[3] );
//        System.out.print("index = 4");
//        System.out.println(" value = " + strings[4]);
        }


    }

