package PrimeriClassStatic;

public class Person {
    String name;
    int age;
    static String familie;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
   void voice(){
       System.out.println("my name is " + name + "my age is " + age);
    }



//    public String name;
//    public static String town;
}
