package aaa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodMap {
    public static void main(String[] args) {
        // Stream  не меняет нашу коллекцию
        // .collect(Collectors.toList()); чтобы присвоить это листу
        // внутри интерфасе function  возьми элемент и сделай с ним это
        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Poka");
        list.add("ok ");
        list.add("Uchim Stream");
        List<Integer> list2 = list.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(list2);
        
    }

}
