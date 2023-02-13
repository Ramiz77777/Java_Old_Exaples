package Javahomework2.Devices;

import java.util.Scanner;

public class CheckingDevice {


    public static void main(String[] args) {;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please first degrees");
        double Temperatur1 = scanner.nextDouble();
        System.out.println("Enter please second degrees");
        double Temperatur2 = scanner.nextDouble();
        if(Temperatur1 > 100 && Temperatur2 < 100){
            System.out.println("device work correkt");
        } else if (Temperatur1 > 100 && Temperatur2 > 100) {
            System.out.println("device work not correct");
        } if (Temperatur1 < 100 && Temperatur2 < 100) {
            System.out.println("device work not correct");
        } else if (Temperatur1 == 100 || Temperatur2 == 100){
            System.out.println("attention in two flasks is 100 degrees ");
        }

    }

}
