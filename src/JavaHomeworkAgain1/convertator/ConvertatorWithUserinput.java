package JavaHomeworkAgain1.convertator;

import java.util.Scanner;

public class ConvertatorWithUserinput {

    public double evrotodollar(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        double userinputcourse = scanner.nextDouble();
        System.out.println("vvedite skolko evro vi xotite pomenat ");
        double usd = scanner.nextDouble();
        System.out.println("vi polucite na ruki ");
        double result = userinputcourse * usd;
        return result;
    }

    public double dollartoevro(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        double userinputcourse = scanner.nextDouble();
        System.out.println("vvedite skolko dollarov vi xotite pomenat ");
        double evro = scanner.nextDouble();
        System.out.println("vi polucite na ruki ");
        double result = userinputcourse * evro;
        return result;
    }
}