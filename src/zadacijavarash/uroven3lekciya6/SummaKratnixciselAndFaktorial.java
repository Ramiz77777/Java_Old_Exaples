package zadacijavarash.uroven3lekciya6;

import java.util.Scanner;

/*
В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно), кратных multiple.
Для этого используй цикл for.
Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.

Требования:
•	Программа должна вывести в консоль сумму чисел от start (включительно) до end (не включительно), кратных multiple.
•	В программе необходимо использовать цикл for.
•	В цикле for необходимо использовать оператор continue.
 */
public class SummaKratnixciselAndFaktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int mult = scanner.nextInt();
        int sum = 0;
        for (int i = start; i < end; i++) {
            if(i % mult != 0){
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
//        Scanner scanner = new Scanner(System.in);
//        int start = scanner.nextInt();
//        int end = scanner.nextInt();
//        int multiple = scanner.nextInt();
//        int sum = 0;
//        for (int i = start; i < end; i++) {
//            if (i % multiple != 0) {
//                continue;
//            }
//            sum = sum + i;
//        }
//        System.out.println(sum);
/*
vicislayem faktorial=faktorial 3 = 1*2*3
int f = 1;                                     В переменной f будем хранить произведение чисел.
for (int i = 1; i <= 10; i++)                  Цикл от 1 до 10 (включительно).
   f = f * i;                                  Умножаем f на очередное число (результат сохраняем в f).
System.out.println(f);                         Выводим подсчитанную сумму на экран.
 */
    }

    }

