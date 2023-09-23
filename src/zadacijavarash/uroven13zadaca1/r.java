package zadacijavarash.uroven13zadaca1;

import java.util.*;

public class r {
    public static void main(String[] args) {

//        HashSet<Integer> hasset = new HashSet<>();
//        hasset.add(3);
//        hasset.add(2);
//        hasset.add(2);
//        Iterator<Integer> it = hasset.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//
//
//        System.out.println(it.hasNext());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(234);
        list.add(2234);
        list.add(33);
        list.add(4234);
        list.add(5234);
        list.add(632433);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,2234));
        System.out.println(Collections.min(list));
        int a = 5;
        int b = 10;
        b += b;
        System.out.println(b);
    }
}
