package lesson3.constructor;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "piska ";
        dog1.age = 4;
        dog1.voice("ku ku ");
        dog1.say("hello boy ");
        System.out.println("my name is " + dog1.name + " my age is " + dog1.age );



    }
}
