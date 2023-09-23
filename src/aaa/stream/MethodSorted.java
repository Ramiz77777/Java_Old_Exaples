package aaa.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodSorted {
    public static void main(String[] args) {
        int[] array = {1,2,345,65,45,32,5317,5,10};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));


        //no esli u teba svoy klass to uje comparable
        StudemtforSorted st1 = new StudemtforSorted(28,1);
        StudemtforSorted st2 = new StudemtforSorted(35,2);
        StudemtforSorted st3 = new StudemtforSorted(23,3);
        ArrayList<StudemtforSorted> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list = (ArrayList<StudemtforSorted>) list.stream().sorted((x, y) -> x.getId()-y.getId()).collect(Collectors.toList());

        list.stream().forEach((l) -> System.out.println(l));
    }

}
class StudemtforSorted{
    private int age;
    private int id;

    public StudemtforSorted(int age, int id) {
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Studemt{" +
                "age=" + age +
                ", id=" + id +
                '}';
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
