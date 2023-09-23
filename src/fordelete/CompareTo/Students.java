package fordelete.CompareTo;

import java.util.Comparator;

public class Students implements Comparable<Students>{
    private String name;
    private int age;
    private int id;

    public Students(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Students o) {
        return this.id-o.id;
    }
    static class NameCompare implements Comparator<Students> {

        @Override
        public int compare(Students o1, Students o2) {
            return o1.name.compareTo(o2.name);
        }
    }
    static class AgeCompare implements Comparator<Students> {

        @Override
        public int compare(Students o1, Students o2) {
            return o1.age-o2.age;
        }
    }

}
