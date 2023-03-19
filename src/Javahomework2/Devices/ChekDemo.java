package Javahomework2.Devices;

import java.util.Scanner;

/*
Представим, что у нас есть устройство, в котором две колбы.
Прибор работает корректно, если температура первой колбы выше 100 градусов,
а температура второй колбы меньше 100 градусов. Вы должны написать метод, который проверяет это устройство.
Ваша программа должна иметь переменные Temperature1 и Temperature2. В результате он выводит сообщение true или false.
 */
public class ChekDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChekMetod chekMetod = new ChekMetod();
        int temperature1 = scanner.nextInt();
        int temperature2 = scanner.nextInt();
        ChekMetod.extracted(temperature1, temperature2);
    }



}
