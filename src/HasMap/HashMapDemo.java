package HasMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapDemo {
    public static void main(String[] args) {
        TreeSet<Student> a = new TreeSet<>();
        Student st1 = new Student("Ramiz",28);
        Student st2 = new Student("Roma",20);
        Student st3 = new Student("Ivan", 4);
        a.add(st1);
        a.add(st2);
        a.add(st3);
        System.out.println(a);
        Student st4 = new Student("Roma",18);
        Student st5 = new Student("Ivan", 43);
        System.out.println(a.subSet(st4,st5));


        }
        }



