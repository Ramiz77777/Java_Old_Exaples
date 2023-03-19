package JavaHomeworkAgain1.scaneroperation;

import java.util.Scanner;

//введите 2 слова, используйте сканер, состоящий из четного количества букв (проверьте количество букв в слове).
//Получить (создать) новое слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
public class WordsWithScaner {
    public void scaneroperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first word ");
        String firstword = scanner.nextLine();
        int firstwordlenght = firstword.length();
        System.out.println("Please enter your second word ");
        String secondword = scanner.nextLine();
        int secondwordlenght = secondword.length();
        System.out.println("your first word is ; " + firstword + ", and lenght of this word is ; " + firstwordlenght);
        System.out.println("your second word is ; " + secondword + ", and lenght of this word is ; " + secondwordlenght);
        String firsthalfword = firstword.substring(0,2);
        String endhalfsecondword = secondword.substring(2,4);
        System.out.println(firsthalfword + endhalfsecondword);
    }


        }

