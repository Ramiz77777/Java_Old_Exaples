package aaa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodFilter {
    public static void main(String[] args) {
        // внутри Predicate
        // true false возьми element and check it
        Student st1 = new Student("Ramiz",29,3);
        Student st2 = new Student("Roma",23,1);
        Student st3 = new Student("Ivan",34,2);

        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        List<Student> list2 = list.stream().filter(e-> e.getAge()>30).collect(Collectors.toList());
        System.out.println(list2);

    }


}
class Student{
    private String name;
    private int age;
    private int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
