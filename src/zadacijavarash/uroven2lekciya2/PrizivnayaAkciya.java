package zadacijavarash.uroven2lekciya2;

import java.util.Scanner;

/*
Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя,
 введенное ранее с клавиатуры

 Пример ввода:
Amigo
18
Пример вывода:
Amigo, явитесь в военкомат

 Требования:
•	Программа должна считывать данные с клавиатуры два раза.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст в пределах 18-28 (включительно), то вывести только сообщение "Имя, явитесь в военкомат".
•	Если возраст не находится в указанных пределах, то ничего выводить не нужно.
 */
public class PrizivnayaAkciya {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        int age = scanner.nextInt();
//        if(age >18 && age<=28){
//            System.out.println(name + "явитесь в военкомат");
//        }
//        String militaryCommissar = ", явитесь в военкомат";
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        int age = scanner.nextInt();
//        if(age >18 && age<=28){
//            System.out.println(name + militaryCommissar);
//        }
        String s = "hi";
        String t = new String("hello");
        t = t.intern();
        System.out.println(s==t);
    }

}
