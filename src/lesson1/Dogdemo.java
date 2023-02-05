package lesson1;

public class Dogdemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "zevs";
        System.out.println(dog1.name);

        dog1.voice();

        dog1.say("my name is -" + dog1.name);
        dog1.say("listen you me ? " + dog1.name);
    }


}

