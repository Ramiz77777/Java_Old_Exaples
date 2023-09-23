package fordelete.Lambda;

import java.util.Arrays;
import java.util.Random;

public class MyClassForCalculator {
    public static void main(String[] args) {

        MyInterfaceForCalculator myInterface = ((value1, value2) -> value1+value2);
        MyInterfaceForCalculator myInterface1 = ((value1, value2) -> value1-value2);
        MyInterfaceForCalculator myInterface2 = ((value1, value2) -> value1/value2);
        MyInterfaceForCalculator myInterface3 = ((value1, value2) -> value1%value2);


        System.out.println(myInterface.doresult(3,2));
        System.out.println(myInterface1.doresult(3,2));
        System.out.println(myInterface2.doresult(3,2));
        System.out.println(myInterface3.doresult(3,2));

        System.out.println("--------------");

        for (int i = 0; i < 100; i++) {
            int a = (int) (Math.random() *  (10 -1 + 1 ) + 1);
            System.out.println(a);

        }




        }





}
