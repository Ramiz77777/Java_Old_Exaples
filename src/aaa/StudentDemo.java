package aaa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDemo {
    public static void main(String[] args) {

        Student st3 = new Student("Peter",43,6,9.4);
        Student st2 = new Student("Ivan",35,1,5.2);
        Student st1 = new Student("Ramiz",29,3,8.7);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
//        for (Student s : studentList){
//            System.out.println(s);
//        }
        List<Student> list2 = studentList.stream().filter(el -> el.age > 40 && el.avrgrade> 9).collect(Collectors.toList());
        System.out.println(list2);
//        Collections.sort(studentList,(stud1,stud2) -> stud1.course-stud2.course);
//        System.out.println(studentList);
        System.out.println("----------------------");
//        MethodForCheck.chechAllStudents(studentList, s -> s.avrgrade < 9.0);
    }
}
