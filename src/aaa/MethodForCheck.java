package aaa;

import java.util.ArrayList;
import java.util.List;

public class MethodForCheck {
    public static void chechAllStudents(ArrayList<Student> al,Check check){
        for (Student s: al){
            if(check.studentCheck(s)){
                System.out.println(s);
            }
        }
    }
}
