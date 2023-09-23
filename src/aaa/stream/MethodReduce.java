package aaa.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodReduce {
    public static void main(String[] args) {
        int[] array100 = new int[3];
        array100[0] = 4;
        array100[1] = 3;
        array100[2] = 3;
        int res100 = 0;
        for (int i = 0; i < array100.length ; i++) {

            res100 = array100[i] + res100;

        }
        System.out.println(res100);
        System.out.println("-----------------------------");


        // Stream  не меняет нашу коллекцию
        int [] array = new int[3]; // esli ukazal 5 a napisal 3 by default budet 0 = potomu cto 3,index uje 0
        array[0] = 4;
        array[1] = 3;
        array[2] = 3;

        int res = Arrays.stream(array).reduce((a,e)  -> a*e).getAsInt();
        System.out.println(res);
        System.out.println("-----------------------------");


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(4);
        int res1 = list.stream().reduce((a,e) -> a*e).get();//get vozvrashayet optional.a esli u teba tam elementov nebilo bi sdelay tak
        System.out.println(res1);
        // akkumulator = 2    2    2     8
        // element =     1    1    4


        System.out.println("-----------------------------");
        //esli ne xochesh pisat     .get() to akum u teba doljen bit uje minimum 1
        List<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        int myres = mylist.stream().reduce(1,(a ,e) -> a*e);
        System.out.println(myres); // metod get uje ne nujen tak kak akum u teba uje 1 i on null vernut ne mojet esli tam el net

        System.out.println("-----------------------------");
        List<Integer> lisst = new ArrayList<>();
        Optional<Integer> o = lisst.stream().reduce((a,e) -> a*e);
        if(o.isPresent()){
            System.out.println(o.get());
        }
        else {
            System.out.println("Not Present");
        }
    }

}
