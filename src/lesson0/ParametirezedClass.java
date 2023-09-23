package lesson0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ParametirezedClass <T>{
    private T value1;
    private T value2;

    public ParametirezedClass(T value1,T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "parametirezedClass{" +
                "value1=" + value1 + value2 +
                '}';
    }
}
class Test {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i <array.length ; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        Iterator<Integer> it = Arrays.stream(array).iterator();
        while (it.hasNext()){
            it.next();
        }



    }

}

