package fordelete.CompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentDemo {
    public static void main(String[] args) {
        Students st1 = new Students("Ramiz",29,25);
        Students st2 = new Students("Ivan",23,35);
        Students st3 = new Students("Petr",32,25);
        List<Students> studentsList = new ArrayList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        Collections.sort(studentsList,new Students.NameCompare());
        System.out.println(studentsList);


//        Students st1 = new Students("ramiz",28,3);
//        Students st2 = new Students("Ali",32,2);
//        List<Students> mylsit = new ArrayList<>();
//        mylsit.add(st1);
//        mylsit.add(st2);
//        Collections.sort(mylsit,new Students.AgeCompare());
//        for(Students s : mylsit){
//            System.out.println(s);
//        }
//        double res = check((ArrayList<Students>) mylsit, students -> (double) students.getId());
//        System.out.println(res);
//        mylsit = mylsit.stream().filter(e->e.getAge()<30).collect(Collectors.toList());
//        System.out.println(mylsit);
//        List<Integer> mylist2 = mylsit.stream().map(e-> e.getName().length()).collect(Collectors.toList());
//        System.out.println(mylist2);


    }
//public static double check(ArrayList<Students> list,Function<Students,Double> f){
//        double result = 0;
//        for(Students st: list ){
//            result = result + f.apply(st);
//        }
//        result = result/ list.size();
//        return result;
//}

}
