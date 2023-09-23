package fordelete;

import lesson11.TablicaUmnojeniya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        TablicaUmnojeniya sd = new TablicaUmnojeniya();
//        int[][] array = {{10, 15, 20}, {-2, 3, -5}, {5, 7, 66}, {26, 35, -53}};
//        int actualmax = 66;
//        int actualmin = -53;
//        int actualminel = sd.findmin(array);
//        int actualmaxelement = sd.findmax(array);
//
//        if (actualmax == actualmaxelement) {
//            System.out.println("test 1 is ok");
//        } else {
//            System.out.println("expected " + actualmaxelement + " but foundet " + actualmax);
//        }
//        if (actualmin == actualminel) {
//            System.out.println("test 1 is ok");
//        } else {
//            System.out.println("expected " + actualminel + " but foundet " + actualmin);
//        }
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(333);
        list.add(18);
        List<Integer> secondlist = list.stream().map(element-> {
            if(element%3 == 0){
                element = element/3;

            }
            return element;
        }).collect(Collectors.toList());
        System.out.println(secondlist);
    }

}
