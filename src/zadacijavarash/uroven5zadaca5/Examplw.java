package zadacijavarash.uroven5zadaca5;

import java.util.Arrays;
import java.util.Scanner;

public class Examplw {
    public static void main(String[] args) {
//        int[] array = new int[10];
//        for (int i = 0; i < 10; i++) {
//            array[i] = i;
//        }
//        System.out.println(Arrays.toString(array));



        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
