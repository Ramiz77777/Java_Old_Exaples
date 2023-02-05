package Primeri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "Hello world!";
        int len = s.length();
        String s1 = "" + len;
        System.out.println("Длина строки = " + len);
        String s3 = s.substring(0, len / 2);
        System.out.println(s3);




    }
}