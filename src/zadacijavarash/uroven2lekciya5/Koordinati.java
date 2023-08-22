package zadacijavarash.uroven2lekciya5;

import java.util.Scanner;

//Ввести с клавиатуры два целых числа, которые будут координатами точки (первое считанное число - это координата "x",
// а второе - координата "y"). Известно, что точка не лежит на координатных осях OX и OY.
//        Вывести на экран номер координатной четверти, в которой находится данная точка.
/*
Подсказка:
Принадлежность точки с координатами (x, y) к одной из четвертей определяется следующим образом:

для первой четверти x>0 и y>0;
для второй четверти x<0 и y>0;
для третьей четверти x<0 и y<0;
для четвертой четверти x>0 и y<0.
 */
/*
Требования:
•	Программа должна считывать два числа c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если точка находится в первой координатной четверти, вывести "1".
•	Если точка находится во второй координатной четверти, вывести "2".
•	Если точка находится в третей координатной четверти, вывести "3".
•	Если точка находится в четвёртой координатной четверти, вывести "4".
 */
public class Koordinati {
    public static void main(String[] args) {


        Scanner scaner = new Scanner(System.in);
        int xcoordinate = scaner.nextInt();
        int yycoordinate = scaner.nextInt();
        if (xcoordinate > 0 && yycoordinate > 0) {
            System.out.println("1");
        } else if (xcoordinate < 0 && yycoordinate > 0) {
            System.out.println("2");
        } else if (xcoordinate < 0 && yycoordinate < 0) {
            System.out.println("3");
        } else if (xcoordinate > 0 && yycoordinate < 0) {
            System.out.println("4");
        }
    }
}


//        Scanner scanner = new Scanner(System.in);
//        int xcoordinate = scanner.nextInt();
//        int ycoordinate = scanner.nextInt();
//        if (xcoordinate>0 && ycoordinate>0){
//            System.out.println("1");
//        }if (xcoordinate<0 && ycoordinate>0){
//            System.out.println("2");
//        }if (xcoordinate<0 && ycoordinate<0){
//            System.out.println("3");
//        }if(xcoordinate>0 && ycoordinate<0){
//            System.out.println("4");
//        }




