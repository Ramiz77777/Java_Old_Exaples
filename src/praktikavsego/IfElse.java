package praktikavsego;

import java.util.Scanner;

//Если температура выше 20 градусов — надеть рубашку
//        Если температура выше 10 градусов и меньше (или равна) 20 — надеть свитер
//        Если температура выше 0 градусов и меньше (или равна) 10 — надеть плащ
//        Если температура ниже 0 градусов — надеть пальт
public class IfElse {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int a = ui.nextInt();
        int b = ui.nextInt();
        if(a>b){
            System.out.println(a);
        } else if (b>a) {
            System.out.println(b);
        }else
            System.out.println("parametri ravni");


    }

}


