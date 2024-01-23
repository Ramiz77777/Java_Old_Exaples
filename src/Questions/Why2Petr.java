package Questions;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Why2Petr {
    public static void UnderAge(ArrayList<Student> al, Predicate<Student> pr){
        for (Student s : al){
            if(pr.test(s)){
                System.out.println(s);
            }

        }

    }
    public static void main(String[] args) {
        Student student1 = new Student("Ramiz",30,3);
        Student student2 = new Student("Ivan",35,4);
        Student student3 = new Student("Petr",22,2);
        Student student4 = new Student("Mariya",18,1);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        Predicate<Student> StudentUnderAge = e-> e.getAge()<30;
//        UnderAge((list,StudentUnderAge);
        UnderAge((ArrayList<Student>) list, e->e.getAge()<30);               // Pocemu petr pecatayet 2 raza

    }
}
class Student {
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

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }
}
