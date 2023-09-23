package aaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("poka");
        list.add("ok");
        list.add("Uchim Java");
        list.add("A imenno Lambdas");
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i,String.valueOf(list.get(i).length()));
//
//        }

        Set<Integer> set = list.stream().map(el -> el.length()).collect(Collectors.toSet());
        System.out.println(set);
        int [] array = {1,2,5,45,6,77,8};
        int[] array2 =  Arrays.stream(array).map(e ->{
            if(e%5 == 0){
                e = e/5;
            }
            return e;
        }).toArray();
        System.out.println(Arrays.toString(array2));


    }
}
