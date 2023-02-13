package lesson5;
//sozdayem class s konstruktorom dla obrasheniya

public class Cat {
    String name; //sozdaem tip i kladem tuda premennuyu
    String color;  //sozdaem 2 tip i kladem tuda premennuyu
    int age;  //sozdaem 3 tip i kladem tuda premennuyu
    boolean isHungry;  //sozdaem 4 tip i kladem tuda premennuyu
    //sozdaem konstruktor k etim peremennim

    public Cat(String name, String color, int age, boolean isHungry) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.isHungry = isHungry;
    }
}
