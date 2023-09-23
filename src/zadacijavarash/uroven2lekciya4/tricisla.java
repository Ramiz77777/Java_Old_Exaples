package zadacijavarash.uroven2lekciya4;

import java.util.Scanner;

/*
Три числа
Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.

Примеры:
a) при вводе чисел 1 2 2 получим вывод 2 2

b) при вводе чисел 2 2 2 получим вывод 2 2 2
Требования:
•	Программа должна считывать три числа c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если два числа равны между собой, необходимо вывести их на экран.
•	Если все три числа равны между собой, необходимо вывести все три.
•	Если нет равных чисел, ничего не выводить.
Во время проверки возникла ошибка
Эта задача уже была решена.

Input data
4
6
6

 */
public class tricisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstnumber = scanner.nextInt();
        int secondnumber = scanner.nextInt();
        int thirdnumber = scanner.nextInt();
        if(firstnumber == secondnumber && firstnumber != thirdnumber){
            System.out.println(firstnumber + " " + secondnumber);
        } else if (firstnumber == thirdnumber && firstnumber !=secondnumber) {
            System.out.println(firstnumber + " " + thirdnumber);
        }else if (secondnumber == thirdnumber && secondnumber != firstnumber) {
            System.out.println(secondnumber + " " + thirdnumber);
        }
        else if(firstnumber == secondnumber && firstnumber == thirdnumber){
            System.out.println(firstnumber + " " + secondnumber + " " + thirdnumber);
        }
    }
}
