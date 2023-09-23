package aaa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodPeek {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,1,2,3);
        list.stream().distinct().peek(e-> System.out.println(e)).count();
    }


}
