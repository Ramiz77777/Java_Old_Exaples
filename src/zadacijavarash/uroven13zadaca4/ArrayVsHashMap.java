package zadacijavarash.uroven13zadaca4;

import java.util.ArrayList;
import java.util.HashMap;

/*
В классе ArrayVsHashMap есть метод getProgrammingLanguages, который возвращает список языков программирования.
 Тебе нужно переписать этот метод, чтобы он возвращал HashMap<Integer, String>
  Ключом в этой коллекции будет индекс элемента в ArrayList.

Требования:
•	В классе Solution должен быть публичный статический метод getProgrammingLanguages с типом возвращаемого значения HashMap<Integer, String>.
•	Метод getProgrammingLanguages() должен возвращать HashMap заполненным в соответствии с списком.
 */
public class ArrayVsHashMap {
    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static ArrayList<String> getProgrammingLanguages() {
        //напишите тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
        return programmingLanguages;
    }
//    public static HashMap<Integer,String> getProgrammingLanguagess(){
//        HashMap<Integer,String> hashMap = new HashMap<>();
//        hashMap.put(0,"Java");
//        hashMap.put(1,"Kotlin");
//        hashMap.put(2,"Go");
//        hashMap.put(3,"Javascript");
//        hashMap.put(4,"Typescript");
//        hashMap.put(5,"Python");
//        hashMap.put(6,"PHP");
//        hashMap.put(7,"C++");
//        return hashMap;
//
//    }
}
