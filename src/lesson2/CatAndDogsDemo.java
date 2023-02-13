package lesson2;

public class CatAndDogsDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("========-=========");
        cat1.name = "barsik";
        cat1.familie = "koshkina";
        cat1.age = 4;
        cat2.name = "muxa";
        cat2.familie = "moshkina";
        cat2.age = 2;
        dog1.name = "sobaka1";
        dog1.age = 2;
        dog1.liveadress = "kuku strasse";
        dog2.name = "sobaka2";
        dog2.age = 6;
        dog2.liveadress = "xexe strasse";
        System.out.println("cat1name -" + cat1.name + " age is -" + cat1.age + " my surname is -" + cat1.familie);
        System.out.println("cat2name -" + cat1.name + " age is -" + cat1.age + " my surname is -" + cat1.familie);
        System.out.println("dog1name -" + dog1.name + " age is -" + dog1.age + " i live in -" + dog1.liveadress);
        System.out.println("dog2name -" + dog2.name + " age is -" + dog2.age + " and i live in -" + dog2.liveadress);
    }
}
