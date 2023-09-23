package fordelete.CompareTo;

import java.util.ArrayList;
import java.util.List;

public class GenericsMEthod {
    public static <T> T firstElemetOfList(List<T> al){
        return al.get(1);
    }

}
 class Real {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        int a = GenericsMEthod.firstElemetOfList(arraylist);
        System.out.println(a);
    }
}



