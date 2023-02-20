package Javahomework1;

import java.util.Scanner;
//Реализовать программу (метод), который конвертирует указанную сумму в евро в сумму в долларах США
public class EvroToDollardemo {
    public static void main(String[] args) {
        Scanner scan0 = new Scanner(System.in);
        System.out.println("viberite operaciyu ");
        boolean a = scan0.nextBoolean();
        boolean b = scan0.nextBoolean();


        if( a == true ) {
            System.out.println("vvedite summu dollara");
            Scanner scan = new Scanner(System.in);
            double d = scan.nextDouble();
            double e = 0.93;
            System.out.println("summa v evro polucayetsa " + e * d);
        }if ( b == false ){
            System.out.println("vveditesummu v evro");
            Scanner scan2 = new Scanner(System.in);

            double e = scan2.nextDouble();
            double d = 1.07;
            System.out.println("summa v dollarax polucaetsa " + e*d);
        }





        }
    }


//        EvroToDollar o = new EvroToDollar();
//        double x = 1;
//        double y = 1.08;
//        double dollartoevro = o.sum(1,1.08);
//        System.out.println(dollartoevro);