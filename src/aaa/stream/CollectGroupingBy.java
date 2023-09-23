package aaa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectGroupingBy {
    public static void main(String[] args) {
        StudentforGroupingBy st1 = new StudentforGroupingBy("Ramiz",28,3);
        StudentforGroupingBy st2 = new StudentforGroupingBy("Ivan",23,2);
        StudentforGroupingBy st3 = new StudentforGroupingBy("Petr",19,1);
        StudentforGroupingBy st4 = new StudentforGroupingBy("Shasha",30,4);
        StudentforGroupingBy st5 = new StudentforGroupingBy("Erl",30,4);
        List<StudentforGroupingBy> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        Map<Integer,List<StudentforGroupingBy>> map1 =list.stream().map(el->{el.setName(el.getName().toUpperCase());
            return el;
        })

                .collect(Collectors.groupingBy(e-> e.getCourse()));

        for (Map.Entry<Integer, List<StudentforGroupingBy>> entry : map1.entrySet()){
            System.out.println(entry);
        }
    }
}
class StudentforGroupingBy {
    private String name;
    private int age;
    private int course;

    public StudentforGroupingBy(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentforGroupingBy{" +
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
