package fordelete;

import zadaci2.Task_2.txt.StringOperation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        TaskUtil tu = new TaskUtil();

        String[] calendar = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        List<String> calendar1 = Arrays.asList(calendar);

        List<String> list = new java.util.ArrayList<>(List.of(calendar));
        Collections.reverse(calendar1);

        System.out.println(calendar1);

//        System.out.println(Arrays.toString(calendar));
//        tu.reverseWithoutAddArray(calendar);
//        System.out.println(Arrays.toString(calendar));

    }
}
