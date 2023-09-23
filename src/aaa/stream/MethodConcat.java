package aaa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MethodConcat {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("p","r","i");
        Stream<String> s2 = Stream.of("v","e","t");
        Stream<String> s3 = Stream.concat(s1,s2);
        s3.forEach(e-> System.out.println(e));

//        List<String> list = List.of("p","r","i");
//        List<String> list2 = List.of("v","e","t");                     tak ne polucayetsa
//        List<String> list3 = new ArrayList<>();
//        Stream<String> stream = Stream.concat(list,list2)
    }
}
