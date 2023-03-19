package javaHomeworkAgain2.kolbi;

import java.util.Scanner;

//Представим, что у нас есть устройство, в котором две колбы.
//        Прибор работает корректно, если температура первой колбы выше 100 градусов,
//        а температура второй колбы меньше 100 градусов. Вы должны написать метод,
//        который проверяет это устройство.
//        Ваша программа должна иметь переменные Temperature1 и Temperature2.
//        В результате он выводит сообщение true или false.
public class KolbiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kolbi kolbi = new Kolbi();
        System.out.println("vvedite gradus 1 kolbi");
        double Temperature1 = scanner.nextDouble();
        System.out.println("vvedite adres 2 kolbi");
        double Temperature2 = scanner.nextDouble();
        Kolbi.chektemp(Temperature1, Temperature2);
    }





}
