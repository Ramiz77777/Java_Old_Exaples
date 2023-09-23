package zadacijavarash.uroven13zadaca1;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

/*
В классе OformlayemVozvrat есть метод arrayToHashSet(String[]),
который должен из переданного массива вернуть HashSet<String> с теми же элементами.
Метод main не участвует в проверке.

Требования:
•	В классе Solution должен быть public static HashSet<String> arrayToHashSet(String[]) метод.
•	Метод arrayToHashSet(String[]) должен быть реализован согласно условию.
 */
public class OformlayemVozvrat {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < strings.length; i++) {
            hashSet.add(strings[i]);
        }
        return hashSet;




    }

}
