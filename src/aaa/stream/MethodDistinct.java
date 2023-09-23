package aaa.stream;

import java.util.List;

public class MethodDistinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,1,2,3);
        list.stream().distinct().peek(e-> System.out.println(e)).map(e->{
            if(e%2 == 0){
                e= e*0;
            }
            return e;
        }).forEach(e-> System.out.println(e));
    }
}
