package zadacijavarash.uroven9zadaca6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SplitExample {
    public static void main(String[] args) {
        String message = "privet kak dela cto novogo ? ";
        String[] words = message.split(" ",2);
        System.out.println(Arrays.toString(words));



        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(a," ");

            while (stringTokenizer.hasMoreElements()){
                System.out.println(stringTokenizer.nextToken());
            }

    }
}
