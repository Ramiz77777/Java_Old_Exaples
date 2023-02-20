package Primerivsego.whilee;

import java.util.Scanner;

public class Primerwhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x;
        double y;
        boolean otvet = true;
        while(otvet){
            System.out.println("vvedi 1 cislo");
            x = scan.nextDouble();
            System.out.println("vvedi 2 cislo");
            y = scan.nextDouble();
            System.out.println("result " + (x+y));
            if (( x<= 0 ) && ( y<=0 )){
                otvet = false;
            }if(x + y > 1000){
                otvet = false;
            }

        }
    }

}
//    int x = 5;
//        while(x <= 7){
//            System.out.println("x  " + x);
//            x++;
//        }