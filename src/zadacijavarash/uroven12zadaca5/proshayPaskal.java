package zadacijavarash.uroven12zadaca5;


/*

В методе main найди и удали язык программирования Pascal из списка programmingLanguages.

Требования:
•	В методе main должен удаляться Pascal из списка programmingLanguages.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class proshayPaskal {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //напишите тут ваш код
        programmingLanguages.remove("Pascal");
        System.out.println(programmingLanguages);
    }

    }



