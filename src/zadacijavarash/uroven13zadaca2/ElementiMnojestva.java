package zadacijavarash.uroven13zadaca2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
В классе ElementiMnojestva есть метод print(HashSet<String>), который должен выводить в консоли все элементы множества, используя iterator().
Метод main не участвует в проверке.

Требования:
•	В классе Solution должен быть публичный статический метод print(HashSet<String>) с типом возвращаемого значения void.
•	Метод print(HashSet<String>) должен работать согласно условию.
 */
public class ElementiMnojestva {
    public static void print(HashSet<String> words) {
        Iterator<String> it = words.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //напишите тут ваш код

//        Iterator<String> it = words.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }

}
