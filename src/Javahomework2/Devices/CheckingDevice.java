package Javahomework2.Devices;

import java.util.Scanner;
/*
Представим, что у нас есть устройство, в котором две колбы.
Прибор работает корректно, если температура первой колбы выше 100 градусов,
а температура второй колбы меньше 100 градусов. Вы должны написать метод, который проверяет это устройство.
Ваша программа должна иметь переменные Temperature1 и Temperature2. В результате он выводит сообщение true или false.
 */
public class CheckingDevice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please first degrees");
        double Temperatur1 = scanner.nextDouble();
        System.out.println("Enter please second degrees");
        double Temperatur2 = scanner.nextDouble();
        chektemp(Temperatur1, Temperatur2);

    }

    private static void chektemp(double Temperatur1, double Temperatur2) {
        if(Temperatur1 > 100 && Temperatur2 < 100){
            System.out.println("device work correkt");
        } else if (Temperatur1 == 100 && Temperatur2 == 100){
            System.out.println("attention in two flasks is 100 degrees ");
        }else {
            System.out.println("device work false");
        }
    }


}
