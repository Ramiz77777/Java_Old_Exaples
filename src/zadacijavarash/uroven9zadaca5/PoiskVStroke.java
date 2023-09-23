package zadacijavarash.uroven9zadaca5;

import java.util.Scanner;

public class PoiskVStroke {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        int index = path.indexOf("//");
        int index2 = path.indexOf("/", index + 2);
        System.out.println(index);
        System.out.println(index2);

        String first = path.substring(0, index + 2);
        String last = path.substring(index2);

        System.out.println(first);
        System.out.println(last);
    }
}
