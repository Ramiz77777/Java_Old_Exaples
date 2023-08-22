package lesson0;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ramiz","Alasgarov",15,5000);
        Employee emp2 = new Employee("Ivan","Petrov",35,6000);
        Employee emp3 = new Employee("Ivan","Avanov",65,3000);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(" before sorting \n "+list);
        Collections.sort(list);
        System.out.println("After sorting \n " + list);

    }
}
