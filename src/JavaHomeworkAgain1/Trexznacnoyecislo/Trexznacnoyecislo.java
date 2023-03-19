package JavaHomeworkAgain1.Trexznacnoyecislo;

import java.util.Scanner;

//**. Дано трехзначное число.
//        Математическими операциями получить значение и вывести на экран все цифры этого числа по одной
public class Trexznacnoyecislo {
    public void threenumber(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int firstnumber = scanner.nextInt();
        String num = String.valueOf(firstnumber);
        System.out.println(num.charAt(0));
        System.out.println(num.charAt(1));
        System.out.println(num.charAt(2));
    }
}
