package aaa.stream;

import java.util.function.Consumer;

public class rerer {
    public static void main(String[] args) {
        String str = "hello";
        Consumer<String> a = s -> System.out.println(s.toUpperCase());
        a.accept(str);

    }
}
