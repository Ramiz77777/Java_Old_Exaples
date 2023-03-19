package lesson0;

public class Dog {
    String name;
    int age;
    boolean ishungry;

    public void voice(){
        System.out.println("gav gav ! ");
    }
    public void say(String message){
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ishungry=" + ishungry +
                '}';
    }
}
