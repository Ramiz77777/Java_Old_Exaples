package zadacijavarash.uroven3lekciya6;
/*
Давай используем цикл for,
 чтобы вывести на экран прямоугольный треугольник из восьмёрок со сторонами (катетами) 10 и 10.
То есть в первой строке должна быть одна 8,
 начиная слева, во второй - две и т.д.

Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888

Требования:
•	Программа должна выводить числа на экран.
•	Программа должна выводить прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
•	В программе необходимо использовать цикл for.
•	Вывод на экран должен происходить в цикле for.
 */
public class RisuyemTreugolnik {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int a = 1 + i;
            for (int j = 0; j <a ; j++) {
                System.out.print(8);
            }
            System.out.println();
        }



//        for (int i = 0; i < 10; i++) { //int i = o poka i menshe 10 pribavlaye + 1
//            int dlina = 1 + i;  dlina = 1 + 0,1,2,3,4,5,6,7,8,9
//            for (int j = 0; j < dlina; j++) {  // j = 0; poka j menshe 1 pecatay 8,poka j menshe 2(tak kak 1+i(1)) pecatay 8,poka j menshe 3 pecatay 8,
//                System.out.print("8");
//
//            }
//            System.out.println();
//        }

    }
}
