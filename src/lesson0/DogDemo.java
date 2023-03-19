package lesson0;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
        dog.name = "etka";
        dog.age = 3;
        dog.ishungry = true;
        dog.voice();
        dog.say("hello");
        System.out.println("name-" + dog.name +  " age-" +  dog.age + " ishungry?-" + dog.ishungry);


    }
}
