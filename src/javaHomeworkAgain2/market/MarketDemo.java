package javaHomeworkAgain2.market;

import java.util.Scanner;

public class MarketDemo {
    public static void main(String[] args) {
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);
        System.out.println("isrewe open");
        boolean isreweopen = scanner.nextBoolean();
        System.out.println("is edeka open");
        boolean isedekaopen = scanner.nextBoolean();
        if(isreweopen && isedekaopen){
            System.out.println("you can buy in rewe and edeka");
        } else if (isedekaopen && !isreweopen)  {
            System.out.println("can but only in edeka");
        } else if (isreweopen && !isedekaopen)  {
            System.out.println("can buy only in rewe");
        }else {
            System.out.println("seat at home today is sunday");
        }
    }


}
