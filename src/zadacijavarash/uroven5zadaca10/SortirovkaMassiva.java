package zadacijavarash.uroven5zadaca10;

import java.util.Arrays;

/*
Реализуй метод main(String[]), который сортирует массив array по возрастанию.
Для сортировки массива используй метод Arrays.sort(int[]).

Требования:
Реализуй метод main(String[]) согласно условию.
 */
public class SortirovkaMassiva {
    public static int[] array = {9,9, 8, 7, 6, 5, 4, 3, 2, 1,1};

    public static void main(String[] args) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int a = Arrays.binarySearch(array,1);
        System.out.println(a);
    }
}
