package lesson0;

public class Employee implements Comparable<Employee>{
    private String name;
    private String surname;
    private int id;
    private int salary;

    public Employee(String name,String surname, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotheremployee) {
        int res = this.name.compareTo(anotheremployee.name);
        if(res == 0){
            res = this.surname.compareTo(anotheremployee.surname);
        }
        return res;


    }
}
