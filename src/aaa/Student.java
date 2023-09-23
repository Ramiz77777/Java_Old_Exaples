package aaa;

import java.util.Comparator;

public class Student {
    String name;
    int age;
    int course;
    double avrgrade;

    public Student(String name, int age, int course, double avrgrade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.avrgrade = avrgrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avrgrade=" + avrgrade +
                '}';
    }




}
