package Ref;

public class Reflection {
    public String name;
    public String surname;
    public int id;

    private double salary;

    public Reflection(){
    }
    public Reflection(String name,String surname,int id){
        this.name= name;
        this.surname = surname;
        this.id = id;
    }

    public Reflection(String name, String surname, int id, double salary) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Reflection{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
    private void salaryMultiplyTwo(double salary){
        salary = salary*2;
        System.out.println(salary);
    }
    public int chanceId(int a){
        a = 2+2;
        System.out.println(a);
        id = id +1;
        System.out.println(id);
        return a ;
    }


}
