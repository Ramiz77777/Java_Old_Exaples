package zadacijavarash.uroven13zadaca1;

import java.util.HashSet;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Привет");
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Cialo");
        set.add("Namaste");

        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        if (set.contains(str))
            System.out.println("Да спаткання!");
    }

}
