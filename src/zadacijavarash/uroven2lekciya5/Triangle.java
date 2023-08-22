package zadacijavarash.uroven2lekciya5;

/*
Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
Для этого тебе нужно:
Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде: "треугольник существует" или "треугольник не существует".
Чтобы это выяснить, нужно сравнить каждую сторону с суммой двух других.
То есть, тебе нужно выполнить три сравнения:

Если в каждом сравнении сторона меньше суммы двух других, то треугольник с такими сторонами существует.
Если хотя бы в одном случае сравнения одна сторона окажется больше или равна сумме двух других,
 то треугольника с такими сторонами не существует.

 Требования:
•	Программа должна считывать три числа c клавиатуры.
•	Программа должна выводить текст на экран согласно условию задачи.
•	Если треугольник с такими сторонами может существовать, необходимо вывести текст: "треугольник существует".
•	Если треугольник с такими сторонами не может существовать, необходимо вывести текст: "треугольник не существует".
 */

import java.util.Scanner;

public class Triangle {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sidea = scanner.nextInt();
        int sideb = scanner.nextInt();
        int sidec = scanner.nextInt();

        if((sidea < sideb + sidec) && (sideb < sidea + sidec) && (sidec < sidea + sideb)){
            System.out.println(TRIANGLE_EXISTS);
        }else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }



















//        Scanner scanner = new Scanner(System.in);
//        int sideA = scanner.nextInt();
//        int sideB = scanner.nextInt();
//        int sideC = scanner.nextInt();
//
//        if ((sideA < sideB + sideC) && (sideB < sideC + sideA) && (sideC < sideA + sideB)) {
//            System.out.println(TRIANGLE_EXISTS);
//        } else {
//            System.out.println(TRIANGLE_NOT_EXISTS);
//        }
    }


}
