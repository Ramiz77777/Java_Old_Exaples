package lesson5;
//sozdayem class s konstruktorom dla obrasheniya

public class Cat {
    String name;
    String color;
    int age;
    boolean isHungry;

    public Cat(String name, String color, int age, boolean isHungry) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.isHungry = isHungry;
    }
}
