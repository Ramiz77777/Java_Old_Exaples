package JavaHomeworkAgain1.convertator;

import java.util.Scanner;

//Реализовать программу (метод), который конвертирует указанную сумму в евро в сумму в долларах США.
public class Convertator {
    public double evrotodollat(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
//        double enterkurs = scanner.nextDouble();
        double evro = scanner.nextDouble();
        double usd = evro * 1.08;
        return usd;
    }
    public double dollartoevro(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
//        double enterkurs = scanner.nextDouble();
        double usd = scanner.nextDouble();
        double evro = usd * 0.94;
        return evro;
    }
}
