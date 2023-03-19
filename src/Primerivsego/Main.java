package Primerivsego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "10 20 40 60"; ///pocemu vidit kak a b c
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a+b+c);


        String p = "hello";
        Scanner scanner1 = new Scanner(p);
        System.out.println(scanner1.nextLine());         //scanner1.tokens//scaner1//


        int s = 5;
        Scanner scaner = new Scanner(String.valueOf(s));  //pocemu peredaet tolko tak String.valueOf(s
        System.out.println(scaner.nextInt());


        double ss = 5.5;
        Scanner scaner3 = new Scanner(String.valueOf(ss));
        System.out.println(scaner3.nextDouble());


    }
}

//        String s = "Hello world!";
//        int len = s.length();
//        String s1 = "" + len;
//        System.out.println("Длина строки = " + len);
//        String s3 = s.substring(0, len / 2);
//        System.out.println(s3);