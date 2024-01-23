package fordelete.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapEx1 {
    public static void main(String[] args) {
        MyStudent myStudent = new MyStudent("Ramiz",22);
        MyStudent myStudent1 = new MyStudent("Ramiz",22);
        Map<MyStudent,Integer> map1 = new HashMap<>();
        map1.put(myStudent,32);
        map1.put(myStudent1,22);

        System.out.println(map1);
        System.out.println(myStudent.hashCode());
        System.out.println(myStudent1.hashCode());

    }

}
class MyStudent{
    String name;
    int age;

    public MyStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStudent student = (MyStudent) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age) * 11;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
